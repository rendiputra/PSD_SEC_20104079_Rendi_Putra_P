package com.rendiputra.modul0;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int noHari;

        System.out.print("Masukan nomor hari (1-7): ");
        noHari =  scan.nextInt();

        switch (noHari){
            case 1:
                System.out.println("Minggu");
                break;
            case 2:
                System.out.println("Senin");
                break;
            case 3:
                System.out.println("Selasa");
                break;
            case 4:
                System.out.println("Rabu");
                break;
            case 5:
                System.out.println("Kamis");
                break;
            case 6:
                System.out.println("Jum'at");
                break;
            case 7:
                System.out.println("Sabtu");
                break;
            default:
                System.out.println("Silahkan masukan nomor hari dengan benar");

        }
    }
}
