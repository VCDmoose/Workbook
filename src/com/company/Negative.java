package com.company;

public class Negative {

    public static void main(String[] args) {
        int[][] arr = {{-3, -2, -1,  1},
        {-2,  -2,  -2,  5},
        { -2,  -2,  -2,  7}};
        System.out.println(count(arr));
    }

    private static int count(int[][] arr) {
        int n = arr.length-1;
        int m = 0;
        int count = 0;
        while (n >= 0 && m <= arr[0].length) {
            if (arr[n][m] < 0) {
                m++;
                count += n+1;
            }
            if (arr[n][m] >= 0) {
                n--;
            }
        }
        return count;
    }
}


/*
[-3 -2 -1  1]
[-2  3  4  5]
[ 2  4  5  7]
 */
