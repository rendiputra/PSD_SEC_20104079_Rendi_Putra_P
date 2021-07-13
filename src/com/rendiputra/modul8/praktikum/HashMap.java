package com.rendiputra.modul8.praktikum;

import java.util.Calendar;
import java.util.Map;
import java.util.Locale;


public class HashMap<K, V> {
    private int capacity = 100;
    private int size = 0 ;
    private Entry<K, V>[] table = new Entry[capacity];

    public int Hashing(int hashCode) {
        int location = hashCode % capacity;
//        System.out.println("Location : " + location);
        return location;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        if (this.size == 0) return true;
        return false;
    }

    public boolean containsKey(Object key) {
        if (key == null) {
            if (table[0].getKey() == null) {
                return true;
            }
        }
        int location = Hashing(key.hashCode());
        Entry entry = null;
        try {
            entry = table[location];
        } catch (NullPointerException ex) {
        }

        if (entry != null && entry.getKey() == key) {
            return true;
        }

        return false;
    }

    public boolean constainValue(Object value) {
        for (int i = 0; i < table.length; i++) {
            if (table[i] != null && table[i].getValue() == value) return true;
        }
        return false;
    }

    public V get(K key) {
        V ret = null;
        if (key == null) {
            Entry<K, V> entry = null;
            try {
                entry = table[0];
            } catch (NullPointerException ex) {
            }
            if (entry != null) {
                return (V) entry.getValue();
            }
        } else {
            int location = Hashing(key.hashCode());
            Entry<K, V> entry = null;
            try {
                entry = table[location];
            } catch (NullPointerException ex) {
            }
            if (entry != null && entry.getKey() == key) {
                return (V) entry.getValue();
            }
        }
        return ret;
    }

    public V put(K key, V value) {
        V ret = null;
        if (key == null) {
            ret = putForNullkey(value);
            return ret;
        } else {
            int location = Hashing(key.hashCode());
            if (location >= capacity) {
                System.out.println("Rehasing required");
                return null;
            }
            Entry<K, V> entry = null;
            try {
                entry = table[location];
            } catch (NullPointerException ex) {
            }

            if (entry != null && entry.getKey() == key){
             ret = (V) entry.getValue();
            }
            else {
                Entry<K, V> entryNew = new Entry<K, V>();
                entryNew.setKey(key);
                entryNew.setValue(value);
                table[location] = entryNew;
                size++;
            }
        }
        return ret;
    }

    private V putForNullkey(V value) {
        Entry<K, V> entry = null;
        try {
            entry = table[0];
        } catch (NullPointerException ex) {
        }

        V ret = null;
        if (entry != null && entry.getKey() == null) {
            ret = (V) entry.getValue();
            entry.setValue(value);
            return ret;
        } else {
            Entry<K, V> entryNew = new Entry<K, V>();
            entryNew.setKey(null);
            entryNew.setValue(value);
            table[0] = entryNew;
            size++;
        }
        return ret;
    }


    /* method remove untuk menghapus nilai berdasarkan input kunci */
    public V remove(K key) {
        int location = Hashing(key.hashCode());
        V ret = null;
        if(table[location].getKey() == key) {
            table[location] = null;
            size--;
        }
        return ret;
    }

}
