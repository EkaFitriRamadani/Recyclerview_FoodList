package com.example.foodlist;

import java.util.ArrayList;

public class FoodDataSource {
    private static String[] foodNames = {
            "Kimbab",
            "Bibimbap",
            "Bulgogi",
            "Tteokbokki",
            "Bungeoppang",
            "Hobakjuk",
            "Chapssal",
            "Sundubu Jjigae",
            "Haejangguk",
            "Tangsuyuk"
    };

    private static String[] foodDetails = {
            "Nasi yang digulung dengan gim atau rumput laut kering yang di dalamnya berisi sayuran seperti wortel, bayam, timun, kemudian telur dan daging itu disebut dengan kimbab. Belakangan ini makanan korea ini juga sangat populer di Indonesia dan Anda pun bisa membuatnya sendiri di rumah, karena sekarang sama sekali tidak sulit untuk mendapatkan gim atau rumput laut kering dan penggulung kimbab di Indonesia, sedangkan bahan-bahan di dalamnya semua bisa Anda temukan dengan mudah di pasar atau supermarket.",
            "Jika diartikan, maka bibimbap berarti nasi campur dan sesuai dengan namanya itu memang makanan korea ini merupakan nasi yang dicampur dan diaduk dengan berbagai macam lauk pauk yang ada di atasnya. Biasanya pada saat penyajiannya, bibimbap belum dalam keadaan teraduk, lauk pauk disusun dengan cantik di atasnya dan pelanggan harus mengaduk sendiri nasi beserta lauk pauknya itu. Disebutkan bahwa biasanya ada 7 macam jenis sayuran yang ada dalam bibimbab yang kemudian dicampur dengan daging dan telur atau tahu. Makanan ini harus langsung dilahap dalam keadaan hangat sehingga rasanya lebih lezat.",
            "Makanan korea yang satu ini pun tak kalah populernya dari berbagai makanan yang sudah disebutkan sebelumnya. Makanan ini merupakan daging sapi yang dipotong-potong dengan tipis dan kemudian dipanggang setelah dibumbuni dengan berbagai bumbu yang sangat khas sehingga menjadikan daging yang dipanggang itu menjadi sangat lezat. Ketika sudah matang nantinya bulgogi akan disajikan dengan taburan biji wijen di atasnya. Di Indonesia pun kini bahkan ada banyak mie instan dengan rasa bulgogi.",
            "Makanan ini berupa kue beras atau tteok yang kemudian dicampur dengan saus khas Korea dan terkadang ada yang mencampurnya dalam ramyeon atau pun dicampur dengan sosis dan daging. Makanan ini rasanya pedas dan manis. Bisa dikatakan tteokbokki ini adalah sejenis makanan ringan yang berasal dari Korea.",
            "Bungoeppang adalah kue manis berbentuk ikan yang di dalamnya terdapat selai kacang merah. Biasanya disajikan dalam keadaan panas seperti bakpao. Pada saat musim dingin makanan ini sangat populer dan banyak dijual oleh warung-warung di pinggir jalan.",
            "Hobak berarti labu dan juk berarti bubur, jadi dalam bahasa Indonesia hobakjuk adalah bubur labu. Sesuai dengan namanya itu makanan korea memang merupakan bubur yang dibuat dengan bahan dasar labu, disajikan dalam keadaan hangat dan rasanya sangat lezat.",
            "Chapssal adalah roti khas Korea yang konsepnya mirip dengan donat karena ditaburi dengan gula halus di luarnya. Roti ini terbuat dari beras dan di dalamnya terdapat berbagai isian, biasanya isian yang ada di dalam Chapssal khas Korea adalah kentang manis, namun ada juga yang berisi kacang merah. Teksturnya sedikit krispi di bagian luar karena roti ini dibuat dengan cara digoreng namun ketika Anda menemukan isian yang ada di dalamnya maka rasanya akan lebih lembut dan manis.",
            "Sundubu jjigae ini adalah makanan korea yang berupa sup. Kebanyakan sup yang dibuat di Korea bercitarasa pedas, begitu juga dengan sup yang satu ini. Sundubu jjigae memiliki isian di dalamnya yaitu tahu yang bertekstur amat lembut sehingga di Korea disebut dengan tahu sutera. Selain itu ada beberapa sayuran di dalamnya dan kaldu supnya sendiri terbuat dari kaldu daging sapi yang sangat lezat dan bercitarasa.",
            "Sup ini berisi jeroan dan daging sapi yang dimasak dengan berbagai bumbu yang khas sehingga kaldu sup ini begitu bercitarasa tinggi. Di Korea masyarakatnya memiliki kebiasaan untuk memberikan haejangguk ini sebagai sup penghilang mabuk di pagi hari kepada orang yang malam sebelumnya baru saja meminum minuman keras. Sup ini sangat lezat saat disajikan dalam keadaan hangat. Ada banyak restoran di Korea yang menyajikan makanan berupa sup ini.",
            "Tangsuyuk ini adalah makanan korea berupa tumisan daging dengan saus asam manis yang sangat lezat. Namun jika yang Anda cari adalah makanan yang halal maka sebaiknya Anda mencari restoran yang menjual tangsuyuk dengan menggunakan daging sapi, karena kebanyakan tangsuyuk lebih sering menggunakan daging babi daripada daging sapi. Sehingga jika Anda datang ke Korea dan ingin mencoba tangsuyuk, pastikan Anda memilih resto yang menyajikan tangsuyuk dengan daging sapi."
    };

    private static int[] foodsImages = {
            R.drawable.kimbab,
            R.drawable.bibimbap,
            R.drawable.bulgogi,
            R.drawable.tteokbokki,
            R.drawable.bungeoppang,
            R.drawable.hobakjuk,
            R.drawable.chapssal,
            R.drawable.sundubu_jjigae,
            R.drawable.haejangguk,
            R.drawable.tangsuyuk
    };

    static ArrayList<Food> getListData() {
        ArrayList<Food> list = new ArrayList<>();
        for (int position = 0; position < foodNames.length; position++) {
            Food food = new Food();
            food.setName(foodNames[position]);
            food.setDetail(foodDetails[position]);
            food.setPhoto(foodsImages[position]);
            list.add(food);
        }
        return list;
    }
}
