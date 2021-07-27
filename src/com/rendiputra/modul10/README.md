# Modul 10: SORTING #1

## Dasar Teori

### Sorting
Pengurutan data (sorting) didefinisikan sebagai suatu proses untuk menyusun kembali himpunan obyek menggunakan aturan tertentu. Menurut Microsoft Book-shelf, definisi algoritma pengurutan adalah algoritma untuk meletakkan kumpulan elemen data ke dalam urutan tertentu berdasarkan satu atau beberapa kunci dalam tiap-tiap elemen.

Ada dua macam urutan yang biasa digunakan dalam proses pengurutan yaitu:
- Urut naik (ascending) yaitu dari data yang mempunyai nilai paling kecil sampai paling besar.
- Urut turun (descending) yaitu data yang mempunyai nilai paling besar sampai paling kecil.

Keuntungan dari data yang sudah dalam keadaan terurutkan antara lain:
- Data mudah dicari (misalnya dalam buku telepon atau kamus bahasa), mudah untuk dibetulkan, dihapus, disisipi atau digabungkan. Dalam keadaan terurutkan, kita mudah melakukan pengecekan apakah ada data yang hilang.
- Melakukan kompilasi program komputer jika tabel-tabel simbol harus dibentuk.
- Mempercepat proses pencarian data yang harus dilakukan berulang kali.

Data yang diurutkan sangat bervariasi, dalam hal jumlah data maupun jenis data yang akan diurutkan. Tidak ada algoritma terbaik untuk setiap situasi yang kita hadapi, bahkan cukup sulit untuk menentukan algoritma mana yang paling baik untuk situasi tertentu karena ada beberapa faktor yang mempengaruhi efektifitas algoritma pengurutan.

Beberapa faktor yang berpengaruh pada efektifitas suatu algoritma pengurutan antara lain:
- banyak data yang diurutkan.
- kapasitas pengingat apakah mampu menyimpan semua data yang kita miliki.
- tempat penyimpanan data, misalnya piringan, pita atau kartu, atau media penyimpan
yang lain.


### Bubble Sort
- Konsep dari ide dasarnya adalah seperti “gelembung air” untuk elemen struktur data yang semestinya berada pada posisi awal.
- Cara kerjanya adalah dengan berulang-ulang melakukan traversal (proses looping) terhadap elemen-elemen struktur data yang belum diurutkan.
- Di dalam traversal tersebut, nilai dari dua elemen struktur data dibandingkan. Jika ternyata urutannya tidak sesuai dengan “pesanan”, maka dilakukan pertukaran (swap).

### Selection Sort
- Ide dasarnya adalah melakukan beberapa kali pass untuk melakukan penyeleksian elemen struktur data.
- Untuk sorting ascending (menaik), elemen yang paling kecil di antara elemen-elemen yang belum urut, disimpan indeksnya, kemudian dilakukan pertukaran nilai elemen dengan indeks yang disimpan tersebut dengan elemen yang paling depan yang belum urut.
- Sebaliknya, untuk sorting descending (menurun), elemen yang paling besar yang disimpan indeksnya kemudian ditukar.

### Insertion Sort
- Cara kerjanya pertama dilakukan iterasi, dimana di setiap iterasi insertion sort memindahkan nilai elemen, kemudian menyisipkannya berulang-ulang sampai ke tempat yang tepat.
- Begitu seterusnya dilakukan. Dari proses iterasi, seperti biasa, terbentuklah bagian yang telah di-sorting dan bagian yang belum.