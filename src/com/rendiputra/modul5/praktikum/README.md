# Modul5: Double Linked List

## Dasar Teori

- ###  Double Linked List

> Pengertian **Double Linked List** adalah sekumpulan **node** data yang terurut linear atau sekuensial dengan dua buah **pointer** yaitu `prev`(kiri) dan `next`(kanan).
Double Linked List ialah linked list dengan node yang memiliki data dan dua buah reference link (biasanya disebut next dan prev) yang menunjuk ke node sebelum dan node sesudahnya. Pada implementasinya, terdapat dua variasi double linked list yaitu circular dan non-circular layaknya pada single linked list.

Secara umum, sebuah list bertipe T adalah sebuah barisan elemen-elemen bertipe T beserta operasi-operasinya yang meliputi :
1. Membuat list (menginisialisasi list), yaitu membuat list menjadi kosong.
2. Menentukan apakah status list kosong atau tidak.
3. Menentukan apakah status list penuh atau tidak.
4. Mengetahui panjang (jumlah elemen) list.
5. Mengetahui sebarang node dari list (menghapus node).
6. Mengakses sebarang node dalam list, dengan membaca nilai atau menganti nilai yang ada dengan nilai yang baru.
7. Menyisipkan node baru ke dalam list di sebarang lokasi.

**Keuntungan dan kerugian:**

- **Keuntungan utama** pemanfaatan Linked List dibandingkan array, ataupun senarai biasa adalah kemudahan dan efektivitas kerja yang lebih baik dalam hal menambah, mengurangi, serta mencari suatu elemen/node yang terdapat dalam senarai. Hal tersebut dimungkinkan karena elemen-elemen yang terdapat pada sebuah senarai berantai tidak ditempatkan pada sebuah blok memori komputer seperti halnya larik ataupun senarai biasa, melainkan tiap-tiap elemen/node tersebut tersimpan dalam blok memori terpisah, penambahan, pengurangan, ataupun penggantian node dapat dilakukan dengan mengubah elemen rujukan atas tiap-tiap node yang terkait.

- **Kerugiannya**, sebuah Linked List tidak memungkinkan pengaksesan elemen secara acak, dalam artian untuk dapat mengakses node ke tiga pada contoh di atas harus dilakukan dengan cara mengunjungi elemen-elemen sebelumnya, dimulai dari elemen pertama, ke dua, seterusnya hingga pada lokasi elemen yang dimaksudkan.


- ### List

> **List** merupakan sekumpulan elemen list yang bertype sama. Elemen list memiliki keterurutan tertentu (elemen ke..., ada pengertian **suksesor** dan **predesesor**). Setiap elemen (node) di dalam list memiliki elemen (node) suksesor (penerus) kecuali elemen terakhir, dan setiap elemen list memiliki predesesor (pendahulu) kecuali elemen pertama. Terdapat 2 jenis list yakni **single list** dan **double list**.

---
- ## Praktikum

**Soal praktikum:**
1. **Soal 1**:  Buatlah method main untuk menjalankan method-method double linked list!
2. **Soal 2**:  Jalankan masing-masing method dan tuliskan hasilnya!
3. **Soal 3**:  Analisis masing-masing kode pada method double linked list!
4. **Soal 4**:  Buatlah method insertAfter yang berfungsi untuk memasukkan data setelah data tertentu dan method insertBefore yang berfungsi untuk memasukkan data sebelum data tertentu!

---
**Jawaban**

1. [**Soal 1: Link source code file Main.java**](https://github.com/rendiputra/PSD_SEC_20104079_Rendi_Putra_P/blob/modul5/src/com/rendiputra/modul5/praktikum/Main.java)
   
2. **Berikut Capture text hasil dari method main ketika dijalankan:**
```
---Method isEmpty()---
Check data kosong: List Kosong

---Method addFirst()---
Masukan data:	1
Apakah ingin mengulang method lagi? (Y/N): y
Masukan data:	3
Apakah ingin mengulang method lagi? (Y/N): y
Masukan data:	5
Apakah ingin mengulang method lagi? (Y/N): n
Data saat ini: 5 3 1 

---Method addLast()---
Masukan data:	7
Apakah ingin mengulang method lagi? (Y/N): y
Masukan data:	8
Apakah ingin mengulang method lagi? (Y/N): n
Data saat ini: 5 3 1 7 8 

---Method removeFirst()---
Data saat ini: 3 1 7 8 

---Method addLast() lagi---
Masukan data:	9
Apakah ingin mengulang method lagi? (Y/N): n
Data saat ini: 3 1 7 8 9 

---Method removeLast()---
Data saat ini: 3 1 7 8 

---Method insert()---
Masukan index:	1
Masukan data:	2
Data 2 berhasil dimasukan pada indeks 1
Apakah ingin mengulang method lagi? (Y/N): n
Data saat ini: 3 2 1 7 8 

---Method replace()---
Masukan keyword data yang ingin diganti:	2
Masukan data:	4
Data 2 berhasil diganti dengan data 4
Apakah ingin mengulang method lagi? (Y/N): n
Data saat ini: 3 4 1 7 8 

---Method remove()---
Masukan keyword data yang ingin dihapus:	1
data 1 berhasil dihapsu!
Apakah ingin mengulang method lagi? (Y/N): n
Data saat ini: 3 4 7 8 

---Method removeAt()---
Masukan index data yang ingin dihapus:	1
Data pada indeks 1 berhasil dihapus !
Apakah ingin mengulang method lagi? (Y/N): n
Data saat ini: 3 7 8 

---Method length()---
Panjang data : 3
Data saat ini: 3 7 8 

---Method checking()---
Masukan keyword data yang ingin dicari:	7
Apakah keyword yang dicari ada? : true
Apakah ingin mengulang method lagi? (Y/N): n
Data saat ini: 3 7 8 

---Method showReversed()---
8 7 3 

---Method find()---
Masukan keyword data yang ingin dicari:	7
7 ditemukan pada indeks ke-1
Apakah ingin mengulang method lagi? (Y/N): n

---Method insertAfter()---
Masukan keyword:	7
Masukan data setelah keyword:	2
Data 2 berhasil dimasukan pada indeks 7
Apakah ingin mengulang method lagi? (Y/N): n
Data saat ini: 3 7 2 8 

---Method insertBefore()---
Masukan keyword :	7
Masukan data sebelum keyword:	4
Memasukkan data 4 sebelum data 7 sukses!
Apakah ingin mengulang method lagi? (Y/N): n
Data saat ini: 3 4 7 2 8 

---Method clear()---
Data berhasil dihapus semua !
Data saat ini:  Data kosong ! 

Process finished with exit code 0
```

3. **Analisis method pada class `DoubleLinkedList()`:**
   
   - Method `isEmpty() `
   Digunakan untuk mengecek pengkodisian apakah head bernilai kosong, maka digunakan syntax berikut: `head == null;`. Karena method `isEmpty()` adalah method **Function** maka method `isEmpty()` mengembalikan(return) nilai(bertipe data boolean);
   - Method `addFirst()`
     Digunakan untuk menyisipkan data paling awal list, Jika nilai `head == null` maka nilai `head` dan `tail` = `input`, sebaliknya jika nilai `head != null` maka dilakukan penyisipan data pada index paling awal pada list.Dan juga karena method `addFirst()` adalah method **prosedur**(void) maka method `addFirst()` tidak mereturn nilai apapun.
   - Method `removeFirst()`
   - Method `addLast()` 
     Digunakan untuk menyisipkan data diakhir list, Jika nilai `head == null` maka nilai `head` dan `tail` = `input`, sebaliknya jika nilai `head != null` maka dilakukan penyisipan data diakhir list. Karena method `addLast()` adalah method **prosedur**(void) maka method `addLast()` tidak mereturn nilai apapun.
   Digunakan untuk menghapus data paling awal pada list, jika nilai `head == null` maka hanya menampilkan text("data kosong") saja, jika nilai `head != null` dan `head == tail`(artinya list hanya memiliki 1 data saja) maka `head` dan `tail` bernilai `null`, Jika nilai `head != null` dan `head != tail`(artinya list memiliki lebih dari 1 data) maka data paling awal pada list akan bernilai null. Karena method `removeFirst()` adalah method **prosedur**(void) maka method `removeFirst()` tidak mereturn nilai apapun.
   - Method `removeLast()`
     Digunakan untuk menghapus data paling akhir pada list, jika nilai `head == null` maka hanya menampilkan text("data kosong") saja,
     jika nilai `head != null` dan `head == tail`(artinya list hanya memiliki 1 data saja) maka `head` dan `tail` bernilai `null`,
     Jika nilai `head != null` dan `head != tail`(artinya list memiliki lebih dari 1 data) maka data paling akhir pada list akan bernilai null. Karena `removeLast()` adalah method **prosedur**(void) maka method `removeLast()` tidak mereturn nilai apapun. Karena method `removeLast()` adalah method **prosedur**(void) maka method `removeLast()` tidak mereturn nilai apapun.
   - Method `show()`
     Digunakan untuk mencetak semua data yang berada di list dari awal hingga akhir pada list, jika `head == null` maka hanya menampilkan text("data kosong") saja, jika nilai `head != null` dan selama nilai `temp != null` maka dilakuan pencetakan semua data yang berada di list. Karena `show()` adalah method **prosedur**(void) maka method `show()` tidak mereturn nilai apapun. Karena method `show()` adalah method **prosedur**(void) maka method `show()` tidak mereturn nilai apapun.
    - Method `insert()`
    Digunakan untuk menyisipkan data pada index yang ditentukan. Selama nilai `temp != null` dan `index == 0`(yang berarti data paling awal pada list) maka kita hanya perlu memanggil method `addFirst()` saja, dan jika nila ke- `i == index-1` & nilai `temp != tail`(yang berarti nilai berada diantara awal dan akhir pada list) maka akan dilakukan penyisipan data pada index ke-i, tapi jika nilai ke- `i == index-1` & nilai `temp == tail`(yang berarti data berada diakhir list) maka kita hanya perlu mamanggil method `addLast()` saja. Dan karena method `insert()` adalah method **prosedur**(void) maka method `insert()` tidak mereturn nilai apapun.
    - Method `insertAfter()`
    Digunakan untuk menyisipkan data setelah **keyword** yang ditentukan. penjelasannya: selama nilai `temp != null` dan nilai `key.data == temp.data`(yang berarti nilai **keyword** sama dengan nilai data pada index list saat ini) maka akan dilakukan penyisipan data setelah index saat ini pada list. Lalu karena method `insertAfter()` adalah method **prosedur**(void) maka method `insertAfter()` tidak mereturn nilai apapun.
    - Method `insertBefore()`
      Method  `insertBefore()` ini hampir mirip dengan method `insertAfter()` yang berbeda adalah method `insertAfter()` menyisipkan data setelah `keyword`, sedangkan `insertBefore()` menyisipkan data sebelum `keyword`. Penjelasannya: selama nilai `temp != null` dan nilai `key.data == temp.data` dan juga nilai `temp == head`(yang berarti data berada pada paling awal list). Lalu karena method `insertBefore()` adalah method **prosedur**(void) maka method `insertBefore()` tidak mereturn nilai apapun.
    - Method `replace()` 
    Digunakan untuk mengganti data pada nilai `keyword` yang ditentukan. Penjelasannya: selama nilai `temp != null` dan nilai `temp.data ==data1.data` maka akan dilakukan pertukaran nilai data(pada index saat ini) yang akan digantikan dengan nilai data2. Lalu karena method `replace()` adalah method **prosedur**(void) maka method `replace()` tidak mereturn nilai apapun.
    - Method `remove()` 
Digunakan untuk menghapus data sesuai dengan `keyword` yang diinputkan. Penjelasan: Selama nilai `temp != null` dan jika nilai `(temp.data == data.data)` dan nilai `(temp == tail)`(yang artinya data berada diakhir list) maka kita hanya perlu memanggil method `removelast()` saja, jika nilai `(temp.data == data.data)` dan nilai `(temp == head)`(yang artinya data berada pada paling awal list) maka kita hanya perlu mamanggil method `removeLast()`, jika nilai `(temp.data == data.data)` dan nilai `(temp != tail)`(yang artinya data berada diantara awal dan akhir pada list) maka akan dilakukan penghapusan data. Lalu karena method `remove()` adalah method **prosedur**(void) maka method `remove()` tidak mereturn nilai apapun.
    - Method `removeAt()`
    Digunakan  Digunakan untuk menghapus data sesuai dengan `index` yang diinputkan. Penjelasan: selama nilai `temp != null` dan nilai `index == 0` maka kita memanggil method `removeFirst()`, jika nilai `(i == index - 1) && (temp.kanan != tail)` maka dilakukan penghapusan data pada index saat ini, tapi jika nilai `(i == index - 1) && (temp.kanan == tail)` maka kita memanggil method `removeLast()`. Lalu karena method `removeAt()` adalah method **prosedur**(void) maka method `removeAt()` tidak mereturn nilai apapun.
    - Method `clear()`
    Digunakan untuk memformat(menghapus semua) isi list. Dan karena method `clear()` adalah method **prosedur**(void) maka method `clear()` tidak mereturn nilai apapun.
    - Method `Find()`
    Digunakan untuk mencari nilai `index` keberapa data ditempatkan dengan cara menginput `keyword`.  Penjelasan: selama `temp != null` dan jika nilai `temp.data == data.data` maka variable `found` bernilai `true`, dan jika variable `found` bernilai `true` maka akan mencetak text(`index` ke-`i`). Dan karena method `Find()` adalah method **prosedur**(void) maka method `Find()` tidak mereturn nilai apapun.
    - Method `length()`
    Digunakan untuk mencari panjang data pada list. Penjelasan: Jika list kosong maka akan mencetak text(Data kosong), jika list tidak kosong dan selama `temp != null` maka akan dihitung melalui variable `i`, setelah selesai maka akan mencetak text(Panjang data ke-`i`) dan mereturn variable `i`. Lalu karena method `length()` adalah method **Function** maka method `length()` akan mengembalikan(return) nilai(bertipe data integer).

    - Method `checking()`
    Digunakan untuk mencari data apakah ada didalam list atau tidak. Method `checking()` ini hampir mirip dengan method `find()` yang berbeda adalah method `find()` tidak mereturn nilai, sedangkan method `checking()` mereturn nilai. Dan karena method `checking()` adalah method **Function** maka method `checking()` akan mengembalikan(return) nilai(bertipe data boolean).
    - Method `showReserved()`
    Digunakan untuk mencetak data pada list dari akhir hingga awal. Method `showReserved()` ini hampir mirip dengan method `show()` yang berbeda adalah method `showReserved()` menampilkan nilai data list dari akhir hingga keawal, sedangkan method `show()` menampilkan data list dari awal hingga akhir.   
      

4. [**Source code method `insertAfter()` dan `insertBefore()`**](https://github.com/rendiputra/PSD_SEC_20104079_Rendi_Putra_P/blob/modul5/src/com/rendiputra/modul5/praktikum/DoubleLinkedList.java)

---
## Kesimpulan
>Dimodul ke-5(Double Linked List) ini hampir mirip dengan modul ke-4(Single Linked List). Materi yang tercakup dalam modul ke-5 ini antara lain implementasi list dalam Double Linked List, Interface, juga terdapat soal `inserAfter()` dan `insertBefore()`, dan menganalisis bagaimana proses setiap method dari Double Linked List bekerja. 

