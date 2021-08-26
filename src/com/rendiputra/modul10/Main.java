package com.rendiputra.modul10;

public class Main {
    public static void main(String[] args) {
        /** ---Bubble Sort--- */
        int[] array1 = {3, 5, 1, 4, 2, 6, 9, 7, 8};
        System.out.println("---Bubble Sort---");
        System.out.print("Cetak array: ");
        Sort.printArray(array1);
        System.out.println("---mengurutkan array---");
        Sort.bubbleSort(array1);
        System.out.print("Cetak array: ");
        Sort.printArray(array1);

        /** ---Selection Sort--- */
        int[] array2 = {3, 5, 1, 4, 2, 6, 9, 7, 8};
        System.out.println("\n\n---Selection Sort---");
        System.out.print("Cetak array: ");
        Sort.printArray(array2);
        System.out.println("---mengurutkan array---");
        Sort.selectionSort(array2);
        System.out.print("Cetak array: ");
        Sort.printArray(array2);

        /** ---Insertion Sort--- */
        int[] array3 = {3, 5, 1, 4, 2, 6, 9, 7, 8};
        System.out.println("\n\n---Insertion Sort---");
        System.out.print("Cetak array: ");
        Sort.printArray(array3);
        System.out.println("---mengurutkan array---");
        Sort.insertionSort(array3);
        System.out.print("\nCetak array: ");
        Sort.printArray(array3);
    }
}
