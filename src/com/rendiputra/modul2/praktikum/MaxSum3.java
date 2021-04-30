package com.rendiputra.modul2.praktikum;

public class MaxSum3 {
    private static int maxSumRec(int [ ] a, int left, int right)
    {
        if(left == right)
            if(a[left] > 0)
                return a[left];
            else
                return 0;
        int center = (left + right) / 2;
        int maxLeftSum = maxSumRec(a, left, center);
        int maxRightSum = maxSumRec(a, center + 1, right);
        int maxLeftBorderSum = 0, leftBorderSum = 0;
        for(int i = center; i >= left; i--)
        {
            leftBorderSum += a[i];
            if( leftBorderSum > maxLeftBorderSum )
                maxLeftBorderSum = leftBorderSum;
        }
        int maxRightBorderSum = 0, rightBorderSum = 0;
        for(int i = center + 1; i <= right; i++)
        {
            rightBorderSum += a[i];
            if( rightBorderSum > maxRightBorderSum)
                maxRightBorderSum = rightBorderSum;
        }
        for (int i=left; i<=right; i++)
            System.out.print(a[i]+ " ");
        System.out.println();
        System.out.println("maxLeftSum = "+maxLeftSum+"\nmaxRightSum="
                        +maxRightSum +"\nmaxLeftBorderSum = "+maxLeftBorderSum +"\nmaxRightBorderSum =  "+maxRightBorderSum+"\nmaxLeftBorderSum " + "+ maxRightBorderSum = " +(maxLeftBorderSum +
                        maxRightBorderSum));
        System.out.println();
        return max3( maxLeftSum, maxRightSum,
                maxLeftBorderSum + maxRightBorderSum );
    }
    public static int maxSubSum3( int [ ] a )
    {
        return maxSumRec( a, 0, a.length - 1 );
    }
    private static int max3( int a, int b, int c )
    {
        return a > b ? (a > c ? a : c) : (b > c ? b : c);
    }
    public static void main( String [ ] args ){
        int a[ ] = { 4, -3, 5, -2, -1, 2, 6, -2 };
        int maxSum;
        maxSum = maxSubSum3( a );
        System.out.println( "Max sum is " + maxSum );
    }
}
