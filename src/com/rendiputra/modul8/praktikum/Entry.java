package com.rendiputra.modul8.praktikum;

import java.util.Objects;

public class Entry<K, V> {
    K key;
    V val;

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return val;
    }

    public void setValue(V value) {
        this.val = value;
    }

    public  int hashCode(){
        int prime = 13;
        int mul = 11;
        if (key != null){
            int hashCOde = prime * mul + key.hashCode();
            return  hashCOde;
        }
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass().getName() != o.getClass().getName()) {
            return false;
        }
        Entry entry = (Entry) o;
        if(this.key == entry.key) {
            return true;
        }
        return false;
//        return Objects.equals(key, entry.key) && Objects.equals(val, entry.val);

    }

}
