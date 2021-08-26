# Modul4: Single Linked List

## Dasar Teori

- ### Linked List
**Linked list** atau kadang-kadang disebut dengan **senarai bertaut** atau daftar bertaut dalam ilmu komputer merupakan sebuah **struktur data** yang digunakan untuk menyimpan sejumlah objek data biasanya secara **terurut** sehingga memungkinkan penambahan, pengurangan, dan pencarian atas elemen data yang tersimpan dalam senarai dilakukan secara lebih efektif. Pada praktiknya sebuah struktur data memiliki elemen yang digunakan untuk saling menyimpan rujukan antara satu dengan lainnya sehingga membentuk sebuah senarai abstrak, tiap-tiap elemen yang terdapat pada senarai abstrak ini sering kali disebut sebagai **node**. karena mekanisme rujukan yang saling terkait inilah disebut sebagai senarai berantai.

**Keuntungan dan kerugian:**

- **Keuntungan utama** pemanfaatan Linked List dibandingkan array, ataupun senarai biasa adalah kemudahan dan efektivitas kerja yang lebih baik dalam hal menambah, mengurangi, serta mencari suatu elemen/node yang terdapat dalam senarai. Hal tersebut dimungkinkan karena elemen-elemen yang terdapat pada sebuah senarai berantai tidak ditempatkan pada sebuah blok memori komputer seperti halnya larik ataupun senarai biasa, melainkan tiap-tiap elemen/node tersebut tersimpan dalam blok memori terpisah, penambahan, pengurangan, ataupun penggantian node dapat dilakukan dengan mengubah elemen rujukan atas tiap-tiap node yang terkait.

- **Kerugiannya**, sebuah Linked List tidak memungkinkan pengaksesan elemen secara acak, dalam artian untuk dapat mengakses node ke tiga pada contoh di atas harus dilakukan dengan cara mengunjungi elemen-elemen sebelumnya, dimulai dari elemen pertama, ke dua, seterusnya hingga pada lokasi elemen yang dimaksudkan.

## Praktikum

**Soal praktikum:**
1. **Soal 1:** Buatlah method main untuk menjalankan method-method linked list!
2. **Soal 2:** Jalankan masing-masing method dan tuliskan hasilnya!
3. **Soal 3:** Analisis masing-masing kode pada method linked list!
4. **Soal 4:** Buatlah method removeAt yang berfungsi untuk menghapus data pada Node tertentu dan method clear untuk menghapus semua data!


**Jawaban:**

1. [**Link Source code Method 'main'**](https://github.com/rendiputra/PSD_SEC_20104079_Rendi_Putra_P/blob/modul4/src/com/rendiputra/modul4/praktikum/Main.java)
2. [**Link Source code Modul 4**](https://github.com/rendiputra/PSD_SEC_20104079_Rendi_Putra_P/blob/modul4/src/com/rendiputra/modul4/praktikum)

**Capture text hasil dari method main:**
```Plain Text
List Kosong

Add First
Masukan data	: 1

Apakah ingin menambah data lagi? (Y/N) : y
Masukan data	: 3

Apakah ingin menambah data lagi? (Y/N) : y
Masukan data	: 5

Apakah ingin menambah data lagi? (Y/N) : n
Panjang data : 3
Data saat ini: 5 3 1 


Add Last
Masukan data	: 2
2

Apakah ingin menambah data lagi? (Y/N) : n
Panjang data : 4
Data saat ini: 5 3 1 2 


Insert After
Data saat ini: 5 3 1 2 
Masukan key	: 1
Masukan data	: 4
Memasukkan data 4 setelah data 1 sukses!

Apakah ingin menambah data lagi? (Y/N) : n
Panjang data : 5
Data saat ini: 5 3 1 4 2 


Insert Before
Masukan Key	: 5
Masukan data	: 6
Memasukkan data 6 sebelum data 5 sukses!

Apakah ingin menambah data lagi? (Y/N) : n
Panjang data : 6
Data saat ini: 6 5 3 1 4 2 


Insert
Masukan Index	: 6
Masukan data	: 7
Data 7 berhasil dimasukkan pada indeks 6

Apakah ingin menambah data lagi (Y/N) : n
Panjang data : 7
Data saat ini: 6 5 3 1 4 2 7 

Replace data
Input key data yang ingin diganti : 7
Input data baru : 8
Data 7 berhasil diganti dengan data 8
Panjang data : 7
Data saat ini: 6 5 3 1 4 2 8 

Remove Data
Input data yang akan dihapus: 5
Data 5 berhasil dihapus !
Panjang data : 6
Data saat ini: 6 3 1 4 2 8 

Remove First
Panjang data : 5
Data saat ini: 3 1 4 2 8 

Remove Last
Panjang data : 3
Data saat ini: 3 1 4 2

Mencari data: 
Masukan data yang ingin dicari: 4
4 ditemukan pada indeks ke-2
Panjang data : 3
Data saat ini: 3 1 4 2

Remove berdasarkan index 
Masukan index yang ingin dihapus: 2
Panjang data : 2
Data saat ini: 3 1 2
Data berhasil dihapus semua! 

ClearData kosong !
Panjang data : 0
Data saat ini: 

Process finished with exit code 0
```

3. Analisis method:

- Method isEmpty()
  Digunakan untuk mengecek pengkodisian pada head(list), maka digunakan syntax berikut: 'head == null;'

- Method printNode()
  Digunakan untuk mencetak semua node yang tersimpan, pada deklarasi node temp, maka variable temp diisi dari nilai head, Ketika variable temp tidak kosong maka akan mencetak temp.data

- Method addFirst()
  Digunakan untuk meletakan node diawal list, jika pada awal-awal tidak terdapat data, maka memasukkan variable head diisi dengan input, dan tail diisi dengan input. Jika terdapat data, maka inputan awal diisi dengan input.next = head, variable head = input.

- Method addLast()
  Digunakan untuk meletakan node diakhir list, jika pada awal-awal tidak terdapat data, maka memasukkan variable head diisi dengan input, dan tail disi dengan input, jika terdapat data, maka inputan akhir diisi dengan tail tail.next = input, variable tail = input.

- Method insertAfter()
  Digunakan untuk menginputkan setelah suatu data, pada deklarasi node temp = head, Boolean found = false, pada method ini menggunakan perulangan do while, pertama akan menjalankan fungsi do, didalam fungsi do terdapat kondisi jika temp.data = key, maka input.next = temp.next, pada variable temp.next = input, nah disini kita akan mengganti nilai true pada Boolean found yang berarti, datanya ditemukan pada saat mengexecute insertafter. Di fungsi while Ketika temp!=null, maka dia akan melakukan fungsi do diatas.

- Method insertBefore()
  Digunakan untuk menginputkan sebelum suatu data, pada method insertBefore menggunakan fungsi try catch exception yang berarti, pada saat method ini dipanggil, akan melakukan fungsi try, didalam fungsi try pada deklarasi node temp = head, pada method ini menggunakan perulangan while, jika temp!=null, maka didalam fungsi while terdapat kondisi jika temp.data = key dan temp == head, maka akan memanggil fungsi addFirst(), jika temp.next.data = key maka input.next = temp.next, pada variable temp.next = input. Jika pada saat melakukan fungsi try terdapat error, maka akan menampilkan data key tidak
  ditemukan.

- Method insert()
  Digunakan untuk menginputkan suatu data, pada deklarasi node temp = head, Boolean found = false, pada method ini menggunakan perulangan while jika temp!= null maka akan terdapat kondisi jika index == 0, maka akan memanggil method addFirst(), nah disini kita akan mengganti nilai true pada Boolean found yang berarti, datanya ditemukan pada saat mengexecute insert. Jika i == index-1 maka input.next = temp.next, pada variable temp.next = input, nah disini kita akan mengganti nilai true pada Boolean found yang berarti, datanya ditemukan pada saat mengexecute insertAfter. Jika found tidak ditemukan maka index out of bound.

- Method replace()
  Digunakan untuk mengganti suatu data, pada deklarasi node temp = head, Boolean found = false, pada method ini mmenggunakan perulangan while jika temp!= null maka akan terdapat kondisi jika temp.data == data1, maka variable temp.data = data2, nah disini kita akan mengganti nilai true pada Boolean found yang berarti, datanya ditemukan pada saat
  mengexecute replace. Jika tidak variable temp = nilai dari temp.next. Jika found tidak ditemukan maka index out of bound.

- Method remove()
  Digunakan untuk menghapus suatu data, pada method remove menggunakan fungsi try catch exception yang berarti, pada saat method ini dipanggil, akan melakukan fungsi try, didalam fungsi try pada deklarasi node temp = head, pada method ini menggunakan perulangan while, jika temp!=null, maka didalam fungsi while terdapat kondisi jika temp.next.data = data maka temp.next = temp.next.next data berhasil dihapus. jika temp.data = data dan temp == head, maka akan memanggil fungsi removeFirst(), maka temp = temp.next. Jika pada saat melakukan fungsi try terdapat error, maka akan menampilkan data tidak ditemukan.

- Method removeFirst()
  Digunakan untuk menghapus data diawal node/list, pada deklarasi node temp = head, pada method ini terdapat kondisi jika !isEmpty() dan head==tail, maka variable head = tail = null. Jika tidak head = temp.next, temp.next = null, temp = null. Jika tidak tidak maka list kosong.

- Method removeLast()
  Digunakan untuk menghapus data diakhir node/list, pada deklarasi node temp = head, pada method ini terdapat kondisi jika !isEmpty() dan tail==head, maka variable head = tail = null. Jika tidak terdapat perulangan while jika temp.next != tail maka temp = temp.next. temp.next = null, temp = null. Jika tidak tidak maka list kosong.

- Method find()
  Digunakan untuk mencari data, pada deklarasi terdapat int i = 0, Boolean found = false, node temp = head. Pada method ini menggunakan perulangan while, jika temp!=null, maka didalam fungsi while terdapat kondisi jika temp.data = data maka data yang dicari ditemukan.

- Method length()
  Digunakan untuk mencari Panjang list, pada deklarasi terdapat int i = 0, node temp = head. Pada method ini terdapat kondisi jika isEmpty() maka list kosong, jika tidak maka didalam fungsi while terdapat kondisi jika temp.data != null maka temp = temp.next. dan i++. Cetak panjang data i.

- Method removeAt()
  Digunakan untuk menghapus data pada index, pada method removeAt menggunakan fungsi try catch exception yang berarti, pada saat method ini dipanggil, akan melakukan fungsi try, didalam fungsi try pada deklarasi node temp = head, int i = 0. pada method ini menggunakan perulangan while, jika temp!=null, maka didalam fungsi while terdapat kondisi jika i == index-1 maka temp.next = temp.next.next data di index tersebut berhasil dihapus. maka temp = temp.next. Jika pada saat melakukan fungsi try terdapat error, maka akan menampilkan data tidak ditemukan.

- Method clear()
  Digunakan untuk menghapus semua node/list yang tersedia. Dideklarasikan node temp = head. Terdapat kondisi jika head == tail maka head = tail = null. Jika tidak head = null.

4. [**Method removeAt() dan clear()**](https://github.com/rendiputra/PSD_SEC_20104079_Rendi_Putra_P/blob/modul4/src/com/rendiputra/modul4/praktikum/Linked.java)

## Kesimpulan
Pada modul keempat penulis dapat menyimpulkan pada modul Single Linked List. Materi yang dibahas pada modul ini meliputi komponen for operation, logika loop, dan implementasinya. Selain perulangan for, juga terdapat implementasi class interface untuk membuat node di Java. Seperti yang dijelaskan pada modul single linked list, terdapat soal untuk membuat method
removeAt, clear, dan juga penulis menganalisis Program.