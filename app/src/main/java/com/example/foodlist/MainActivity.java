package com.example.foodlist;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<Food> foods = new ArrayList<>();

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rv_food);
        recyclerView.setHasFixedSize(true);
        foods.addAll(FoodDataSource.getListData());
        showRecycleList();
    }

    private void showRecycleList() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ListFoodAdapter listFoodAdapter = new ListFoodAdapter(foods);
        recyclerView.setAdapter(listFoodAdapter);

        listFoodAdapter.setOnItemClickCallback(new ListFoodAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Food data) {
                showSelectedFood(data);
            }
        });
    }
    private void showSelectedFood(Food food) {
        Toast.makeText(this, "Kamu memilih " + food.getName(), Toast.LENGTH_SHORT).show();
    }
}