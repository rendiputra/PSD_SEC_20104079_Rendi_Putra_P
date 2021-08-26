package com.rendiputra.modul10;

public class Sort {

    static int temp, pos, i, j;

    public static int[] bubbleSort(int data[]) {
        for (i = 1; i < data.length; i++) {
            for (j = data.length - 1; j >= i; j--) {
                if (data[j] < data[j - 1]) {
                    temp = data[j];
                    data[j] = data[j - 1];
                    data[j - 1] = temp;
                }
            }
        }
        return data;
    }

    public static int[] selectionSort(int data[]) {
        for (i = 0; i < data.length - 1; i++) {
            pos = i;
            for (j = i + 1; j < data.length; j++) {
                if (data[j] < data[pos]) {
                    pos = j;
                }
            }
            if (pos != i) {
                temp = data[pos];
                data[pos] = data[i];
                data[i] = temp;
            }
        }
        return data;
    }

    public static int[] insertionSort(int data[]) {
        for (i = 1; i < data.length; i++) {
            temp = data[i];
            j = i;
            while ((j > 0) && (data[j - 1] > temp)) {
                data[j] = data[j - 1];
                j--;
            }
            data[j] = temp;
            System.out.print(j + " ");
        }
        return data;
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}
