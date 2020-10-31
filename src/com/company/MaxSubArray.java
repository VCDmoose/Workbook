package com.company;

public class MaxSubArray {
    public static void main(String[] args) {
        int a = 5;
//        System.out.println();
        System.out.println(sum(new int[]{1, -3, 2, 1, -4, 3, 4, 5}));
    }

    public static int sum(int[] arr) {
        int LOCAL_MAX = arr[0];
        int MAX = arr[0];
        int startIndex = 0;
        int endIndex = 0;
        int localSI = 0;
        int localEI = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > (arr[i] + LOCAL_MAX)) {
                localSI = localEI = i;
            } else {
                localEI = i;
            }

            LOCAL_MAX = Math.max(arr[i], arr[i] + LOCAL_MAX);

            if (LOCAL_MAX > MAX) {
                startIndex = localSI;
                endIndex = localEI;
            }

            MAX = Math.max(LOCAL_MAX, MAX);
        }
        System.out.println(startIndex + " " + endIndex);
        return MAX;
    }

}


// [1, -3, 2, 1, -1, ]
