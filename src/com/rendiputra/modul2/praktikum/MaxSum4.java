package com.rendiputra.modul2.praktikum;

public class MaxSum4 {
    public static int maxSubSum4(int[] a) {
        int maxSum = 0, thisSum = 0;
        for (int j = 0; j < a.length; j++) {
            thisSum += a[j];
            if (thisSum > maxSum)
                maxSum = thisSum;
            else if (thisSum < 0)
                thisSum = 0;
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int a[] = {4, -3, 5, -2, -1, 2, 6, -2};
        int maxSum;
        maxSum = maxSubSum4(a);
        System.out.println("Max sum is " + maxSum);
    }
}
