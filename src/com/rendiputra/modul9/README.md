# Modul 9: Binary Search Tree

## Dasar Teori

### Definisi Binary Search Tree
Sebuah binary tree adalah sebuah pengorganisasian secara hirarki dari beberapa buah simpul, dimana masing-masing simpul tidak mempunyai anak lebih dari 2. Simpul yang berada di bawah sebuah simpul dinamakan anak (child) dari simpul tersebut. Simpul yang berada di atas sebuah simpul dinamakan induk(parent) dari simpul tersebut.

Masing-masing simpul dalam binary tree terdiri dari tiga bagian: sebuah data dan dua buah pointer yang dinamakan pointer kiri(left) dan kanan(right). Dengan menggunakan tiga bagian ini, kita menampilkan sebuah binary tree dengan melakukan setting pada pointer kiri dan kanan untuk menghubungkan sebuah simpul dengan anak-anaknya. Jika sebuah simpul tidak mempunyai anak pada pointer kiri atau kanan, kita melakukan setting pada pointer tersebut pada NULL, yang menunjukkan akhir dari percabangan adalah pada simpul tersebut. Sebuah percabangan adalah kumpulan dari simpul-simpul yang dimulai dari sebuah root dan diakhiri dengan sebuah simpul terakhir. Simpul terakhir (daun) adalah simpul dari tree yang tidak mempunyai anak.

Terminologi dalam Tree:

| Istilah | Keterangan |
| ----- | ----- |
| Predecesor | Node yang berada diatas node tertentu |
| Successor | Node yang berada dibawah node tertentu |
| Ancestor | Seluruh node yang terletak sebelum node tertentu dan terletak pada jalur yang sama |
| descendant | Seluruh node yang terletak setelah node tertentu dan terletak pada jalur yang sama |
| parent | Predecessor satu level diatas suatu node |
| child | Successor stau level dibawah suatu node |
| sibling | Node-node yang memiliki nilai yang sama |
| subtree | Suatu node beserta descendantnya |
| size | Banyaknya node pada suatu tree |
| Height | Banyaknya tingkatan pada suatu tree |
| root | Node khusus yang tidak memiliki predecessor |
| leaf | Node-node dalam tree yang tidak memiliki successor |
| degree | Banyaknya child dalam suatu Node |


### Implementasi Binary Tree dengan Linked List

Salah satu implementasi dari binary tree adalah Binary Search Tree (BST), dimana BST merupakan sekumpulan elemen yang bernilai unik, dan untuk setiap node X dalam struktur BST → Nilai elemen pada sub pohon kiri (left subtree) pasti memiliki nilai yang lebih kecil dari X dan nilai elemen pada sub poon kanan (right sub tree) pasti memiliki nilai yang labih besar. 

BST dapat disajikan dengan beberapa cara. Dalam praktikum ini akan menggunakan linked list untuk implementasi Binary Search Tree. Linked list yang dipakai adalah double linked list non circular.

---
- ## Praktikum

**Soal praktikum:**
1. **Soal 1**:  Buatlah method main untuk menjalankan method-method Binary Search Tree!
2. **Soal 2**:  Jalankan masing-masing method dan tuliskan hasilnya!
3. **Soal 3**:  Analisis masing-masing kode pada method Binary Search Tree!
4. **Soal 4**:  Buatlah method cetak pada Binary Search Tree untuk cetak secara preOrder, inOrder, postOrder!

---
**Jawaban**

1. [**Soal 1: Link source code file praktikum/Main.java**](https://github.com/rendiputra/PSD_SEC_20104079_Rendi_Putra_P/blob/modul8/src/com/rendiputra/modul9/praktikum/Main.java)

2. **Berikut Capture text hasil dari method main ketika dijalankan:**
```text
---Method isEmpty()---
Apakah nilai binarySearchTree kosong? : true

---Method insert()---

---Method getLeafCount()---
Total leaf: 2

---Method find(), findDirectory(), findMin() & findMax()---
Data 34 ketemu !
Find Directory	: 44 , 39 , 34
Find Max	: 45
Find Min	: 3

---Method remove()---
Data 39 sudah dihapus
false

---Method removeAll()---
Tree masih kosong !

---Method isEmpty()---
Apakah nilai binarySearchTree kosong? : true

Process finished with exit code 0

```

3. **Analisis method pada class `BinarySearchTree.Java`:**
   - Method `isEmpty() 
  
      Digunakan untuk mengecek pengkodisian apakah nilai 'root == null'?, jika bernilai `null` maka Method 'isEmpty()' akan mereturn nilai boolean true sebaliknya jika tidak bernilai `null` maka akan menghasilkan nilai boolean false. Lalu karena method isEmpty() adalah method Function maka method isEmpty() mengembalikan(return) nilai(bertipe data boolean).

   - Method `insert()`
     
      Digunakan untuk menyimpan nilai kedalam Tree dengan cara  menyeleksi nilai root atau parent nya apabila nilai data lebih kecil dari root/parent nya maka akan diletakan disebelah kiri dari root/parent nya, tapi sebelum itu dilakukan pengecekan duplikasi data terlebih dahulu.

   - Method `getLeafCount()`
   
      Digunakan untuk menghitung nilai leaf dalam tree, dengan cara dengan cara memanggil dirinya sendiri(rekursif) untuk mereturn/menjumlahkan leaf sebelah kiri dan kanan atau apabila data dari tree null maka akan mengembalikan 0 dan apabila hanya ada root saja maka akan mengembalikan 1.

   - Method `find()`
   
      Digunakan untuk mencari nilai data apakah ada didalam tree atau tidak, dengan cara apabila nilai `cari == temp.data` maka variable cek bernilai true lalu apabila `cek == true` yang berarti data sudah ketemu maka akan mencetak text(data yang dicari telah ditemukan), Jika tidak maka akan mencetak text(Data tidak ditemukan)

   - Method `findDirectory()`
   
      Digunakan untuk mengecek jalur direktori pada tree pada data yang ditentukan, dengan cara mengecek terlebih dahulu apakah data yang dicari ada didalam tree atau tidak, jika ada maka dilakukan pengulangan lalu pengecekan untuk mencetak direktori yang dilewati hingga sampai nilai yang dicari sama dengan nilai yang cek.

   - Method `findMin()`
   
      Digunakan untuk mencari nilai terkecil pada Tree, dengan cara dilakukan perulangan kiri hingga sampai dengan data tree paling kiri(terkecil).  

   - Method `findMax()`

     Digunakan untuk mencari nilai terbesar pada Tree, dengan cara dilakukan perulangan ke kanan pada tree hingga sampai dengan data tree paling kanan(terkecil).  
   
   - Method `remove()`
     
      Digunakan untuk menghapus data pada tree, dengan cara  dilakukan pengecekan terlebih dahulu apakah nilai data yang ingin dihapus ada didalam tree atau tidak, jika data ditemukan maka akan dilakukan pengecekan apakah nilai yang dicari(`input`) lebih kecil dari data tree saat ini(`tree.data`)? jika iya maka dilakukan fungsi reskursif untuk memanggil dirinya(method) sendiri hingga nilai `input` lebih besar dari data tree saat ini(`tree.data`) maka dilakukan fungsi reskursif untuk memanggil dirinya(method) sendiri hingga data yang ingin dihapus(`input`) sama dengan data tree saat ini(`tree.data`) setelah itu jika nilai `tree.left` tidak sama degan null maka nilai `tree.data` direplace oleh `tree.left` sebaliknya jika `tree.left` sama dengan `null` maka `tree.data` akan direplace oleh `tree.right`.


   - Method `removeAll()`
      
      Digunakan untuk menghapus semua isi data dari tree dengan cara melalukan pengecekan terlebih dahulu apakah tree kosong? jika iya maka menampilkan text(tree sudah kosong), jika tidak maka akan dilakukatan pengosongan tree dengan cara syntax berikut `root = null;`


4. [**Soal 4: Membuat Method cetak pada Binary Search Tree untuk cetak secara preOrder, inOrder, postOrder**](https://github.com/rendiputra/PSD_SEC_20104079_Rendi_Putra_P/blob/modul8/src/com/rendiputra/modul9/tugas/Main.java)
   
Berikut syntax method nya: 
```java
public void preOrder(Node data) {
     if(data != null) {
         System.out.print(data.data + " ");
         preOrder(data.left);
         preOrder(data.right);
     }
 }

 public void inOrder(Node data) {
     if(data != null) {
         preOrder(data.left);
         System.out.print(data.data + " ");
         preOrder(data.right);
     }
 }

 public void postOrder(Node data) {
     if(data != null) {
         preOrder(data.left);
         preOrder(data.right);
         System.out.print(data.data + " ");
     }
 }
```
   Berikut Capture text hasil dari program Main(untuk menjalan kan method preOrder, inOrder, postOrder):

```text
---Method isEmpty()---
Apakah nilai binarySearchTree kosong? : true

---Method insert()---

---Method getLeafCount()---
Total leaf: 2

---Method find(), findDirectory(), findMin() & findMax()---
Data 34 ketemu !
Find Directory	: 44 , 39 , 34
Find Max	: 45
Find Min	: 3

---Method remove()---
Data 39 sudah dihapus
false

---Method removeAll()---
Tree masih kosong !

---Method isEmpty()---
Apakah nilai binarySearchTree kosong? : true

Process finished with exit code 0
```


---
## Kesimpulan
Dimodul ke-9 ini kita mempelajari apa itu Binary Search Tree, bagaimana cara pengimplementasian Binary Search Tree menggunakan Linked List, menganalisis bagaimana proses setiap method dari class `praktikum/BinarySearchTree.java` bekerja, dan membuat method untuk mencetak nilai secara preOrder, inOrder, postOrder.