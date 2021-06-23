# Modul00: Branch dan Pull Request

## Dasar Teori

- ### Branch

> Secara umum, **Branch** adalah bifurkasi dari kondisi kode yang membuat alur baru bagi evolusinya. Branch ini dapat dipararelkan ke Git branch lain yang kita buat. Seperti yang diketahui, kita dapat memasukkan fungsi baru ke dalam kode secara teratur dan tepat.

1. Tambahkan branch baru dengan nama modul00

```bash
$ git branch modul00
$ git checkout modul00
```

2. Lakukan perubahan file, setelah itu silahkan add semua perubahan

```bash
$ git add .
```

3. Lakukan commit dan silahkan isi pesan perubahan

```bash
$ git commit -m "isi komentar perubahan pada commit"
```

4. Lakukan push commit

```bash
$ git push origin modul00
```

- ### Pull Request

> **Pull Request** adalah istilah yang bisa kita artikan sebagai permintaan untuk menggabungkan kode.
Kita sudah membuat perubahan di hasil suatu Branch, lalu ingin menggabungkan dengan Branch sumber.
Maka kita harus membuat Pull Request.

> Setelah kita melakukan Pull Request biasanya admin atau owner akan melakukan review perubahan pada branch.
> Biasanya akan terjadi diskusi untuk membahas pull request yang telah kita buat.
> Apakah akan ditolak atau diterima?
> Kalau diterima, biasanya akan ada tulisan “Marged” berwarna ungu.
