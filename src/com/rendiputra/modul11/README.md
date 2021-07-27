# Modul 11: SORTING #2

## Dasar Teori

### Merge Sort
Merge sort merupakan algoritma pengurutan dalam ilmu komputer yang dirancang untuk memenuhi kebutuhan pengurutan atas suatu rangkaian data yang tidak memungkinkan untuk ditampung dalam memori komputer karena jumlahnya yang terlalu besar.

Algoritma pengurutan data merge sort dilakukan dengan menggunakan cara divide and conquer yaitu dengan memecah kemudian menyelesaikan setiap bagian kemudian menggabungkannya kembali. Pertama data dipecah menjadi 2 bagian dimana bagian pertama merupakan setengah (jika data genap) atau setengah minus satu (jika data ganjil) dari seluruh data, kemudian dilakukan pemecahan kembali untuk masing-masing blok sampai hanya terdiri dari satu data tiap blok.

Setelah itu digabungkan kembali dengan membandingkan pada blok yang sama apakah data pertama lebih besar daripada data ke-tengah+1, jika ya maka data ke-tengah+1 dipindah sebagai data pertama, kemudian data ke-pertama sampai ke-tengah digeser menjadi data ke-dua sampai ke-tengah+1, demikian seterusnya sampai menjadi satu blok utuh seperti awalnya. Sehingga metode merge sort merupakan metode yang membutuhkan fungsi rekursi untuk penyelesaiannya.

Algoritma dirumuskan dalam 3 langkah berpola divide-and-conquer. Berikut  enjelaskan langkah kerja dari Merge sort.
1. Divide, Memilah elemen – elemen dari rangkaian data menjadi dua bagian.
2. Conquer, Conquer setiap bagian dengan memanggil prosedur merge sort secara rekursif
3. Kombinasi, Mengkombinasikan dua bagian tersebut secara rekursif untuk mendapatkan rangkaian data berurutan.

### Quick Sort 
Quick sort adalah algoritma sorting yang berdasarkan pembandingan dengan metode divide-and conqueror. Disebut Quick Sort, karena Algoritma quick sort mengurutkan dengan sangat cepat. Quick sort disebut juga dengan partition exchange sort, karena konsepnya membuat partisi partisi, dan sort dilakukan per partisi.

Algoritma quick sort mengurutkan dengan sangat cepat, namun algoritma ini sangat komplex dan diproses secara rekursif. Sangat memungkinkan untuk menulis algoritma yang lebih cepat untuk beberapa kasus khusus, namun untuk kasus umum, sampai saat ini tidak ada yang lebih cepat dibandingkan algoritma quick sort.

Walaupun begitu algoritma quick sort tidak selalu merupakan pilihan yang terbaik. Seperti yang telah disebutkan sebelumnya, algoritma ini dilakukan secara rekursif yang berarti jika dilakukan untuk tabel yang berukuran sangat besar, walaupun cepat, dapat menghabiskan memori yang besar pula. Selain itu, algoritma ini adalah algoritma yang terlalu komplex untuk mengurutkan tabel yang berukuran kecil (hanya puluhan elemen misalnya). Selain itu algoritma quick sort mempunyai tingkat efisiensi yang buruk ketika dioperasikan pada tabel yang hampir terurut atau pada tabel yang terurut menurun.

Dalam algoritma quick sort, pemilihan pivot adalah hal yang menentukan apakah algoritma quick sort tersebut akan memberikan performa terbaik atau terburuk.

---
- ## Praktikum

**Soal praktikum:**
1. **Soal 1**:  Buatlah method main untuk menjalankan method-method Sorting!
2. **Soal 2**:  Jalankan masing-masing method dan tuliskan hasilnya!
3. **Soal 3**:  Analisis masing-masing kode pada method Binary Search Tree!
4. **Soal 4**:  Modifikasi method main untuk jumlah input random sejumlah N=100, bandingkan hasil running timenya

---
**Jawaban**

1. [**Soal 1: Link source code file praktikum/Main.java**](https://github.com/rendiputra/PSD_SEC_20104079_Rendi_Putra_P/blob/modul11/src/com/rendiputra/modul11/praktikum/Main.java)


2. **Berikut Capture text hasil dari method main ketika dijalankan:**
```text

---Merge Sort---
Cetak array: 3 5 1 4 2 6 9 7 8 
---mengurutkan array---
Cetak array: 1 2 3 4 5 6 7 8 9 


---Quick Sort---
Cetak array: 3 5 1 4 2 6 9 7 8 
---mengurutkan array---
Cetak array: 1 2 3 4 5 6 7 8 9 

Process finished with exit code 0

```


3. **Analisis method pada class `MergeSort.Java` dan `QuickSort.Java`:**
   
    - Method `merge()`

      Digunakan untuk pengurutan array dengan metode merge sort yaitu dengan cara memecah array kemudian menyelesaikan setiap bagian(pecahannya) lalu digabungkan kembali menjadi satu.

    - Method `printArray()`

      Digunakan untuk mencetak isi array dengan cara melakukan perulangan.

    - Method `quickSort()`
      
      Digunakan untuk pengurutan array dengan cara melakukan pengurutan(sort) per partisi yaitu dengan cara memanggil dirinya sendiri untuk membuat partisi yang selanjutnya akan dilakukan pengurutan didalamnya.

   - Method `swap()`
     
      Digunakan untuk mengganti(swap) posisi pada index array.
     
   - Method `partition()`
     
      Digunakan untuk membandingkan nilai array saat ini dengan nilai pivot apakah nilai (array saat ini < pivot)?, jika iya maka akan dilakukan swap(mengganti) posisi pada index array. Method `partition()` karena bersifat method function maka diakhir baris code, method ini akan mereturn nilai (i+1) yaitu jumlah perulangan yang telah dilakukan.
     
   - Method `sort()`
   
      Digunakan untuk membagi/memecah array dengan cara memanggil dirinya sendiri(rekursif) hingga menyisahkan satu data tiap satu blok, setelah itu digabungkan kembali dengan cara memanggil method `merge()`.  



4. [**Soal 4: Modifikasi method main untuk jumlah input random sejumlah N=100, bandingkan hasil running timenya**](https://github.com/rendiputra/PSD_SEC_20104079_Rendi_Putra_P/blob/modul8/src/com/rendiputra/modul9/tugas/Main.java)
Berikut hasil capture text dari method `main()` yang sudah dimodifikasi:
```text

---Merge Sort---
Cetak array: 126 384 972 581 97 626 168 425 881 996 818 680 344 631 51 981 349 724 350 402 673 483 903 790 981 355 161 558 491 816 233 290 638 161 920 812 13 403 181 682 61 612 566 436 557 772 679 286 682 489 44 390 581 716 866 266 660 972 27 382 515 418 321 488 317 537 384 771 657 121 983 505 384 693 327 454 678 526 852 936 711 907 493 105 517 381 807 724 354 273 413 400 698 930 160 51 197 735 94 115 
---mengurutkan array---
Cetak array: 13 27 44 51 51 61 94 97 105 115 121 126 160 161 161 168 181 197 233 266 273 286 290 317 321 327 344 349 350 354 355 381 382 384 384 384 390 400 402 403 413 418 425 436 454 483 488 489 491 493 505 515 517 526 537 557 558 566 581 581 612 626 631 638 657 660 673 678 679 680 682 682 693 698 711 716 724 724 735 771 772 790 807 812 816 818 852 866 881 903 907 920 930 936 972 972 981 981 983 996 

Elapsed Time: 112500 micro seconds


---Quick Sort---
Cetak array: 365 178 769 891 528 933 704 201 558 156 829 471 215 0 549 253 520 630 676 133 405 863 850 962 75 949 206 359 897 863 21 456 355 964 754 959 606 777 424 653 408 220 536 677 772 539 833 993 492 854 998 719 834 237 62 197 60 898 663 948 109 204 507 916 749 918 345 777 716 265 538 405 894 194 795 973 377 447 4 605 346 871 162 914 21 748 286 256 651 776 838 32 347 742 651 916 852 846 550 446 
---mengurutkan array---
Cetak array: 0 4 21 21 32 60 62 75 109 133 156 162 178 194 197 201 204 206 215 220 237 253 256 265 286 345 346 347 355 359 365 377 405 405 408 424 446 447 456 471 492 507 520 528 536 538 539 549 550 558 605 606 630 651 651 653 663 676 677 704 716 719 742 748 749 754 769 772 776 777 777 795 829 833 834 838 846 850 852 854 863 863 871 891 894 897 898 914 916 916 918 933 948 949 959 962 964 973 993 998 

Elapsed Time: 63500 micro seconds

Process finished with exit code 0
```


---
## Kesimpulan
Dimodul ke-11 ini kita mempelajari apa itu Merge sort dan Quick sort, bagaimana cara pengimplementasian kepada bahasa Java, menganalisis bagaimana proses setiap method dari class `praktikum/MergeSort.java` dan `praktikum/QuickSort.java` bekerja, dan memodifikasi method main untuk mengetahui kecepatan pengurutan antar method sorting.