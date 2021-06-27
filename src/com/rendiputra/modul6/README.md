# Modul6: Stack

## Dasar Teori

- ###  Stack
**Definisi Stack**
> **Stack** adalah sebuah himpunan dinamik(Dynamic set), dimana aksi pemasukan dan penghapusan elemen hanya dapat dilakukan melalui tumpukan terakhir (bagian atas atau puncak) dari stack.

**Stack** dapat diibaratkan sebagai tumpukan piring (_stack of plates_) dimana pemasukan (penumpukan) piring yang baru dan pengambilan piring hanya dapat dilakukan pada bagian atas tumpukan (_top of stack_).

Jika **stack** kita anggap contoh sebuah list, maka **stack** adalah sebuah list yang dimana aksi pemasukan dan penghapusan elemen hanya dapat dilakukan pada satu posisi, yakni bagian **akhir list**.

Beberapa istilah dalam **stack**:
a. Aksi `Insert` disebut dengan **PUSH**.
b. Aksi `Delete` disebut dengan **POP**.
c. Elemen yang dapat dihapus pada `STACK` adalah elemen yang baru saja dimasukan (_most recently inserted_). Dengan kata lain, elemen yang dapat dihapus adalah pada puncak `stack`. Aturan ini disebut **LIFO**(_Last In, First Out_).



---
- ## Praktikum

**Soal praktikum:**
1. **Soal 1**:  Buatlah method main untuk menjalankan method-method Stack!
2. **Soal 2**:  Jalankan masing-masing method dan tuliskan hasilnya!
3. **Soal 3**:  Analisis masing-masing kode pada method Stack!
4. **Soal 4**:  Buatlah program Java menggunakan Stack untuk konversi bilangan biner ke decimal!


---
**Jawaban**

1. [**Soal 1: Link source code file praktikum/Main.java**](https://github.com/rendiputra/PSD_SEC_20104079_Rendi_Putra_P/blob/modul6/src/com/rendiputra/modul6/praktikum/Main.java)

2. **Berikut Capture text hasil dari method main ketika dijalankan:**
```text
---Method isEmpty()---
is empty? : Empty
Data saat ini: 
Stack kosong !

---Method push()---
Data saat ini: 
5
4
3
2
1

---pop()---
Yang di POP: 5
Data saat ini: 
4
3
2
1

---top()---
Data paling atas: 4
Data saat ini: 
4
3
2
1

---topAndPop()---
Yang di POP: 4
Nilai nodeTopAndPop.data: 4
Data saat ini: 
3
2
1

---makeEmpty()---
Data berhasil dihapus semua !
Data saat ini: 
Stack kosong !

Process finished with exit code 0
```

3. **Analisis method pada class `Stack()`:**

  - Method `isEmpty() `
    Digunakan untuk mengecek pengkodisian apakah `tos`(List terakhir pada `stack`) bernilai kosong, maka digunakan syntax berikut: `tos == null;`. Lalu karena method `isEmpty()` adalah method **Function** maka method `isEmpty()` mengembalikan(return) nilai(bertipe data boolean).
  
  - Method `Push()`
  Digunakan untuk menambahkan nilai pada urutan paling atas sebuah tumpukan(Stack). Penjelasan: jika nilai `tos == null`(tumpukan kosong) maka nilai `tos` akan diisi oleh nilai `input`, dan  jika nilai tumpukan tidak kosong maka akan dilakukan penambahan nilai pada urutan paling atas tumpukan. Lalu karena method `Push()` adalah method prosedur(void) maka method `Push()` tidak mereturn nilai apapun.
  
  - Method `pop()`
    Digunakan untuk mendelete data paling atas pada sebuah tumpukan(Stack). Penjelasan: jika nilai `tos != null` maka data paling atas dalam tumpukan akan dihapus. Lalu karena method `pop()` adalah method prosedur(void) maka method `pop()` tidak mereturn nilai apapun. 
  
  - Method `show()`
    Digunakan untuk menampilkan nilai pada tumpukan(Stack). Penjelasan: jika nilai `tos != null`(tumpukan tidak sedang kosong) dan selama nilai `temp != null` maka akan menampilkan isi tumpukan(Stack). Lalu karena method `show()` adalah method prosedur(void) maka method `show()` tidak mereturn nilai apapun. 
    
  - `Node top()`
  Digunakan untuk mereturn(mengembalikan) nilai tumpukan(Stack) urutan paling atas. Penjelasan: nilai `Node temp` diambil dari nilai `tos`(_Top of Stack_) lalu mereturn nilai `temp`. 
  
  - `Node topAndPop()`
    Digunakan untuk mereturn(mengembalikan) nilai tumpukan(Stack) urutan paling atas lalu mendeletenya dari tumpukan(Stack). Penjelasan: nilai `Node temp` diambil dari nilai `tos`(_Top of Stack_) lalu mereturn nilai `temp` setelah itu kita memanggil method `pop()` untuk mendelete tumpukan paling atas. 
  
  - Method `makeEmpty()`
  Digunakan untuk mengosongkan(format delete) nilai pada tumpukan(stack). Penjelasan: nilai `tos == null`(nilai `Node tos` dikosongkan). Lalu karena method `makeEmpty()` adalah method prosedur(void) maka method `makeEmpty()` tidak mereturn nilai apapun. 
  
4. [**Soal 4: Program konversi bilangan biner ke desimal menggunakan implementasi Stack, Link source code file tugas/Main.java**](https://github.com/rendiputra/PSD_SEC_20104079_Rendi_Putra_P/blob/modul6/src/com/rendiputra/modul6/tugas/Main.java)
  
---

## Kesimpulam
Dimodul ke-6 ini kita mempelajari apa itu stack, bagaimana cara pengimplementasian pada stack(penumpukan), menganalisis bagaimana proses setiap method dari class `praktikum/Stack.java` bekerja, dan juga pengimplemtasian stack pada program konversi bilangan biner ke bilangan desimal.