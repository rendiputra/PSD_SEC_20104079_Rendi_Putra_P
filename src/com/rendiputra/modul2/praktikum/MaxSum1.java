package com.rendiputra.modul2.praktikum;

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
        int a[ ] = {4, -3, 5, -2, -1, 2, 6, -2};
        int maxSum;
        maxSum = maxSubSum1(a);
        System.out.println("Max sum is " + maxSum);
    }

}
