package com.rendiputra.modul1.praktikum;

public class CetakAngka {
    public static void main(String[] args) {
        //Start time
        long begin = System.currentTimeMillis();

        //Starting the watch
        int a, b;
        for (a = 7; a >= 0; a--) {
            System.out.println();
            for (b = 7; b > a; b--) {
                System.out.print(b + " ");
            }
        }

        //End time
        long end = System.currentTimeMillis();

        long time = end-begin;
        System.out.println();
        System.out.println("Elapsed Time: "+time +" milli seconds");
    }

}
