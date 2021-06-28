package com.rendiputra.modul7.tugas;

public class Main {
    public static void main(String[] args) {
        Siswa siswa1 = new Siswa(20104079, "Rendi", "Bekasi");
        Siswa siswa2 = new Siswa(20104179, "Putra", "Jawa Barat");
        Siswa siswa3 = new Siswa(20104279, "Pradana", "Indonesia");

        Node node1 = new Node(siswa1);
        Node node2 = new Node(siswa2);
        Node node3 = new Node(siswa3);

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
        System.out.println("Data queue saat ini: ");
        queue.show();
        queue.enqueue(node2);
        System.out.println("Data queue saat ini: ");
        queue.show();
        queue.enqueue(node3);
        System.out.println("Data queue saat ini: ");
        queue.show();


        /** Method dequeue() */
        System.out.println("\n---Method dequeue()---");
        queue.dequeue();
        System.out.println("Data queue saat ini: ");
        queue.show();


        /** Method isEmpty() */
        System.out.println("\n---Method makeEmpty()---");
        queue.makeEmpty();
        System.out.print("Data queue saat ini: ");
        queue.show();
    }

}
