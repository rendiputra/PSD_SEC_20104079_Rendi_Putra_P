package com.rendiputra.modul12;

public class InterpolationSearch {

    public static int interpolation(int data[], int cari) {
        SelectionSort.selectionSort(data);
        int low = 0;
        int high = data.length - 1;
        while (cari >= data[low] && cari <= data[high]) {
            int pos = ((cari - data[low]) / (data[high] - data[low])) * (high - low) + low;
            if (data[pos] == cari) {
                return pos;
            }
            if (data[pos] > cari)
                high = pos - 1;
            else if (data[pos] < cari)
                low = pos + 1;
        }
        return -1;
    }



    public void search (int[] array, int x) {
        int result = interpolation(array, x);

        if (result == -1 ) {
            System.out.println("Data " + x + " not found ");
        } else {
            System.out.println("Data " + x + " found at index " + result);
        }
    }
}
