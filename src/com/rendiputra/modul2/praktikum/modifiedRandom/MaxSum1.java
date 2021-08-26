package com.rendiputra.modul2.praktikum.modifiedRandom;

import java.util.Random;

public class MaxSum1 {
    public static int maxSubSum1(int [ ] a){
        int maxSum = 0;
        for(int i = 0; i < a.length; i++)
            for(int j = i; j < a.length; j++)
            {
                int thisSum = 0;
                for(int k = i; k <= j; k++)
                    thisSum += a[ k ];
                if(thisSum > maxSum)
                    maxSum=thisSum;
            }
        return maxSum;
    }
    public static void main(String [ ] args ){
        //Start time
        long begin = System.currentTimeMillis();

        //Starting the watch
        int a[ ] = rand();
        int maxSum;
        maxSum = maxSubSum1(a);
        System.out.println("Max sum is " + maxSum);

        //End time
        long end = System.currentTimeMillis();
        long time = end-begin;
        System.out.println();
        System.out.println("Elapsed Time: "+time +" milli seconds");
    }

    public static int[] rand(){
        Random rand = new Random();
        int a[] = new int[1000];
        for (int i = 0; i < a.length; i++){
            a[i] = rand.nextInt();
        }
        return a;
    }

}

