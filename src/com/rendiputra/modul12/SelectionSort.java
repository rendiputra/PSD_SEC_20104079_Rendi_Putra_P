package com.rendiputra.modul12;

public class SelectionSort {
    static int temp, pos, i, j;
    public static int[] selectionSort(int data[]){
        for(i = 0; i <data.length - 1; i++){
            pos = i;
            for(j = i + 1; j <data.length; j++){
                if(data[j] < data[pos]){
                    pos = j;
                }
            }
            if(pos != i){
                temp = data[pos];
                data[pos] = data[i];
                data[i] = temp;
            }
        }
        return data;
    }

}
