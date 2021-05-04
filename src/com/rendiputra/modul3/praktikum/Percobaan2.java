package com.rendiputra.modul3.praktikum;

public class Percobaan2 {
    public static long fib2(int n){
        if (n<=1)
            return n;
        else return fib2(n-1) + fib2(n-2);
    }

    public static void main(String[] args) {
        long bil = fib2(10);
        System.out.println(bil);
    }
}
