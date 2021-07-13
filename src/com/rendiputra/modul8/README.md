# Modul 8: Hash Map

## Dasar Teori

- ### Definisi Hash Map
HashMap adalah sebuah class yang berisi sekumpulan pasangan nilai (value) dan kunci (key). Nilai bisa dalam bentuk string, integer, boolean, float, double, dan objek. Sedangkan untuk key biasanya dalam bentuk string dan integer. HashMap bisa dibilang seperti Array asosiatif dalam Java. Tabel 1 terdiri dari pasangan key dan value, seperti inilah isi dari class atau objek HashMap.



| Key | Value |
| ----- | ----- |
| "Name" | "Rendi Putra Pradana" |
| "kelas" | "SE-04-C" |
| "email" | "20104079@ittelkom-pwt.ac.id" |


Tabel 1. Contoh HashMap


---
- ## Praktikum

**Soal praktikum:**
1. **Soal 1**:   Buatlah method main untuk menjalankan method-method HashMap!
2. **Soal 2**:   Jalankan masing-masing method dan tuliskan hasilnya!
3. **Soal 3**:  Analisis masing-masing kode pada method HashMap!
4. **Soal 4**:   Buatlah method remove untuk menghapus nilai berdasarkan input kunci!

---
**Jawaban**
1. [**Soal 1: Link source code file praktikum/Main.java**](https://github.com/rendiputra/PSD_SEC_20104079_Rendi_Putra_P/blob/modul8/src/com/rendiputra/modul8/praktikum/Main.java)

2. **Berikut Capture text hasil dari method main ketika dijalankan:**
```text
---Method isEmpty() dan size()---
Apakah hashMap kosong?? : true
Ukuran hashMap  : 0

---Method put()---

---Method size()---
Ukuran hashMap  : 4

---Method get()---
Nama    : Rendi Putra Pradana
Kelas   : SE-04-C
Email   : 20104079@ittelkom-pwt.ac.id
null?   : ini dari key 'null'

---Method containsKey() dan constainValue() ---
apakah key beneran Null?                            : true
apakah value berasal dari key yang bernilai Null?   : true
apakah key beneran Null?                            : false
apakah value berasal dari key yang bernilai Null?   : false

---Method remove() ---
Kelas   : SE-04-C
menghapus value dari key 'kelas'
Nama    : Rendi Putra Pradana
Kelas   : null
Email   : 20104079@ittelkom-pwt.ac.id
null?   : ini dari key 'null'

Process finished with exit code 0
```

3. **Analisis method pada class `HashMap.Java`:**
    - Method `isEmpty() `
      
        Digunakan untuk mengecek pengkodisian apakah nilai 'size == 0', jika bernilai 0 maka Method 'isEmpty()' akan mereturn nilai boolean true sebaliknya jika tidak bernilai 0 maka akan menghasilkan nilai boolean false. Lalu karena method `isEmpty()` adalah method **Function** maka method `isEmpty()` mengembalikan(return) nilai(bertipe data boolean).

   - Method `size()`
    
        Digunakan untuk mengembalikan/mereturn nilai ukuran dari hash map. Lalu karena method `size()` adalah method **Function** maka method `size()` mengembalikan(return) nilai(bertipe data integer).

   - Method `put()`
    
        Digunakan untuk menyimpan nilai kedalam hash map dengan cara melakukan hashing terlebih dahulu pada key lalu menyimpan lokasi entry pada alamat yang telah dihashing lalu mengeset kunci(`key`) & nilai(`value`) menggunakan method `setKey()` & `setValue()` kedalam turunan Class Entry() dan menyimpannya ke memory menggunakan script `table[location] = entryNew;`

   - Method `get()`
    
        Digunakan untuk membaca nilai didalam hash map dengan cara menyeleksi terlebih dahulu apakah nilai kuncinya(`key`) pada parameter adalah `null`? jika iya maka akan mencoba mengakses `table[0]` dan mereturn isi `value` nya menggunakan method `getValue()`, jika parameter `key` nya tidak `null` maka melakukan hashing terlebih dahulu pada `key`nya untuk mendapatkan lokasi memori pada memory, setelah dihashing maka akan mencoba mengakses memori menggunakan script `entry = table[location];` dan mereturn isi `value`nya  menggunakan method `getValue()`

   - Method `containsKey()`
    
        Digunakan untuk mengecek nilai `key`nya apakah bernilai null atau tidak? jika null maka akan mereturn nilai boolean `true`, jika tidak maka akan mereturn nilai boolean `false`. 

   - Method `containsValue()`
        Digunakan untuk mengecek nilai `value`nya apakah bernilai null atau tidak? jika null maka akan mereturn nilai boolean `true`, jika tidak maka akan mereturn nilai boolean `false`. 

   - Method `putForNullkey()`
        
        Digunakan untuk menyimpan nilai(`value`) dengan `key`nya bernilai `null`, dengan cara mengeset `key` dengan null menggunakan script `entryNew.setKey(null);` dan mengeset `value`nya menggunakan parameter yang telah dimasukan dan menyimpannya kedalam `table[0]` index ke 0.

   - Method `remove()`
    
        Digunakan untuk menghapus nilai(`value`) berdasarkan input kunci(`key`) dengan cara menghashing nilai `key`nya untuk mendapatkan lokasi memori pada index table dan mengosongkan nilai(`value`)nya pada table dengan index lokasi yang telah dihashing.

4. [**Soal 4:  Buatlah method remove untuk menghapus nilai berdasarkan input kunci!**](https://github.com/rendiputra/PSD_SEC_20104079_Rendi_Putra_P/blob/modul8/src/com/rendiputra/modul8/tugas/Main.java)

```JAVA
public V remove(K key) {
    int location = Hashing(key.hashCode());
    V ret = null;
    if(table[location].getKey() == key) {
        table[location] = null;
        size--;
    }
    return ret;
}
```

Berikut Capture text hasil dari program ketika dijalankan:

```text
---Method put()---

---Method get()---
Nama    : Rendi Putra Pradana
Kelas   : SE-04-C
Email   : 20104079@ittelkom-pwt.ac.id

---Method remove() ---
menghapus value dari key 'kelas'

Mengecek kembali isi hashMap
Nama    : Rendi Putra Pradana
Kelas   : null
Email   : 20104079@ittelkom-pwt.ac.id

Process finished with exit code 0
```

---
## Kesimpulan
Dimodul ke-8 ini kita mempelajari apa itu Hash Map, bagaimana cara pengimplementasian Hash Map, menganalisis bagaimana proses setiap method dari class `praktikum/HashMap.java` bekerja, dan membuat method remove untuk menghapus nilai berdasarkan input kunci.
