package com.rendiputra.modul1.tugas;

public class CetakAngka {
    public static void main(String[] args) {
        int angka = 1;
        for (int i = 1 ; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(angka + " ");
                angka++;
                if (angka == 10){
                    angka = 0;
                }
            }
            System.out.println();
        }
    }
}
