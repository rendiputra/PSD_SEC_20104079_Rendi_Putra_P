# Modul 3

## Dasar Teori

- ### Rekursi

**Rekursi** adalah proses **pengulangan** sesuatu dengan cara **kesamaan-diri**. Sebagai contohnya, saat dua cermin berada paralel antara satu dengan yang lain, gambar yang tertangkap adalah suatu bentuk rekursi tak-terbatas. Istilah ini memiliki makna beragam bergantung kepada ragam disiplin mulai dari linguistik sampai logika. Penggunaan paling umum dari rekursi yaitu dalam **matematika** dan **ilmu komputer**, yang mengacu kepada suatu metode mendefinisikan fungsi yang mana fungsi tersebut menggunakan definisinya sendiri. Secara spesifik hal ini mendefinisikan suatu instansi tak-terbatas (nilai fungsi), menggunakan ekpresi terbatas dengan beberapa instansi bisa merujuk ke instansi lainnya, tetapi dengan suatu cara sehingga tidak ada perulangan atau keterkaitan tak-terbatas dapat terjadi. Istilah ini juga digunakan secara umum untuk menjelaskan suatu proses pengulangan objek dengan cara kesamaan-diri.

Ada 4 aturan dasar rekursi, antara lain:
1. **Base Case**. Anda harus selalu memiliki base case tertentu, yang dapat diselesaikan
   tanpa rekursi.
2. **Making progress**. Untuk kasus yang harus dipecahkan secara rekursif, panggilan
   rekursif harus selalu ada progress menuju base case.
3. **Design Rule**. Asumsikan bahwa semua panggilan rekursif bekerja.
4. **Compound Interest Rule**. Jangan menduplikasi pekerjaan dengan menyelesaikan
   pekerjaan yang sama dari sebuah masalah dalam panggilan rekursif terpisah.

Dalam **matematika** dan **ilmu komputer**, kelas dari objek atau metode memperlihatkan perilaku rekursif bila mereka dapat didefinisikan oleh dua properti berikut:

Sebuah kasus (atau beberapa kasus) dasar sederhana Sejumlah aturan yang mengurangi kasus-kasus lainnya sampai ke kasus dasarnya.
Sebagai contoh, berikut ini adalah definisi rekursif dari leluhur seseorang:

- Orang tua seseorang adalah leluhur seseorang (**kasus dasar**).
- Orang tua dari suatu leluhur juga merupakan leluhur-nya (**langkah rekursi**).

**Bilangan Fibonacci** adalah contoh klasik dari rekursi:

- Fib(0) adalah 0 [**kasus dasar**]
- Fib(1) adalah 1 [**kasus dasar**]
- Untuk semua integer n > 1: Fib(n) adalah (Fib(n-1) + Fib(n-2)) [**definisi rekursif**]


## Praktikum
SOAL LAPORAN PRAKTIKUM:

1. **Soal 1**: Buat method main dan kompilasi kode pada percobaan 1 – 4 serta tuliskan hasilnya!
3. **Soal 2**: Analisa kode pada percobaan 1 – 4!
3. **Soal 3**: Tambahkan kode program pada percobaan 1 – 4 untuk menghitung waktu yang dibutuhkan sehingga bilangan fibonacci ditemukan!
4. **Soal 4**: Hitung waktu yang dibutuhkan untuk mendapatkan hasilnya setelah di modifikasi dengan paramater N=50!

**Jawaban :**

1. [**Link Modul 3**](https://github.com/rendiputra/PSD_SEC_20104079_Rendi_Putra_P/tree/modul3/src/com/rendiputra/modul3/praktikum)

2. Analisa:
- **Percobaan 1**
  Terdapat method fib1 yang memiliki parameter num dengan tipe data long, dan ada percabangan if, dengan kondisi jika (num==0) maka menghasilkan nilai 0. Di kondisi kedua dimana jika (num==1) maka menghasilkan nilai 1. Namun apabila kedua kondisi di atas tidak terpenuhi akan mendeklarasikan variabel x dan y dimana x=0 dan y=1. Lalu melakukan perulangan sampai i<= num. Di dalam pengulangan terdapat operasi untuk menentukan nilai x dan y , yang nantinya akan mengeluarkan nilai dari y. Lalu dijalankan oleh method main dengan dengan membuat variabel inputan dengan int bil = 50 dan sertakan method fib1. Untuk menghitung waktu eksekusi dari program menggunakan variabel start, end, dan relapsed. Variabel relapsed berisi pengurangan dari variabel end dikurang variabel end. Yang akhirnya akan mengeluarkan nilai dari fibonacci dari nilai bil dan waktu eksekusi program.

- **Percobaan 2**
  Terdapat method fib1 yang memiliki parameter n dengan tipe data integer, dan ada percabangan if, dengan kondisi jika (n<=1) maka menghasilkan nilai dari n. Jika kondisinya tidak terpenuhi maka dilakukan rekursi untuk menghasilkan nilai fib2. Lalu dijalankan oleh method main dengan dengan membuat variabel inputan dengan int bil = 50 dan sertakan method fib2. Untuk menghitung waktu eksekusi dari program menggunakan variabel start, end, dan relapsed. Variabel relapsed berisi pengurangan dari variabel end dikurang variabel end. Yang akhirnya akan mengeluarkan nilai dari fibonacci dari nilai bil dan waktu eksekusi program.

- **Percobaan 3**
  Terdapat method fib3 yang memiliki parameter n dengan tipe data integer, dan terdapat best case berupa percabangan if, dengan kondisi jika (n<=1) maka menghasilkan nilai n. Lalu dilakukan pendeklarasian sebagai berikut.
```JAVA
long fib1 = 0;
long fib2 = 1;
long result = 0;
```
Lalu melakukan perulangan sebanyak nilai n, untuk menetapkan nilai result,
fib1, dan fib 2 sebagai berikut.
```JAVA
result = fib2+fib1;
fib1 = fib2;
fib2 = result;
```
Yang akan menghasilkan nilai dari result. Lalu dijalankan oleh method main dengan dengan membuat variabel inputan dengan int bil = 50 dan sertakan method fib3. Untuk menghitung waktu eksekusi dari program menggunakan variabel start, end, dan relapsed.Variabel relapsed berisi pengurangan dari variabel end dikurang variabel start. Yang akhirnya akan mengeluarkan nilai
dari fibonacci dari nilai bil dan waktu eksekusi program.

- **Percobaan 4**
  Terdapat method fib4 yang memiliki parameter n dengan tipe data integer, yang akan menghasilkan nilai dari method fibohelp. Terdapat method fibohelp dengan parameter x, y, n dengan tipe data integer. Didalam method fibohelp akan melakukan percabangan jika n == 0 akan menghasilkan nilai x. Lalu jika n == 1 akan menghasilkan nilai y. Apabila kedua kondisi diatas tidak terpenuhi maka mengeluarkan nilai dari method fibohelp. Terdapat method rekursif dengan parameter pangkat dan bilangan dengan tipe data integer. Didalamnya terdapat percabangan dengan kondisi jika pangkat == 0 maka akan menghasilkan nilai 1. Jika tidak maka akan mengeluarkan nilai dari perhitungan bilangan dikali fungsi rekursif. Lalu dijalankan oleh method main dengan dengan membuat variabel inputan 50 dan sertakan method fib3. Untuk menghitung waktu eksekusi dari program menggunakan variabel start, end, dan relapsed.Variabel relapsed berisi pengurangan dari variabel end dikurang variabel start

3. [**Link Source code hasil modifikasi soal 3**](https://github.com/rendiputra/PSD_SEC_20104079_Rendi_Putra_P/tree/modul3/src/com/rendiputra/modul3/tugas/soal3)

4. [**Link Source code hasil modifikasi soal 4**](https://github.com/rendiputra/PSD_SEC_20104079_Rendi_Putra_P/tree/modul3/src/com/rendiputra/modul3/tugas/soal4)

## Kesimpulan

> Di modul ketiga, materi yang tercakup meliputi perulangan for, percabangan dan rekursi. Selain perulangan for, modul juga membahas tentang aturan dalam menulis rekursi, diantaranya yaitu base case, making progress, design rule, dan compound interest rule.