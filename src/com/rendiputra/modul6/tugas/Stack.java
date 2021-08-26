package com.rendiputra.modul6.tugas;

public class Stack {
    Node tos;

    public boolean isempty(){
        return (tos==null);
    }
    public void push(Node input){
        if(isempty()){
            tos = input;
        } else {
            input.next = tos;
            tos = input;
        }
    }
    public void pop(){
        if(!isempty()){
            Node temp = tos;
            tos = tos.next;
            System.out.print(temp.data);
        } else {
            System.out.println("Stack kosong!");
        }
    }
}
