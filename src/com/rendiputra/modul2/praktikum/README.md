# Modul 1 + Modul 2
## Dasar Teori

- ### **Perulangan**
**Struktur perulangan** (atau dalam bahasa inggris disebut **loop**) adalah instruksi kode program yang bertujuan untuk mengulang beberapa baris perintah. Dalam merancang perulangan for, setidaknya kita harus mengetahui 3 komponen:
1. Kondisi **awal perulangan**.
2. Kondisi pada **saat perulangan**.
3. Kondisi yang harus dipenuhi agar **perulangan berhenti**.

Berikut contoh format dasar struktur perulangan for dalam bahasa Java:
```JAVA
for (start; condition; increment)
{
 // kode program
 // kode program
}
```

Penjelasan:
1. **Start** adalah kondisi pada saat awal perulangan. Biasanya kondisi awal ini berisi perintah untuk memberikan nilai kepada **variabel counter.** _Variabel counter_ sendiri adalah sebuah variabel yang menentukan berapa banyak perulangan dilakukan. Kebanyakan programmer menggunakan variabel i sebagai variabel counter (ini tidak harus, boleh juga memakai variabel lain).

2. **Condition** adalah kondisi yang harus dipenuhi agar perulangan berjalan. Selama kondisi  ini terpenuhi, maka _compiler_ bahasa Java akan terus melakukan perulangan. Misalnya condition ini berisi perintah **i < 7**, maka selama _variabel counter_ **i** berisi angka yang kurang dari 7, terus lakukan perulangan.

3. **Increment** adalah bagian yang dipakai untuk memproses variabel counter agar bisa memenuhi kondisi akhir perulangan. Bagian ini akan selalu di eksekusi di setiap perulangan.

Disebut increment karena biasanya berisi operasi increment seperti **i++**, yang sebenarnya sama dengan **i = i + 1**. Maksudnya, dalam setiap perulangan naikkan variabel i sebanyak 1 angka. Namun kita juga bisa memberikan nilai lain seperti **i = i + 2** sehingga variabel counter akan naik 2 angka setiap perulanganSebagai tambahan, terdapat istilah **iterasi** (_iteration_), yang berarti 1 kali perulangan. Istilah ini cukup sering dipakai ketika membahas tentang struktur perulangan.

- ### **Random**

Objek dari class **Random** dapat menghasilkan random untuk  boolean, byte, float, double, int, long dan nilai Gaussian , sementara **Math method random** hanya dapat menghasilkan nilai double dalam rentang 0.0 ≤ a < 1.0, dimana  a adalah nilai yang dikembalikan oleh method random.

Cara penggunaan Java Random Class:

```JAVA
import java.util.Random;
public static void main( String [ ] args ){
    Random random = new Random();
    int randomNumber = random.nextInt(1000);
    ...
}
```

- ### **Array (Larik)**
Array adalah organisasi kumpulan data homogen yang ukuran atau jumlah elemen maksimumnya telah diketahui dari awal. Array umumnya disimpan di memori komputer secara kontigu (berurutan). Deklarasi umum dari array di java adalah sebagai berikut:
```JAVA
tipe_data nama_var[panjang_elemen];
```

Sedangkan sintaks secara umum untuk mengakses variabel array adalah sebagai berikut:

```JAVA
nama_var[indeks];
```

Indeks array dalam bahasa java dimulai dari 0 sampai dengan indeks maksimum yakni
panjang elemen − 1
## **Soal LAPORAN PRAKTIKUM Modul 1 :**

1.  Kompilasi kode pada percobaan 1 – 4 dan tuliskan hasilnya!
2.  Analisa kode pada percobaan 1 – 4!
3.  Buatlah kode program Java untuk menampilkan hasil :

**Jawaban:**
1. [**Link Modul 1**](https://github.com/rendiputra/PSD_SEC_20104079_Rendi_Putra_P/tree/modul1/src/com/rendiputra/modul1/praktikum)
2. Analisis
- Program ke-1 :
  Untuk membuat program untuk mencetak segitiga, dibutuhkan dua perulangan, yaitu outer for dan inner for. Outer for berfungsi untuk membuat  baris sebanyak 5 kali dari segitiga yang akan dibuat.ng diikuti dengan println() setelah inner for. Sedangkan inner for berfungsi untuk mencetak bintang yang nantinya akan membentuk segitiga.

- Program ke-2 :
  Pada program segitiga versi ke-2, menggunakkan satu outer for dan dua inner  for. Inner for pertama berfungsi untuk mencetak spasi. Variabel j = 1 sebagai  nilai awal pada perulangan, lalu j > i merupakan kondisi yang harus dipenuhi  agar perulangannya berhenti, dan j-- berfungsi sebagai iterator yang  beroperasi secara decrement. Inner for kedua berfungsi untuk mencetak
  bintang untuk membentuk segitiga penuh dengan cara membandingkan nilai i yang dikali dua lalu dibandingkan dengan nilai k.

- Program ke-3 :
  Pada program ini, terdapat satu outer for dan satu inner for. Variabel a dan b  dideklarasikan sebelum perulangan for agar keduanya dapat digunakan secara public. Outer for digunakkan untuk membuat baris dengan kondisi yang telah ditentukan. Inner for digunakan untuk mencetak angka pada variabel b di setiap kondisi perulangan.

- Program ke-4 :
  Pertama deklarasikan variabel input sebagai scanner yang berfungsi untuk memasukkan nilai. Lalu deklarasikan variabel luas dan phi sebagai double  dengan nilai phi 3.14 dan r sebagai integer. Variabel r akan digunakan untuk  menyimpan inputan yang nantinya akan digunakan pada operasi menghitung luas. Lalu isi variabel luas dengan rumus lingkaran. Setelah itu luas yang telah dihitung akan dicetak dengan statement println() dengan memanggil variabel k di dalamnya.

3. source Code:
   [**Link Source Code**](https://github.com/rendiputra/PSD_SEC_20104079_Rendi_Putra_P/blob/modul1/src/com/rendiputra/modul1/tugas/CetakAngka.java)

## **Soal LAPORAN PRAKTIKUM Modul 2 :**

1. Kompilasi kode pada percobaan 1 – 4 dan tuliskan hasilnya!
2. Analisa kode pada percobaan 1 – 4!
3. Modifikasi kode program pada percobaan 1 – 4 sehingga array a dapat memuat 1000 elemen dan tambahkan nilai elemen pada array yang baru dengan menggunakan fungsi random!
4. Hitung waktu yang dibutuhkan untuk mendapatkan hasilnya setelah dimodifikasi!


**Jawaban :**
1. [**Link Modul 2**](https://github.com/rendiputra/PSD_SEC_20104079_Rendi_Putra_P/tree/modul1/src/com/rendiputra/modul2/praktikum)
2.  Analisa:
- Program ke-1:
  Method maxSubSum1 terdapat parameter integer array a[], variabel maxsum dan thisSum sebagai integer dan tiga buah perulangan for. Fungsi ini  digunakan untuk menetapkan nilai dari maxSum menjadi nilai thisSum jika kondisi yang ada di perulangan telah terpenuhi. Method random berguna untuk memberi masukan di dalam array a sebanyak 1000 nilai yang acak. Lalu dijalankan oleh fungsi main dengan menambahkan nilai array a menggunakan fungsi random sebagai inputan. Untuk menghitung waktu eksekusi dari program menggunakan variabel start, end, dan relapsed. Variabel relapsed berisi pengurangan dari variabel end dikurang variabel end. Yang akhirnya akan mengeluarkan nilai maxSum dan waktu eksekusi program.

- Program ke-2:
  Method maxSubSum2 terdapat parameter integer array a[], variabel maxsum dan thisSum sebagai integer dan tiga buah perulangan for. Fungsi ini digunakan untuk menetapkan nilai dari maxSum menjadi nilai thisSum jika kondisi yang ada di perulangan telah terpenuhi. Method random berguna untuk memberi masukan di dalam array a sebanyak 1000 nilai yang acak. Lalu dijalankan oleh fungsi main dengan menambahkan nilai array a menggunakan fungsi random sebagai inputan. Untuk menghitung waktu eksekusi dari program menggunakan variabel start, end, dan relapsed. Variabel relapsed berisi pengurangan dari variabel end dikurang variabel end. Yang akhirnya akan mengeluarkan nilai maxSum dan waktu eksekusi program.

- Program ke-3:

> Pada method maxSumRec terdapat a sebagai array lalu left dan right sebagai integer. Terdapat kondisi jika nilai left sama dengan nilai right maka nilai yang digunakkan adalah nilai left. Jika kondisinya tidak terpenuhi maka nilainya menjadi 0. Variabel center berfungsi untuk mencari nilai tengah dengan rumus  left+right/2. Variabel maxLeftSum dan maxRightSum berfungsi sebagai
> rekursif. For pertama berfungsi untuk menetapkan nilai maxLeftBordersum = leftBorderSum jika kondisi if leftBorderSum > maxLeftBorderSumterpenuhi[19]. Begitu juga dengan maxRightBorderSum = rightBorderSum[27]. Lalu For ketiga akan memberikan keluaran dari nilaimaxLeftSum, maxRightSum, maxLeftBorderSum, maxRightBorderSum, dan maxRightBorderSum.

> Dalam method max3 terdapat parameter integer a, b, c yang akan menampilkan nilai jika kondisi a>b maka akan membandingkan a>c jika kondisinya benar akan mengeluarkan nilai a dan akan mengeluarkan c jika kondisinya tidak terpenuhi. Method randomberguna untuk memberi masukan di dalam array a sebanyak 1000 nilai yang acak. Lalu dijalankan oleh fungsi main dengan menambahkan nilai array a menggunakan fungsi random sebagai inputan. Untuk menghitung waktu eksekusi dari program menggunakan  variabel start, end, dan relapsed. Variabel relapsed berisi pengurangan dari variabel end dikurang variabel end. Yang akhirnya akan mengeluarkan nilai maxSum dan waktu eksekusi program. Untuk menghitung waktu eksekusi
> dari program menggunakan variabel start, end, dan relapsed. Variabel relapsed berisi pengurangan dari variabel end dikurang variabel end. Yang akhirnya akan mengeluarkan nilai maxSum dan waktu eksekusi program.

- Program ke-4:
  Pada method maxSubSum4 terdapat parameter a sebagai array dengan tipe data integer, variabel maxSum, dan thisSum. Pada perulangan for terdapat kondisi perulangan jika j<a.length maka nilai j akan bertambah 1. Didalam for terdapat percabangan if dengan kondisi jika thisSum > maxSum maka nilai maxSum menjadi nilai thisSum. Namun jika thisSum < 0 maka nilai thisSum menjadi 0. Method random berguna untuk memberi masukan di dalam array a sebanyak 1000 nilai yang acak. Lalu dijalankan oleh fungsi main dengan menambahkan nilai array a menggunakan fungsi randomsebagai inputan. Untuk menghitung waktu eksekusi dari program menggunakan variabel start, end, dan relapsed. Variabel relapsed berisi pengurangan dari variabel end dikurang variabel end. Yang akhirnya akan mengeluarkan nilai maxSum dan waktu eksekusi program.

3. Hitung runtime source code saat dijalankan:
- Program ke-1:
  1297 milli seconds

- Program ke-2:
  7 milli seconds

- Program ke-3:
  354 milli seconds

- Program ke-4:
  3 milli seconds

## **Kesimpulan Modul 1 dan 2**

> Pada modul ke-1 mengulas kembali tentang perulangan for pada Java. Materi yang diulas meliputi komponen yang ada pada operasi for, logika perulangan dan pengimpletasiannya. Dalam mengimplementasikan perulangan for, contoh kasus yang digunakan yaitu pembuatan berbagai macam segitiga. Selain perulangan for, modul juga membahas implementasi perhitungan aritmatika pada Java dengan menghitung luas lingkaran.

> Pada modul ke-2, mahasiswa dapat memahami dengan jelas yang dibahas. Materi yang  tercakup dalam modul ini meliputi komponen perulangan for dan rekursi. Selain perulangan for, terdapat juga implementasi array yang dapat menyelesaikan masalah pencarian jumlah array maksimum dengan menghitung eksekusi Java secara rekursif.


