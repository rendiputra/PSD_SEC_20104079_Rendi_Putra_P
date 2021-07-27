package com.rendiputra.modul11.tugas;

import com.rendiputra.modul11.praktikum.MergeSort;
import com.rendiputra.modul11.praktikum.QuickSort;

public class Main {
    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        long begin, end, time;
        int[] array1 = new int[100];
        for(int i = 0; i <  array1.length; i++) {
            array1[i] = (int)(Math.random() * 1000);
        }

        int[] array2 = new int[100];
        for(int i = 0; i <  array2.length; i++) {
            array2[i] = (int)(Math.random() * 1000);
        }



        /** ---Merge Sort--- */
        System.out.println("\n\n---Merge Sort---");
        System.out.print("Cetak array: ");
        MergeSort.printArray(array1);
        System.out.println("---mengurutkan array---");
        //Start time
        begin = System.nanoTime();
        mergeSort.sort(array1, 0, array1.length - 1);
        //End time
        end = System.nanoTime();
        System.out.print("Cetak array: ");
        MergeSort.printArray(array1);

        time = end-begin;
        System.out.println();
        System.out.println("Elapsed Time: "+time +" micro seconds");


        /** ---Quick Sort--- */
        System.out.println("\n\n---Quick Sort---");
        System.out.print("Cetak array: ");
        QuickSort.printArray(array2, array2.length);
        System.out.println("---mengurutkan array---");
        //Start time
        long begin2 = System.nanoTime();
        QuickSort.quickSort(array2, 0, array2.length - 1);
        //End time
        long end2 = System.nanoTime();
        System.out.print("Cetak array: ");
        QuickSort.printArray(array2, array2.length);

        long time2 = end2-begin2;
        System.out.println();
        System.out.println("Elapsed Time: "+time2 +" micro seconds");
    }
}
