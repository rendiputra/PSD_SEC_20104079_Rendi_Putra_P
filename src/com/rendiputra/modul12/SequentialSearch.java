package com.rendiputra.modul12;

public class SequentialSearch {
    public int sequantial(int array[], int x) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            if (array[i] == x ){
                return i;
            }
        }
        return -1;
    }

    public void search (int[] array, int x) {
        int result = sequantial(array, x);

        if (result == -1 ) {
            System.out.println("Data " + x + " not found ");
        } else {
            System.out.println("Data " + x + " found at index " + result);
        }
    }
}
