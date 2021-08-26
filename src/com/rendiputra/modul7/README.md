# Modul 7: Queue

## Dasar Teori

- ### Definisi Queue

**Antrian** (queue) adalah konsep penyimpanan sekumpulan data yang sering digunakan. Pada antrian data dapat disimpan dalam array atau linked list. Pada antrian, penunjuk posisi depan dan belakang harus disimpan. Apabila akan menambah data pada antrian maka menaikkan penunjuk belakang dan meletakkan data pada posisi tersebut. Apabila akan menghapus data pada antrian maka dihapus pada posisi depan dan menaikkan penunjuk depan.

Karakteristik penting dari antrian adalah :
1. Elemen antrian yaitu item-item data yang terdapat di elemen antrian
2. Front (penunjuk elemen terdepan dari antrian)
3. Rear (penunjuk elemen terakhir dari antrian)
4. Kondisi antrian


- ### Queue Dengan Linked List
Array yang digunakan untuk mengimplementasikan antrian dideklarasikan mempunyai ukuran `MAX`. Ukuran ini ditentukan pada saat menulis program, tidak dapat diubah pada saat program berjalan. Sehingga pada saat menulis program, harus ditentukan ukuran memori maksimum yang diperlukan untuk membangun array. Hal ini berhubungan dengan deklarasi ruang memori yang tersedia. Jika jumlah elemen yang dapat disimpan dalam antrian kecil, maka banyak ruang memori yang tidak digunakan. Sebaliknya, jika jumlah elemen yang akan disimpan pada antrian terlalu banyak, maka menyebabkan overflow. Untuk menghindari hal tersebut terjadi dan keterbatasan memory maka digunakan struktur data yang disebut **_linked list_**.

---
- ## Praktikum

**Soal praktikum:**
1. **Soal 1**:  Buatlah method main untuk menjalankan method-method Queue!
2. **Soal 2**:  Jalankan masing-masing method dan tuliskan hasilnya!
3. **Soal 3**:  Analisis masing-masing kode pada method Queue!
4. **Soal 4**:  Buatlah implementasi Queue menggunakan circular array untuk memasukkan data NIM, Nama, dan Alamat mahasiswa!


---
**Jawaban**

1. [**Soal 1: Link source code file praktikum/Main.java**](https://github.com/rendiputra/PSD_SEC_20104079_Rendi_Putra_P/blob/modul7/src/com/rendiputra/modul7/praktikum/Main.java)

2. **Berikut Capture text hasil dari method main ketika dijalankan:**
```text

---Method isEmpty()---
Apakah queue sedang kosong? : true
Data queue saat ini: Queue kosong !

---Method enqueue()---
Data queue saat ini: 1 
Data queue saat ini: 1 2 
Data queue saat ini: 1 2 3 
Data queue saat ini: 1 2 3 4 
Data queue saat ini: 1 2 3 4 5 

---Method dequeue()---
Data queue saat ini: 2 3 4 5 
Data queue saat ini: 3 4 5 
Data queue saat ini: 4 5 

---Method makeEmpty()---
Data queue berhasil dikosongkan !
Data queue saat ini: Queue kosong !

Process finished with exit code 0
```

3. **Analisis method pada class `Queue.Java`:**

    - Method `isEmpty() `
      Digunakan untuk mengecek pengkodisian apakah nilai `depan`(Nilai Paling awal pada `queue`) bernilai kosong, maka digunakan syntax berikut: `depan == null`. Lalu karena method `isEmpty()` adalah method **Function** maka method `isEmpty()` mengembalikan(return) nilai(bertipe data boolean).
    
    - Method `enqueue()`
      Digunakan untuk menambahkan/penyisipan nilai pada urutan paling belakang sebuah antrian(Queue). Penjelasan: jika nilai `depan == null`(antrian kosong) maka nilai `depan` dan `belakang` akan diisi oleh nilai `input`(didapat dari parameter method), dan  jika nilai antrian tidak kosong maka akan dilakukan penambahan/penyisipan nilai urutan paling belakang pada queue(antrian). Lalu karena method `enqueue()` adalah method prosedur(void) maka method `enqueue()` tidak mereturn nilai apapun.
    
    - Method `show()`
      Digunakan untuk menampilkan nilai pada Antrian(Queue). Penjelasan: jika nilai `depan != null`(Antrian tidak sedang kosong) dan selama nilai `temp != null` maka akan menampilkan isi Antrian(Queue), dan jika antrian kosong maka hanya akan menampilkan text(Queue kosong) saja. Lalu, karena method `show()` adalah method prosedur(void) maka method `show()` tidak mereturn nilai apapun.
    
    - Node `dequeue()`
      Digunakan untuk mengambil/menggapus data paling depan pada antrian(Queue). Penjelasan: jika nilai `depan == null`(Antrian sedang kosong) maka mereturn/mengembalikan nilai `null`. Jika antrian tidak kosong dan nilai `depan == belakang` maka nilai `depan` & `belakang` di`null`kan, dan jika nilai `depan` & `belakang` tidak sama maka akan dilakukan penghapusan nilai antrian paling depan dan akan mereturn/mengembalikan nilai `temp`.
      
    - Method makeEmpty()
    Digunakan untuk mengosongkan(format delete) nilai pada antrian(Queue). Lalu karena method `makeEmpty()` adalah method prosedur(void) maka method `makeEmpty()` tidak mereturn nilai apapun.


4. [**Soal 4: Program implementasi Queue menggunakan circular array, Link source code file tugas/Main.java**](https://github.com/rendiputra/PSD_SEC_20104079_Rendi_Putra_P/blob/modul7/src/com/rendiputra/modul7/tugas/Main.java)
Berikut Capture text hasil dari program ketika dijalankan:
```text
---Method isEmpty()---
Apakah queue sedang kosong? : true
Data queue saat ini: Queue kosong !

---Method enqueue()---
Data queue saat ini: 
20104079, Rendi, Bekasi 

Data queue saat ini: 
20104079, Rendi, Bekasi 
20104179, Putra, Jawa Barat 

Data queue saat ini: 
20104079, Rendi, Bekasi 
20104179, Putra, Jawa Barat 
20104279, Pradana, Indonesia 


---Method dequeue()---
Data queue saat ini: 
20104179, Putra, Jawa Barat 
20104279, Pradana, Indonesia 


---Method makeEmpty()---
Data queue berhasil dikosongkan !
Data queue saat ini: Queue kosong !

Process finished with exit code 0

```
---

## Kesimpulan
Dimodul ke-7 ini kita mempelajari apa itu Queue(Antrian, bagaimana cara pengimplementasian Queue(antrian) menggunakan Linked List, menganalisis bagaimana proses setiap method dari class `praktikum/Queue.java` bekerja, dan juga pengimplementasian queue menggunakan circular array.