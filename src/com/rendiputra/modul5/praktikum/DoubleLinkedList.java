package com.rendiputra.modul5.praktikum;

public class DoubleLinkedList implements Db_LinkedList{

    private Node head,tail;

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public void addFirst(Node input) {
        if(isEmpty()){
            head = input;
            tail = input;
        }else {
            head.kiri = input;
            input.kanan = head;
            head = input;
        }
    }

    @Override
    public void addLast(Node input) {
        if(isEmpty()){
            head = input;
            tail = input;
        }else {
            tail.kanan = input;
            input.kiri = tail;
            tail = input;
        }
    }

    @Override
    public void insertAfter(Node key, Node input) {
        Node temp = head;
        boolean found = false;

        while (temp != null) {
            if ( (key.data == temp.data)){
                input.kanan = temp.kanan;
                temp.kanan = input;
                temp.kanan.kiri = input;
                temp.kanan = null;
                input.kiri = temp;
                temp.kanan = input;
                found = true;
                System.out.println("Data " + input.data + " berhasil dimasukan pada indeks " + key.data);
                break;
            }
            temp = temp.kanan;
        }

        if (!found){
            System.out.println("Indeks " + key.data + " tidak ditemukan dalam Node");
        }
    }

    @Override
    public void insertBefore(Node key, Node input) {
        Node temp = head;
        boolean found = false;

        while (temp != null) {
            if ( (key.data == temp.data) && (temp == head) ) {
                this.addFirst(input);
                System.out.println("Memasukkan data "+input.data+" sebelum data "+key.data +" sukses!");
                break;
            } else if (temp.kanan.data == key.data) {
                input.kanan = temp.kanan;
                temp.kanan = input;
                temp.kanan.kiri = input;
                temp.kanan = null;
                input.kiri = temp;
                temp.kanan = input;
                found = true;
                System.out.println("Memasukkan data "+input.data+" sebelum data "+ key.data +" sukses!");
                break;
            }
            temp = temp.kanan;
        }

        if (!found){
            System.out.println("Indeks " + key.data + " tidak ditemukan dalam Node");
        }
    }

    @Override
    public void insert(int index, Node input) {
        Node temp = head;
        boolean found = false;
        int i = 0;

        while (temp != null) {
            if ( index == 0){
                this.addFirst((input));
                found = true;
                System.out.println("Data " + input.data + " berhasil dimasukan pada indeks " + index);
                break;
            }else if ( (i == index - 1) && (temp != tail) ) {
                input.kanan = temp.kanan;
                temp.kanan.kiri = input;
                input.kiri = temp;
                temp.kanan = input;
                found = true;
                System.out.println("Data " + input.data + " berhasil dimasukan pada indeks " + index);
                break;
            } else if ( (i == index - 1) && (temp == tail) )  {
                this.addLast(input);
                found = true;
                System.out.println("Data " + input.data + " berhasil dimasukan pada indeks " + index);
                break;
            }
            temp = temp.kanan;
            i++;
        }

        if (!found){
            System.out.println("Indeks " + index + " tidak ditemukan dalam Node");
        }
    }

    @Override
    public void replace(Node data1, Node data2) {
        Node temp = head;
        boolean found = false;
        while(temp != null) {
            if(temp.data == data1.data){
                temp.data = data2.data;
                found = true;
                System.out.println("Data " + data1.data + " berhasil diganti dengan data " + data2.data);
                break;
            }
            temp = temp.kanan;

        }
        if(!found){
            System.out.println("Data " + data1.data + " tidak ditemukan dalam Node!");
        }
    }

    @Override
    public void remove(Node data) {
        try{
            Node temp = head;
            while (temp != null) {
                if ( (temp.data == data.data) && (temp == tail) ) {
                    this.removeLast();
                    System.out.println("Data " + data.data + " berhasil dihapus!");
                    break;
                } else if ( (temp.data == data.data) && (temp == head) ){
                    this.removeFirst();
                    System.out.println("Data " + data.data + " berhasil dihapus!");
                    break;
                } else if( (temp.kanan.data == data.data) && (temp.kanan != tail) ){
                    temp.kanan = temp.kanan.kanan;
                    temp.kanan.kiri = temp;
                    System.out.println("data " + data.data + " berhasil dihapsu!");
                    break;
                }
                temp = temp.kanan;
            }
        } catch (Exception e) {
            System.out.println("data " + data.data + " tidak ditemukan dalam Node!");
        }
    }

    @Override
    public void removeAt(int index) {
        Node temp = head;
        try{
            int i = 0;
            while(temp != null) {
                if(index == 0)
                {
                    this.removeFirst();
                    System.out.println("Data pada indeks "+index+" berhasil dihapus !");
                    break;
                }
                else if((i == index - 1) && (temp.kanan != tail))
                {
                    temp.kanan = temp.kanan.kanan;
                    temp.kanan.kiri = temp;
                    System.out.println("Data pada indeks "+index+" berhasil dihapus !");
                    break;
                }
                else if((i == index - 1) && (temp.kanan == tail)){
                    this.removeLast();
                    System.out.println("Data pada indeks "+index+" berhasil dihapus !");
                    break;
                }
                temp = temp.kanan;
                i++;
            }
        }catch(Exception e){
            System.out.println("Indeks "+index+" tidak ditemukan didalam Node !");
        }
    }

    @Override
    public void removeFirst() {
        Node temp = head;
        if(isEmpty()) {
            System.out.println("Data kosong!");
        }else{
            if(head == tail) {
                head = tail = null;
            } else {
                head = temp.kanan;
                head.kiri = null;
                temp.kanan = null;
                temp = null;
            }
        }
    }

    @Override
    public void removeLast() {
        Node temp = tail;
        if(isEmpty()){
            System.out.println("Data kosong! ");
        }else{
            if(tail == head){
                head = tail = null;
            } else {
                tail = tail.kiri;
                tail.kanan = null;
                temp.kiri = null;
                temp = null;
            }
        }
    }

    @Override
    public void clear() {
        if(isEmpty()){
            System.out.println("Data masih kosong !");
        }
        else{
            head = null;
            tail = null;
            System.out.println("Data berhasil dihapus semua !");
        }
    }

    @Override
    public void show() {
        Node temp = head;
        if(isEmpty()) {
            System.out.println("Data kosong !");
        } else {
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.kanan;
            }
            System.out.println();
        }
    }

    @Override
    public void find(Node data) {
        int i = 0;
        boolean found = false;
        Node temp = head;
        while(temp != null)
        {
            if(temp.data == data.data)
            {
                found = true;
                break;
            }i++; temp = temp.kanan;
        }
        if(found)
        {
            System.out.println(data.data+" ditemukan pada indeks ke-"+i);
        }
        else System.out.println("Data tidak ditemukan!");

    }

    @Override
    public int length() {
        Node temp = head;
        int i=0;
        if(isEmpty()){
            System.out.println("Data kosong !");
        }
        else
            while(temp != null)
            {
                temp = temp.kanan;
                i++;
            }
        System.out.println("Panjang data : "+i);
        return i;
    }

    public boolean checking(Node input) {
        Node temp = head;
        while(temp != null){
            if(temp.data == input.data){
                return true;
            }
            temp = temp.kanan;
        }
        return false;
    }

    public void showReversed() {
        Node temp = tail;
        if(isEmpty()){
            System.out.println("Data Kosong !");
        }else
        {
            while(temp != null)
            {
                System.out.print(temp.data+" ");
                temp = temp.kiri;
            }
            System.out.println();
        }
    }

}
