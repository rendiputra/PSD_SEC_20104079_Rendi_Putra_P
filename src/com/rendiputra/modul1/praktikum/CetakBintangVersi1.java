package com.rendiputra.modul1.praktikum;

public class CetakBintangVersi1 {
    public static void main(String[] args) {
        //Start time
        long begin = System.currentTimeMillis();

        //Starting the watch
        int i, j;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //End time
        long end = System.currentTimeMillis();

        long time = end-begin;
        System.out.println();
        System.out.println("Elapsed Time: "+time +" milli seconds");
    }

}
