package com.rendiputra.modul7.praktikum;

public class Queue {
    private Node depan, belakang;

    boolean isEmpty() {
        return (depan == null);
    }

    void enqueue(Node input) {
        if (isEmpty()) {
            depan = input;
            belakang = input;
        } else {
            belakang.next = input;
            belakang = belakang.next;
        }
    }

    void show() {
        if (!isEmpty()) {
            Node temp = depan;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        } else
            System.out.println("Queue kosong !");
    }

    Node dequeue() {
        if (isEmpty()) {
            return null;
        } else {
            Node temp = depan;
            if (depan == belakang) {
                depan = belakang = null;
                return temp;
            } else {
                depan = depan.next;
                return temp;
            }
        }
    }

    void makeEmpty() {
        depan = null;
        belakang = null;
        System.out.println("Data queue berhasil dikosongkan !");
    }
}
