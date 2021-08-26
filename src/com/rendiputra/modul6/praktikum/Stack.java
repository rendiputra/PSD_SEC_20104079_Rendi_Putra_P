package com.rendiputra.modul6.praktikum;

public class Stack {
    private Node tos;

    public boolean isEmpty() {
        return (tos == null);
    }

    public void push(Node input) {
        if (isEmpty()) {
            tos = input;
        } else {
            input.next = tos;
            tos = input;
        }
    }

    public void pop() {
        if (!isEmpty()) {
            Node temp = tos;
            tos = tos.next;
            temp.next = null;
            System.out.println("Yang di POP: " +
                    temp.data.toString());
        } else
            System.out.println("Tidak bisa karena stack kosong!");
    }

    public void show() {
        if (!isEmpty()) {
            Node temp = tos;
            while (temp != null) {
                System.out.print(temp.data.toString() + "\n");
                temp = temp.next;
            }
        } else
            System.out.println("Stack kosong !");
    }

    Node top() {
        Node temp = tos;
        return temp;
    }

    Node topAndPop() {
        Node temp = tos;
        this.pop();
        return temp;
    }

    void makeEmpty() {
        tos = null;
        System.out.println("Data berhasil dihapus semua !");
    }
}
