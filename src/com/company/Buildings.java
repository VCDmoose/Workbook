package com.company;

public class Buildings {

    class Node {

    }
    public static void main(String[] args) {
        System.out.println(isPossible(new  int[] {1, 5, 0, 0, 0, 1} ));
    }

    private  static  boolean isPossible(int[] arr) {
        int height = arr[0];
        int pos = 0;
        boolean isPossible = false;

        while (height > 0) {
            pos ++;
            height --;

            if (pos >= arr.length) {
                return true;
            }

            if(arr[pos] > height) {
                height = arr[pos];
            }
        }

        return false;
    }
}

// [4, 2, 3, 0, 0, 1]
