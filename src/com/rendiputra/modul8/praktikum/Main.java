package com.rendiputra.modul8.praktikum;

public class Main {

    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap();

        System.out.println("---Method isEmpty() dan size()---");
        System.out.println("Apakah hashMap kosong?? : " + hashMap.isEmpty());
        System.out.println("Ukuran hashMap  : " + hashMap.size());


        System.out.println("\n---Method put()---");
        hashMap.put("Name", "Rendi Putra Pradana");
        hashMap.put("kelas", "SE-04-C");
        hashMap.put("email", "20104079@ittelkom-pwt.ac.id");
        hashMap.put(null, "ini dari key 'null'");

        System.out.println("\n---Method size()---");
        System.out.println("Ukuran hashMap  : " + hashMap.size());


        System.out.println("\n---Method get()---");
        System.out.println("Nama    : " + hashMap.get("Name"));
        System.out.println("Kelas   : " + hashMap.get("kelas"));
        System.out.println("Email   : " + hashMap.get("email"));
        System.out.println("null?   : " + hashMap.get(null));


        System.out.println("\n---Method containsKey() dan constainValue() ---");
        System.out.println("apakah key beneran Null?   \t\t\t\t\t\t\t: " + hashMap.containsKey(null));
        System.out.println("apakah value berasal dari key yang bernilai Null?   : " + hashMap.constainValue("ini dari key 'null'"));
        System.out.println("apakah key beneran Null?   \t\t\t\t\t\t\t: " + hashMap.containsKey("bukanNull"));
        System.out.println("apakah value berasal dari key yang bernilai Null?   : " + hashMap.constainValue("valueBukanNull"));


        System.out.println("\n---Method remove() ---");
        System.out.println("Kelas   : " + hashMap.get("kelas"));
        System.out.println("menghapus value dari key 'kelas'");
        hashMap.remove("kelas");
        System.out.println("Nama    : " + hashMap.get("Name"));
        System.out.println("Kelas   : " + hashMap.get("kelas"));
        System.out.println("Email   : " + hashMap.get("email"));
        System.out.println("null?   : " + hashMap.get(null));

    }


}
