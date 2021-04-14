package com.rendiputra.modul00.praktikum;

public class fibbonaci {
    public static void main(String[] args) {
//      0, 1, 1, 2, 3, 5, 8, 13, ...
        int a1, a2, hasil, akhir;
        a1 = 0;
        a2 = 1;
        akhir = 20;
        System.out.println("1. "+a1);
        System.out.println("2. "+a2);

        for (int i=3; i<akhir; i++){
            hasil = a1 +a2;
            System.out.println(i+".  "+hasil);
            a1 =a2;
            a2 = hasil;
        }
    }
}
