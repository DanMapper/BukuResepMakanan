package com.example.recipebook

data class Recipe(
    val title: String,
    val ingredients: List<String>,
    val instructions: String
)

val sampleRecipes = listOf(
    Recipe(
        "Nasi Goreng Sederhana",
        listOf(
            "2 piring nasi putih",
            "2 siung bawang putih (cincang)",
            "2 butir telur",
            "2 sdm kecap manis",
            "Garam secukupnya",
            "Minyak goreng secukupnya"
        ),
        """
        1. Panaskan sedikit minyak di wajan.
        2. Tumis bawang putih hingga harum.
        3. Masukkan telur, orak-arik hingga matang.
        4. Masukkan nasi, aduk rata.
        5. Tambahkan kecap manis dan garam.
        6. Aduk hingga semua tercampur rata, lalu angkat dan sajikan.
        """.trimIndent()
    ),
    Recipe(
        "Telur Dadar",
        listOf(
            "3 butir telur",
            "1 batang daun bawang (iris halus)",
            "Garam secukupnya",
            "Minyak goreng secukupnya"
        ),
        """
        1. Pecahkan telur ke dalam mangkuk.
        2. Tambahkan garam dan daun bawang, lalu kocok hingga rata.
        3. Panaskan sedikit minyak di wajan.
        4. Tuang adonan telur, ratakan.
        5. Masak hingga satu sisi matang, lalu balik.
        6. Angkat jika kedua sisi sudah matang, lalu sajikan hangat.
        """.trimIndent()
    ),
    Recipe(
        "Mie Goreng Instan",
        listOf(
            "1 bungkus mie instan goreng",
            "Air secukupnya",
            "1 butir telur (opsional)",
            "Sayuran (sawi, kol, atau sesuai selera)"
        ),
        """
        1. Rebus mie dalam air mendidih hingga matang, tiriskan.
        2. Jika pakai sayur, rebus sebentar bersama mie.
        3. Campurkan mie dengan bumbu yang sudah disiapkan.
        4. Jika mau, tambahkan telur goreng di atasnya.
        5. Sajikan mie goreng selagi hangat.
        """.trimIndent()
    )
)
