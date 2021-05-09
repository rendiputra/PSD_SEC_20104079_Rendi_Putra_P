package com.rendiputra.modul4.praktikum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /** Deklarasi */
        Scanner scan = new Scanner(System.in);
        Linked link = new Linked();
        char ulang = 'Y';
        int input, index;

        /** Cek data */
        if(link.isEmpty()) {
            System.out.println("List Kosong");
        }


        /** Add First */
        System.out.println("\nAdd First");
        do{
            Node node = new Node();
            System.out.print("Masukan data\t: ");
            input = scan.nextInt();

            node.data = input;
            link.addFirst(node);
            System.out.print("\nApakah ingin menambah data lagi? (Y/N) : ");
            ulang = scan.next().toUpperCase().charAt(0);
        }while (ulang == 'Y');
        System.out.print("Panjang data saat ini: ");
        link.length(); // print linked list
        System.out.print("Data saat ini: ");
        link.printNode(); // print linked list

/**
        /** Add Last
        System.out.println("\n\nAdd Last");
         do{
            Node node = new Node();
            System.out.print("Masukan data\t: ");
            int input = scan.nextInt();

            node.data = input;
            System.out.println(node.data);
            link.addLast(node);
        }
        System.out.print("Panjang data saat ini: ");
        link.length(); // print linked list
        System.out.print("Data saat ini: ");
        link.printNode(); // print linked list
*/

        /** Insert After */
        System.out.println("\n\nInsert After");
        do{
            Node node = new Node();

            System.out.print("Data saat ini: ");
            link.printNode(); // print linked list
            System.out.print("Masukan key\t: ");
            int key = scan.nextInt();
            System.out.print("Masukan data\t: ");
            input = scan.nextInt();

            node.data = input;
            link.insertAfter(key, node);

            System.out.print("\nApakah ingin menambah data lagi? (Y/N) : ");
            ulang = scan.next().toUpperCase().charAt(0);
        }while (ulang == 'Y');
        System.out.print("Panjang data saat ini: ");
        link.length(); // print linked list
        System.out.print("Data saat ini: ");
        link.printNode(); // print linked list


        /** Insert Before */
        System.out.println("\n\nInsert Before");
        do{
            Node node = new Node();

            System.out.print("Masukan Index\t: " );
            index = scan.nextInt();
            System.out.print("Masukan data\t: ");
            input = scan.nextInt();

            node.data = input;
            link.insertBefore(index, node);

            System.out.print("\nApakah ingin menambah data lagi? (Y/N) : ");
            ulang = scan.next().toUpperCase().charAt(0);
        }while (ulang == 'Y');
        System.out.print("Panjang data saat ini: ");
        link.length(); // print linked list
        System.out.print("Data saat ini: ");
        link.printNode(); // print linked list


        /** Insert */
        System.out.println("\n\nInsert");
        do{
            Node node = new Node();

            System.out.print("Masukan Index\t: ");
            index = scan.nextInt();
            System.out.print("Masukan data\t: ");
            input = scan.nextInt();

            node.data = input;
            link.insert(index, node);

            System.out.print("\nApakah ingin menambah data lagi (Y/N) : ");
            ulang = scan.next().toUpperCase().charAt(0);
        }while (ulang == 'Y');
        System.out.print("Panjang data saat ini: ");
        link.length(); // print linked list
        System.out.print("Data saat ini: ");
        link.printNode(); // print linked list


        /** Replace Data */
        System.out.println("\nReplace data");
        System.out.print("Input key data yang ingin diganti : ");
        int key =  scan.nextInt();
        System.out.print("Input data baru : ");
        int data = scan.nextInt();

        link.replace(key, data);
        System.out.print("Panjang data saat ini: ");
        link.length(); // print linked list
        System.out.print("Data saat ini: ");
        link.printNode(); // print linked list


        /** Remove Data */
        System.out.println("\nRemove Data");
        System.out.print("Input data yang akan dihapus: ");
        int delete = scan.nextInt();

        link.remove(delete);
        System.out.print("Panjang data saat ini: ");
        link.length(); // print linked list
        System.out.print("Data saat ini: ");
        link.printNode(); // print linked list


        /** Remove First */
        link.removeFirst();
        System.out.print("\nPanjang data saat ini: ");
        link.length(); // print linked list
        System.out.print("Data saat ini: ");
        link.printNode(); // print linked list


        /** Remove Last */
        link.removeLast();
        System.out.print("\nPanjang data saat ini: ");
        link.length(); // print linked list
        System.out.print("Data saat ini: ");
        link.printNode(); // print linked list


        /** Find */
        System.out.println("\nMencari data: ");
        System.out.print("Masukan data yang ingin dicari: ");
        int cari = scan.nextInt();

        link.find(cari);
        System.out.print("\nPanjang data saat ini: ");
        link.length(); // print linked list
        System.out.print("Data saat ini: ");
        link.printNode(); // print linked list


        /** Remove At */

    }




}