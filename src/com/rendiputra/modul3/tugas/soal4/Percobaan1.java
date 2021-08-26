package com.rendiputra.modul3.tugas.soal4;

public class Percobaan1 {
    public static long fib1(long Num){
        if (Num == 0)
            return 0;
        else if (Num == 1)
            return 1;
        else{
            long x = 0;
            long y = 1;
            for(long k =2; k<=Num; k++){
                y = x + y;
                x = y - x;
            }
            return y;
        }
    }

    public static void main(String[] args) {
        //Start time
        long begin = System.currentTimeMillis();

        //Starting the watch
        long bil = fib1(50);
        System.out.println(bil);

        //End time
        long end = System.currentTimeMillis();
        long time = end-begin;
        System.out.println();
        System.out.println("Elapsed Time: "+time +" milli seconds");
    }
}
