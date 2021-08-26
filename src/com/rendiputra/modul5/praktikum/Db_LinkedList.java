package com.rendiputra.modul5.praktikum;

public interface Db_LinkedList {
    boolean isEmpty();
    void addFirst(Node input);
    void addLast(Node input);
    void insertAfter(Node key, Node input);
    void insertBefore(Node key, Node input);
    void insert(int index, Node input);
    void replace(Node data1, Node data2);
    void remove(Node data);
    void removeAt(int index);
    void removeFirst();
    void removeLast();
    void clear();
    void show();
    void find(Node data);
    int length();
}
