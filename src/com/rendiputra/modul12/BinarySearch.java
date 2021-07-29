package com.rendiputra.modul12;

public class BinarySearch {
    int binary (int[] array, int x) {
        int left = 0, right = array.length - 1;

        while (left <= right ){
            int mid = left + (right - left) / 2;

            if(array[mid] == x) {
                return mid; // jika data langsung ketemu
            } else if(array[mid] < x){
                left = mid + 1; // jika data lebih besar
            } else {
                right = mid - 1; // jika data lebih kecil
            }
        }
        return -1;
    }

    public void search (int[] array, int x) {
        int result = binary(array, x);

        if (result == -1 ) {
            System.out.println("Data " + x + " not found ");
        } else {
            System.out.println("Data " + x + " foundat index " + result);
        }
    }
}
