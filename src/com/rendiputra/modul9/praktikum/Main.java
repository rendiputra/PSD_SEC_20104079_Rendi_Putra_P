package com.rendiputra.modul9.praktikum;

public class Main {

    public static void main(String[] args) {
        BinarySeacrhTree binarySeacrhTree =  new BinarySeacrhTree();

        System.out.println("---Method isEmpty()---");
        System.out.println("Apakah nilai binarySearchTree kosong? : " + binarySeacrhTree.isEmpty());

        Node node1 = new Node(44);
        Node node2 = new Node(39);
        Node node3 = new Node(34);
        Node node4 = new Node(45);
        Node node5 = new Node(3);


        System.out.println("\n---Method insert()---");
        binarySeacrhTree.insert(node1);
        binarySeacrhTree.insert(node2);
        binarySeacrhTree.insert(node3);
        binarySeacrhTree.insert(node4);
        binarySeacrhTree.insert(node5);

        System.out.println("\n---Method getLeafCount()---");
        System.out.println("Total leaf: " +binarySeacrhTree.getLeafCount());

        System.out.println("\n---Method find(), findDirectory(), findMin() & findMax()---");
        binarySeacrhTree.find(34);
        System.out.print("Find Directory\t: ");
        binarySeacrhTree.findDirectory(34);
        System.out.println("Find Max\t: "+binarySeacrhTree.findMax().data);
        System.out.println("Find Min\t: "+binarySeacrhTree.findMin().data);

        System.out.println("\n---Method remove()---");
        binarySeacrhTree.remove(39);
        System.out.println(binarySeacrhTree.checking(39));



        System.out.println("\n---Method removeAll()---");
        binarySeacrhTree.removeAll();

        System.out.println("\n---Method isEmpty()---");
        System.out.println("Apakah nilai binarySearchTree kosong? : " + binarySeacrhTree.isEmpty());

    }

}
