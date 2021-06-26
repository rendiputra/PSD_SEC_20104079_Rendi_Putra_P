package com.rendiputra.modul6.tugas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("---Konversi bilangan biner ke desimal---");

        Scanner scanner = new Scanner(System.in);
        Stack stack = new Stack();
        char ulang = 'Y';
        do {
            System.out.print("\nMasukkan bilangan biner : ");
            int bil = scanner.nextInt();
            int i = 0, dec = 0;
            while (bil > 0) {
                int temp = bil % 10;
                dec += (int) (temp * Math.pow(2, i));
                bil /= 10;
                stack.push(new Node(dec));
                i++;
            }
            System.out.print("Hasil Biner ke Desimal : ");
            stack.pop();
            System.out.print("\nApakah anda ingin mengulang perhitungan lagi? (Y/N): ");
            ulang = scanner.next().toUpperCase().charAt(0);
        } while (ulang == 'Y');

    }
}
