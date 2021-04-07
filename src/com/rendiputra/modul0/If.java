package com.rendiputra.modul0;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        int nilai;

        Scanner scan = new Scanner( (System.in));
        nilai = scan.nextInt();

        if(nilai>0){
            System.out.println("NIlai "+nilai+ " merupakan bilangan bulat positif");
        } else if(nilai<0){
            System.out.println("NIlai "+nilai+ " merupakan bilangan bulat negatif");
        } else {
            System.out.println("NIlai "+nilai+ " merupakan bilangan cacah");
        }
    }
}
