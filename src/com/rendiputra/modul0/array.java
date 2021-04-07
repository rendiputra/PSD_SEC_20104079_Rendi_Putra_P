package com.rendiputra.modul0;

import java.util.Scanner;

public class array {// membuat class "array"
    public static void main(String[] args) {
        String[] Buah = new String[]{
                "apel", "jeruk"
        };
        int a=0;
        for (String i : Buah) {
            a++;
            System.out.println("Index ke-"+a+" adalah "+i);
        }
    }
}
