package com.rendiputra.modul00.tugas;

// import library
import java.util.ArrayList;
import java.util.Scanner;

public class rental_kendaraan {

    // method main
    public static void main(String[] args) {
        transaksi(); // memanggil function transaksi()
    }

    // berfungsi sebagai menampilkan menu dan mengembalikan nilai menu
    static String tampilMenu(){
        Scanner scan = new Scanner(System.in);
        int jenisKendaraan;
        String menu;
        System.out.print(
                "\nMenu jenis kendaraan:\n" +
                "1. Motor\n" +
                "2. Mobil\n" +
                "Masukan pilihan menu: "
        );
        jenisKendaraan = scan.nextInt();

        switch (jenisKendaraan){
            case 1:
                System.out.print(
                        "\nMenu brand motor:\n" +
                        "1. Honda Beat\n" +
                        "2. Honda Vario\n" +
                        "3. Honda Scoopy\n" +
                        "Masukan pilihan menu: "
                );
                menu = "a" + scan.next(); // string "a" berfungsi sebagai representrasi motor
                break;
            case 2:
                System.out.print(
                        "\nMenu brand mobil: \n" +
                        "1. Daihatsu Ayla\n" +
                        "2. Toyota Avanza\n" +
                        "3. Toyota Innova\n" +
                        "Masukan pilihan menu: "
                );
                menu = "b" + scan.next(); // string "b" berfungsi sebagai representrasi mobil
                break;
            default:
                System.out.println("Invalid Input!");
                menu = "-";
        }
        return menu; // mengembalikan method tampilMenu() dengan variable menu
    }


    static void transaksi(){
        ArrayList<String> arrayKendaraan = new ArrayList<>();// <--
        ArrayList<Integer> arrayDurasi = new ArrayList<>(); // Deklarasi ArrayList untuk menampung data transaksi
        ArrayList<Double> arrayBiaya = new ArrayList<>(); // -->
        Scanner scan = new Scanner(System.in);
        char loopMenu;
        double  biaya,
                harga; // harga sewa perhari
        int durasi; // durasi dalam satuan hari
        String kendaraan = "";
        do {
            String menu = tampilMenu(); // menampilkan dan memilih menu

            //menghitung biaya sewa kendaraan
            switch (menu){
                case "a1":
                    kendaraan = "Honda Beat   ";
                    harga = 125000;
                    System.out.println("\nHarga sewa perhari: " + harga);
                    System.out.print("Masukan berapa lama waktu sewa kendaraan(Hari): ");
                    durasi = scan.nextInt();
                    biaya = harga * durasi;
                    System.out.println("Biaya sewa kendaraan sebanyak Rp. " + biaya);

                    // Menyimpan data ke arrayList
                    arrayKendaraan.add(kendaraan);
                    arrayDurasi.add(durasi);
                    arrayBiaya.add(biaya);
                    break;

                case "a2":
                    kendaraan = "Honda Vario  ";
                    harga = 135000;
                    System.out.println("\nHarga sewa perhari: " + harga);
                    System.out.print("Masukan berapa lama waktu sewa kendaraan(Hari): ");
                    durasi = scan.nextInt();
                    biaya = harga * durasi;
                    System.out.println("Biaya sewa kendaraan sebanyak Rp. " + biaya);

                    // Menyimpan data ke arrayList
                    arrayKendaraan.add(kendaraan);
                    arrayDurasi.add(durasi);
                    arrayBiaya.add(biaya);
                    break;

                case "a3":
                    kendaraan = "Honda Scoopy";
                    harga = 145000;
                    System.out.println("\nHarga sewa perhari: " + harga);
                    System.out.print("Masukan berapa lama waktu sewa kendaraan(Hari): ");
                    durasi = scan.nextInt();
                    biaya = harga * durasi;
                    System.out.println("Biaya sewa kendaraan sebanyak Rp. " + biaya);

                    // Menyimpan data ke arrayList
                    arrayKendaraan.add(kendaraan);
                    arrayDurasi.add(durasi);
                    arrayBiaya.add(biaya);
                    break;

                case "b1":
                    kendaraan = "Daihatsu Ayla";
                    harga = 500000;
                    System.out.println("\nHarga sewa perhari: " + harga);
                    System.out.print("Masukan berapa lama waktu sewa kendaraan(Hari): ");
                    durasi = scan.nextInt();
                    biaya = harga * durasi;
                    System.out.println("Biaya sewa kendaraan sebanyak Rp. " + biaya);

                    // Menyimpan data ke arrayList
                    arrayKendaraan.add(kendaraan);
                    arrayDurasi.add(durasi);
                    arrayBiaya.add(biaya);
                    break;

                case "b2":
                    kendaraan = "Toyota Avanza";
                    harga = 650000;
                    System.out.println("\nHarga sewa perhari: " + harga);
                    System.out.print("Masukan berapa lama waktu sewa kendaraan(Hari): ");
                    durasi = scan.nextInt();
                    biaya = harga * durasi;
                    System.out.println("Biaya sewa kendaraan sebanyak Rp. " + biaya);

                    // Menyimpan data ke arrayList
                    arrayKendaraan.add(kendaraan);
                    arrayDurasi.add(durasi);
                    arrayBiaya.add(biaya);
                    break;

                case "b3":
                    kendaraan = "Toyota Innova";
                    harga = 750000;
                    System.out.println("\nHarga sewa perhari: " + harga);
                    System.out.print("Masukan berapa lama waktu sewa kendaraan(Hari): ");
                    durasi = scan.nextInt();
                    biaya = harga * durasi;
                    System.out.println("Biaya sewa kendaraan sebanyak Rp. " + biaya);

                    // Menyimpan data ke arrayList
                    arrayKendaraan.add(kendaraan);
                    arrayDurasi.add(durasi);
                    arrayBiaya.add(biaya);
                    break;

                default:
                    break;
            }
            System.out.print("\nApakah anda ingin melakukan transaksi lagi? ('Y'/'N') : ");
            loopMenu = scan.next().toUpperCase().charAt(0); // konvert kedalam bentuk UpperCase dan mengambil karakter paling awal
        }while (loopMenu == 'Y');

        //mengirim nilai ArrayList ke dalam method rekapTransaksi() melalui parameter method
        rekapTransaksi(arrayKendaraan, arrayDurasi, arrayBiaya); // memanggil method rekapTransaksi()
    }

    // membuat rekap transaksi(Struk)
    static void rekapTransaksi(ArrayList<String> arrayKendaraan, ArrayList<Integer> arrayDurasi, ArrayList<Double> arrayBiaya){
        double harga,
            total = 0;
        bubbleSort(arrayKendaraan, arrayDurasi, arrayBiaya); // memanggil function bubbleSort()
        System.out.println(
                "\n\n=========================================================================\n" +
                "\t\t\t\t\t\t\tRekap Transaksi\n" +
                "=========================================================================\n" +
                "Kendaraan\t\t\tDurasi Sewa\t\tharga\t\t\t\tSubTotal\n" +
                "-------------------------------------------------------------------------"
        );
        // mengeluarkan data dari ArrayList
        for (int i = 0; i < arrayKendaraan.size(); i++) {
            harga = arrayBiaya.get(i) / arrayDurasi.get(i);
            total += arrayBiaya.get(i);
            System.out.println(
                    arrayKendaraan.get(i)+ "\t\t" +
                    arrayDurasi.get(i) + " hari" + "\t\t\t" +
                    "Rp. " + harga + "\t\t" +
                    "Rp. " + arrayBiaya.get(i)
            );
        }
        System.out.println(
                "-------------------------------------------------------------------------\n" +
                "\t\t\t\t\t\t\t\t\tTotal:\t\t\t\t" + "Rp. " + total + "\n" +
                "========================================================================="
        );
    }

    // mengurutkan ArrayList berdasarkan huruf awal dari nama kendaraan dengan metode pengurutan bubbleSort
     static void bubbleSort(ArrayList<String> arrayKendaraan, ArrayList<Integer> arrayDurasi, ArrayList<Double> arrayBiaya){
        for (int i = 0; i < arrayKendaraan.size(); i++){
            for( int j=0; j < arrayKendaraan.size()-1; j++){
                // berdasarkan huruf awal dari nama kendaraan
                if (arrayKendaraan.get(j).compareTo(arrayKendaraan.get(j+1)) > 0 ){
                    // mengurutkan arrayKendaraan berdasarkan huruf awal dari nama kendaraan
                    String sementaraKendaraan = arrayKendaraan.get(j);
                    arrayKendaraan.set(j, arrayKendaraan.get(j+1));
                    arrayKendaraan.set(j+1, sementaraKendaraan);

                    // mengurutkan arrayDurasi berdasarkan huruf awal dari nama kendaraan
                    int sementaraDurasi = arrayDurasi.get(j);
                    arrayDurasi.set(j, arrayDurasi.get(j+1));
                    arrayDurasi.set(j+1, sementaraDurasi);

                    // mengurutkan arrayBiaya berdasarkan huruf awal dari nama kendaraan
                    double sementaraBiaya = arrayBiaya.get(j);
                    arrayBiaya.set(j, arrayBiaya.get(j+1));
                    arrayBiaya.set(j+1, sementaraBiaya);
                }
            }
        }
    }

}


/*
    Materi:

    1. Input/Output: menggunakan library Scanner
    2. Percabangan: tertdapat di baris 26, 67, 204
    3. Perulangan: terdapat di baris 63, 182, 201, 202
    4. Array: terdapat di baris 54, 55, 56
    5. Method: terdapat di baris 53, 170, 200
    6. Sorting: terdapat di baris 200

 */