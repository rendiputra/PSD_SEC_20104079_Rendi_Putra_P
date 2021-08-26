package com.rendiputra.modul3.tugas.soal4;

public class Percobaan2 {
    public static long fib2(int n){
        if (n<=1)
            return n;
        else return fib2(n-1) + fib2(n-2);
    }

    public static void main(String[] args) {
        //Start time
        long begin = System.currentTimeMillis();

        //Starting the watch
        long bil = fib2(50);
        System.out.println(bil);

        //End time
        long end = System.currentTimeMillis();
        long time = end-begin;
        System.out.println();
        System.out.println("Elapsed Time: "+time +" milli seconds");
    }
}
