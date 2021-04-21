package com.rendiputra.modul1.praktikum;

import java.util.Scanner;

public class LuasLingkaran {
    public static void main(String[] args) {
        //Start time
        long begin = System.currentTimeMillis();

        //Starting the watch
        Scanner input = new Scanner(System.in);
        double luas, phi = 3.14;
        int r;
        System.out.print("Masukan Jari-jari : ");
        r = input.nextInt();
        luas = phi*r*r;
        System.out.println("Luas Lingkaran = "+luas);

        //End time
        long end = System.currentTimeMillis();

        long time = end-begin;
        System.out.println();
        System.out.println("Elapsed Time: "+time +" milli seconds");
    }
}
