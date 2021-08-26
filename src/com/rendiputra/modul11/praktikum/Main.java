package com.rendiputra.modul11.praktikum;

public class Main {
    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();

        /** ---Merge Sort--- */
        int[] array1 = {3, 5, 1, 4, 2, 6, 9, 7, 8};
        System.out.println("\n\n---Merge Sort---");
        System.out.print("Cetak array: ");
        MergeSort.printArray(array1);
        System.out.println("---mengurutkan array---");
        mergeSort.sort(array1, 0, array1.length - 1);
        System.out.print("Cetak array: ");
        MergeSort.printArray(array1);


        /** ---Quick Sort--- */
        int[] array2 = {3, 5, 1, 4, 2, 6, 9, 7, 8};
        System.out.println("\n\n---Quick Sort---");
        System.out.print("Cetak array: ");
        QuickSort.printArray(array2, array2.length);
        System.out.println("---mengurutkan array---");
        QuickSort.quickSort(array2, 0, array2.length - 1);
        System.out.print("Cetak array: ");
        QuickSort.printArray(array2, array2.length);
    }
}
