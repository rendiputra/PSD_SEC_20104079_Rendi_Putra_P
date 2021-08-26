package com.rendiputra.modul4.praktikum;

public interface List {
    boolean isEmpty();
    void addFirst(Node input);
    void addLast(Node input);
    void insertAfter(int key, Node input);
    void insertBefore(int key, Node input);
    void insert(int index, Node input);
    void replace(int data1, int data2);
    void remove(int data);
    void removeAt(int index);
    void removeFirst();
    void removeLast();
    void clear();
    void find(int data);
    void printNode();
    int length();
}
