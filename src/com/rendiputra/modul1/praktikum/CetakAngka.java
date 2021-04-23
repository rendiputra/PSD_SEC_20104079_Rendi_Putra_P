package com.rendiputra.modul1.praktikum;

public class CetakAngka {
    public static void main(String[] args) {
        int a, b;
        for (a = 7; a >= 0; a--) {
            System.out.println();
            for (b = 7; b > a; b--) {
                System.out.print(b + " ");
            }
        }
    }

}
