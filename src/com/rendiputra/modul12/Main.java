package com.rendiputra.modul12;

public class Main {
    public static void main(String[] args) {
        int[] array = {128, 3, 9, 2, 12, 24, 67, 98};
        int cari;

        System.out.println("menginput data array: ");
        for (int x : array) {
            System.out.print(x + ", ");
        }

        System.out.println("\n\nmengurutkan data array: ");
        SelectionSort.selectionSort(array);
        for (int x : array) {
            System.out.print(x + ", ");
        }

        System.out.println("\n\n---Pencarian Interpolation Search---");
        InterpolationSearch interpolationSearch = new InterpolationSearch();
        cari = 24;
        interpolationSearch.search(array, cari);

        System.out.println("\n---Pencarian Binary Search---");
        BinarySearch binarySearch = new BinarySearch();
        cari = 67;
        binarySearch.search(array, cari);

        System.out.println("\n---Pencarian Sequential Search---");
        SequentialSearch sequentialSearch = new SequentialSearch();
        cari = 3;
        sequentialSearch.search(array, cari);
    }
}
