package com.company;

import java.util.Deque;
import java.util.LinkedList;

public class WaterLogging {

    public static void main(String[] args) {
        System.out.println(waterLogged(new int[]{1, 0, 2, 1, 0, 1, 3, 2, 2}));
        System.out.println(waterLogged(new int[]{1, 0, 2, 1, 0, 1, 3, 3}));
        System.out.println(waterLogged(new int[]{1, 0, 2, 1, 0, 1, 3, 2, 3}));
    }

    private static int waterLogged(int[] array) {
        Deque<Integer> stack = new LinkedList<>();

        int result = 0;
        int border = array[0];
        int i = 0;

        while (i < array.length) {
            while (i < array.length && array[i] < border) {
                stack.add(array[i]);
                i++;
            }
            while (i < array.length && stack.size() > 0) {
                result = result + (border - stack.poll());
            }

            if (i < array.length)
                border = array[i];
            i++;

        }
        return result;

    }

}
