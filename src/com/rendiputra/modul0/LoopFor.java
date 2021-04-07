package com.rendiputra.modul0;

import java.util.Scanner;

public class LoopFor {
    public static void main(String[] args) {
//        mencetak statment menggunakan looping

        System.out.print("Masukan loop akhir : ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        for (int i = 1; i <=a; i++){
            System.out.print(i +"  ");
        }


    }
}
