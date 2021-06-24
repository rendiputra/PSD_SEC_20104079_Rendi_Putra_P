package com.rendiputra.modul5.praktikum;

import com.rendiputra.modul5.praktikum.DoubleLinkedList;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /** Deklarasi */
        Scanner scan = new Scanner(System.in);
        DoubleLinkedList DL = new DoubleLinkedList(); // insialisasi DL sebagai class DoubleLinkedList()
        char ulang = 'Y';
        int input, index, key;

        /** Cek data (isEmpty()) */
        System.out.println("---Method isEmpty()---");
        if (DL.isEmpty()) {
            System.out.println("Check data kosong: List Kosong");
        }


        /** method  addFirst() */
        System.out.println("\n---Method addFirst()---");
        do {
            System.out.print("Masukan data:\t");
            input = scan.nextInt();
            Node nodeInput = new Node(input);
            DL.addFirst(nodeInput);
            System.out.print("Apakah ingin mengulang method lagi? (Y/N): ");
            ulang = scan.next().toUpperCase().charAt(0);
        } while (ulang == 'Y');
        System.out.print("Data saat ini: ");
        DL.show();


        /** method  addLast() */
        System.out.println("\n---Method addLast()---");
        do {
            System.out.print("Masukan data:\t");
            input = scan.nextInt();
            Node nodeInput = new Node(input);
            DL.addLast(nodeInput);
            System.out.print("Apakah ingin mengulang method lagi? (Y/N): ");
            ulang = scan.next().toUpperCase().charAt(0);
        } while (ulang == 'Y');
        System.out.print("Data saat ini: ");
        DL.show();


        /** method removeFirst() */
        System.out.println("\n---Method removeFirst()---");
        DL.removeFirst();
        System.out.print("Data saat ini: ");
        DL.show();


        /** method  addLast() */
        System.out.println("\n---Method addLast() lagi---");
        do {
            System.out.print("Masukan data:\t");
            input = scan.nextInt();
            Node nodeInput = new Node(input);
            DL.addLast(nodeInput);
            System.out.print("Apakah ingin mengulang method lagi? (Y/N): ");
            ulang = scan.next().toUpperCase().charAt(0);
        } while (ulang == 'Y');
        System.out.print("Data saat ini: ");
        DL.show();


        /** method removeLast() */
        System.out.println("\n---Method removeLast()---");
        DL.removeLast();
        System.out.print("Data saat ini: ");
        DL.show();


        /** method  insert() */
        System.out.println("\n---Method insert()---");
        do {
            System.out.print("Masukan index:\t");
            index = scan.nextInt();
            System.out.print("Masukan data:\t");
            input = scan.nextInt();
            Node nodeInput = new Node(input);
            DL.insert(index, nodeInput);
            System.out.print("Apakah ingin mengulang method lagi? (Y/N): ");
            ulang = scan.next().toUpperCase().charAt(0);
        } while (ulang == 'Y');
        System.out.print("Data saat ini: ");
        DL.show();


        /** method  replace() */
        System.out.println("\n---Method replace()---");
        do {
            System.out.print("Masukan keyword data yang ingin diganti:\t");
            int data1 = scan.nextInt();
            System.out.print("Masukan data:\t");
            int data2 = scan.nextInt();
            Node nodeData1 = new Node(data1);
            Node nodeData2 = new Node(data2);
            DL.replace(nodeData1, nodeData2);
            System.out.print("Apakah ingin mengulang method lagi? (Y/N): ");
            ulang = scan.next().toUpperCase().charAt(0);
        } while (ulang == 'Y');
        System.out.print("Data saat ini: ");
        DL.show();


        /** method  remove() */
        System.out.println("\n---Method remove()---");
        do {
            System.out.print("Masukan keyword data yang ingin dihapus:\t");
            int data = scan.nextInt();
            Node nodeData = new Node(data);
            DL.remove(nodeData);
            System.out.print("Apakah ingin mengulang method lagi? (Y/N): ");
            ulang = scan.next().toUpperCase().charAt(0);
        } while (ulang == 'Y');
        System.out.print("Data saat ini: ");
        DL.show();


        /** method  removeAt() */
        System.out.println("\n---Method removeAt()---");
        do {
            System.out.print("Masukan index data yang ingin dihapus:\t");
            index = scan.nextInt();
            DL.removeAt(index);
            System.out.print("Apakah ingin mengulang method lagi? (Y/N): ");
            ulang = scan.next().toUpperCase().charAt(0);
        } while (ulang == 'Y');
        System.out.print("Data saat ini: ");
        DL.show();


        /** method  length() */
        System.out.println("\n---Method length()---");
        DL.length();
        System.out.print("Data saat ini: ");
        DL.show();

        /** method  checking() */
        System.out.println("\n---Method checking()---");
        do {
            System.out.print("Masukan keyword data yang ingin dicari:\t");
            key = scan.nextInt();
            Node nodeKey = new Node(key);
            boolean check = DL.checking(nodeKey);
            System.out.print("Apakah keyword yang dicari ada? : " + check);
            System.out.print("\nApakah ingin mengulang method lagi? (Y/N): ");
            ulang = scan.next().toUpperCase().charAt(0);
        } while (ulang == 'Y');
        System.out.print("Data saat ini: ");
        DL.show();


        /** method  showReversed() */
        System.out.println("\n---Method showReversed()---");
        DL.showReversed();


        /** method  find() */
        System.out.println("\n---Method find()---");
        do {
            System.out.print("Masukan keyword data yang ingin dicari:\t");
            int data = scan.nextInt();
            Node nodeData = new Node(data);
            DL.find(nodeData);
            System.out.print("Apakah ingin mengulang method lagi? (Y/N): ");
            ulang = scan.next().toUpperCase().charAt(0);
        } while (ulang == 'Y');


        /** method  insertAfter() */
        System.out.println("\n---Method insertAfter()---");
        do {
            System.out.print("Masukan keyword:\t");
            key = scan.nextInt();
            Node nodeKey = new Node(key);
            System.out.print("Masukan data setelah keyword:\t");
            input = scan.nextInt();
            Node nodeInput = new Node(input);
            DL.insertAfter(nodeKey, nodeInput);
            System.out.print("Apakah ingin mengulang method lagi? (Y/N): ");
            ulang = scan.next().toUpperCase().charAt(0);
        } while (ulang == 'Y');
        System.out.print("Data saat ini: ");
        DL.show();


        /** method  insertBefore() */
        System.out.println("\n---Method insertBefore()---");
        do {
            System.out.print("Masukan keyword :\t");
            key = scan.nextInt();
            Node nodeKey = new Node(key);
            System.out.print("Masukan data sebelum keyword:\t");
            input = scan.nextInt();
            Node nodeInput = new Node(input);
            DL.insertBefore(nodeKey, nodeInput);
            System.out.print("Apakah ingin mengulang method lagi? (Y/N): ");
            ulang = scan.next().toUpperCase().charAt(0);
        } while (ulang == 'Y');
        System.out.print("Data saat ini: ");
        DL.show();


        /** method  clear() */
        System.out.println("\n---Method clear()---");
        DL.clear();
        System.out.print("Data saat ini: ");
        DL.show();
    }
}
