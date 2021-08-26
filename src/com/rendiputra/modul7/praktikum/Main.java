package com.rendiputra.modul7.praktikum;

public class Main {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Queue queue = new Queue();


        /** Method isEmpty() */
        System.out.println("\n---Method isEmpty()---");
        System.out.print("Apakah queue sedang kosong? : ");
        System.out.println(queue.isEmpty());
        System.out.print("Data queue saat ini: ");
        queue.show();


        /** Method enqueue() */
        System.out.println("\n---Method enqueue()---");
        queue.enqueue(node1);
        System.out.print("Data queue saat ini: ");
        queue.show();
        queue.enqueue(node2);
        System.out.print("Data queue saat ini: ");
        queue.show();
        queue.enqueue(node3);
        System.out.print("Data queue saat ini: ");
        queue.show();
        queue.enqueue(node4);
        System.out.print("Data queue saat ini: ");
        queue.show();
        queue.enqueue(node5);
        System.out.print("Data queue saat ini: ");
        queue.show();


        /** Method dequeue() */
        System.out.println("\n---Method dequeue()---");
        queue.dequeue();
        System.out.print("Data queue saat ini: ");
        queue.show();
        queue.dequeue();
        System.out.print("Data queue saat ini: ");
        queue.show();
        queue.dequeue();
        System.out.print("Data queue saat ini: ");
        queue.show();


        /** Method makeEmpty() */
        System.out.println("\n---Method makeEmpty()---");
        queue.makeEmpty();
        System.out.print("Data queue saat ini: ");
        queue.show();

    }
}
