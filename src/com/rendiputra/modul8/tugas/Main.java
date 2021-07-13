package com.rendiputra.modul8.tugas;

import com.rendiputra.modul8.praktikum.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap();


        System.out.println("\n---Method put()---");
        hashMap.put("Name", "Rendi Putra Pradana");
        hashMap.put("kelas", "SE-04-C");
        hashMap.put("email", "20104079@ittelkom-pwt.ac.id");


        System.out.println("\n---Method get()---");
        System.out.println("Nama    : " + hashMap.get("Name"));
        System.out.println("Kelas   : " + hashMap.get("kelas"));
        System.out.println("Email   : " + hashMap.get("email"));


        System.out.println("\n---Method remove() ---");
        System.out.println("menghapus value dari key 'kelas'");
        hashMap.remove("kelas");


        System.out.println("\nMengecek kembali isi hashMap");
        System.out.println("Nama    : " + hashMap.get("Name"));
        System.out.println("Kelas   : " + hashMap.get("kelas"));
        System.out.println("Email   : " + hashMap.get("email"));
    }
}
