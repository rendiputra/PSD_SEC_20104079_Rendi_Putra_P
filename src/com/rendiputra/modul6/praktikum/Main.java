package com.rendiputra.modul6.praktikum;


public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);


        /** Method isEmpty() */
        System.out.println("\n---Method isEmpty()---");
        System.out.print("is empty? : ");
        System.out.println(((stack.isEmpty()) ? "Empty" : "Not Empty"));


        /** Method show() */
        System.out.print("Data saat ini: ");
        stack.show();


        /** Method push() */
        System.out.println("\n---Method push()---");
        stack.push(node5);
        stack.push(node4);
        stack.push(node3);
        stack.push(node2);
        stack.push(node1);
        System.out.print("Data saat ini: ");
        stack.show();


        /** Method pop() */
        System.out.println("\n---pop()---");
        stack.pop();
        System.out.print("Data saat ini: ");
        stack.show();


        /** Method top() */
        System.out.println("\n---top()---");
        stack.top();
        System.out.print("Data saat ini: ");
        stack.show();


        /** Method topAndPop() */
        System.out.println("\n---topAndPop()---");
        stack.topAndPop();
        System.out.print("Data saat ini: ");
        stack.show();


        /** Method makeEmpty() */
        System.out.println("\n---makeEmpty()---");
        stack.makeEmpty();
        System.out.print("Data saat ini: ");
        stack.show();
    }
}
