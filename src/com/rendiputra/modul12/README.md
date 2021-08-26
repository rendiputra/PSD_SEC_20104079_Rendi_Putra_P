# Modul 12: SEARCHING

## Dasar Teori

### Searching
Pencarian data sering juga disebut table look-up atau storage and retrieval information adalah suatu proses untuk mengumpulkan sejumlah informasi di dalam pengingat komputer dan kemudian mencari kembali informasi yang diperlukan secepat mungkin.

Algoritma pencarian (searching algorithm) adalah algoritma yang menerima sebuah argumen kunci dan dengan langkah-langkah tertentu akan mencari rekaman dengan kunci tersebut. Setelah proses pencarian dilaksanakan, akan diperoleh salah satu dari dua kemungkinan, yaitu data yang dicari ditemukan (successful) atau tidak ditemukan (unsuccessful).

Selain itu metode pencarian data juga dapat dikelompokkan menjadi pencarian statis (static searching) dan pencarian dinamis (dynamic searching). Pada pencarian statis, banyaknya rekaman yang diketahui dianggap tetap, pada pencarian dinamis, banyaknya rekaman yang diketahui bisa berubah-ubah yang disebabkan oleh penambahan atau penghapusan suatu rekaman.
 
Ada tiga macam teknik pencarian yang akan dipraktekkan yaitu pencarian sekuensial, pencarian biner dan interpolation. Perbedaan dari dua teknik ini terletak pada keadaan data. Pencarian sekuensial digunakan apabila data dalam keadaan acak atau tidak terurut. Sebaliknya, pencarian biner dan interpolation search digunakan pada data yang sudah dalam keadaan urut.

---
- ## Praktikum

**Soal praktikum:**
1. **Soal 1**:  Buatlah method main untuk menjalankan method-method Searching!
2. **Soal 2**:  Jalankan masing-masing method dan tuliskan hasilnya!
3. **Soal 3**:  Analisis masing-masing kode pada method Searching!

---
**Jawaban**

1. [**Soal 1: Link source code file praktikum/Main.java**](https://github.com/rendiputra/PSD_SEC_20104079_Rendi_Putra_P/blob/modul12/src/com/rendiputra/modul12/Main.java)

2. **Berikut Capture text hasil dari method main ketika dijalankan:**
```text
menginput data array: 
128, 3, 9, 2, 12, 24, 67, 98, 

mengurutkan data array: 
2, 3, 9, 12, 24, 67, 98, 128, 

---Pencarian Interpolation Search---
Data 24 found at index 4

---Pencarian Binary Search---
Data 67 foundat index 5

---Pencarian Sequential Search---
Data 3 found at index 1

Process finished with exit code 00
```

3. **Analisis method pada class `BinarySearch.Java`, `InterpolationSearch.Java`, `SelectionSort.Java`, dan `SequentialSearch.Java`:**

    - Method `binary()`
    
        Digunakan untuk melakukan pencarian data didalam array menggunakan cara menghilangkan setengah data pada array. Karena method `binary()` adalah method function maka method `binary()` akan mengembalikan(return) nilai untuk nantinya akan dikirim dan dicek oleh method `search()` untuk menentukan data sudah ditemukan atau belum.
    
    - method `InterpolationSeacrh()`

        Digunakan untuk melakukan pencarian data didalam array dengan cara hampir mirip dengan method `binary()` tetapi yang  membedakan adalah pada rumus mencari posisi index pada array seperti berikut:
      ```java
      int pos = ((cari - data[low]) / (data[high] - data[low])) * (high - low) + low;
      ```
      Karena method `interpolation()` adalah method function maka method `interpolation()` akan mengembalikan(return) nilai untuk nantinya akan dikirim dan dicek oleh method `search()` untuk menentukan data sudah ditemukan atau belum.

    - method `sequential()`
      
        Digunakan untuk melakukan pencarian data didalam array dengan cara linear atau sekuensial, yaitu dengan cara melakukan perulangan sebanyak jumlah isi data pada array hingga keyword yang dicari ditemukan. Karena method `sequential()` adalah method function maka method `sequential()` akan mengembalikan(return) nilai untuk nantinya akan dikirim dan dicek oleh method `search()` untuk menentukan data sudah ditemukan atau belum.

    - method `selectionSort()`

        Digunakan untuk mengurutkan data array dari nilai terkecil hingga nilai terbesar dengan metode selection sort, yaitu dengan cara membuat perulangan bersarang untuk memisah subarray yang sudah diurutkan dan yang belum diurutkan.
     
    - method `search()`
        
        Digunakan untuk memeriksa apakah keyword yang dicari sudah ditemukan atau belum. Karena method `search()` adalah method prosedur maka method `search()` hanya akan menyetak text saja.




---
## Kesimpulan
Dimodul ke-12 ini kita mempelajari apa itu Sequential search, Binary search, dan Interpolation Seacrh dan juga kita mempelajari bagaimana cara pengimplementasiannya pada bahasa Java, menganalisis bagaimana proses setiap method dari class `BinarySearch.Java`, `InterpolationSearch.Java`, `SelectionSort.Java`, dan `SequentialSearch.Java` bekerja.