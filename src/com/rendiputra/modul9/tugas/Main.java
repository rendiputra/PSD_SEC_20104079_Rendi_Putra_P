package com.rendiputra.modul9.tugas;

import com.rendiputra.modul9.praktikum.BinarySeacrhTree;
import com.rendiputra.modul9.praktikum.Node;

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


        System.out.println("\n---Method isEmpty()---");
        System.out.println("Apakah nilai binarySearchTree kosong? : " + binarySeacrhTree.isEmpty());


        System.out.println("\n---Method preOrder()---");
        System.out.print("preOrder?     : ");
        binarySeacrhTree.preOrder(node2);
        System.out.print("\ninOrder?    : ");
        binarySeacrhTree.inOrder(node2);
        System.out.print("\npostOrder?  : ");
        binarySeacrhTree.postOrder(node2);
    }
}
