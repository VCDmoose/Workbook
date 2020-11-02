package com.company;

import org.omg.CORBA.INTERNAL;

import java.util.Deque;
import java.util.LinkedList;

public class WaterLogging {

    public static void main(String[] args) {
//        System.out.println(waterLogged(new int[]{1, 0, 2, 1, 0, 1, 3, 2, 2}));
//        System.out.println(waterLogged(new int[]{1, 0, 2, 1, 0, 1, 3, 3}));
//        System.out.println(waterLogged(new int[]{1, 0, 2, 1, 0, 1, 3, 2, 3}));
//        System.out.println(waterLogged(new Integer[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
//        System.out.println(waterLogged(new Integer[]{4, 2, 0, 3, 2, 5}));
        System.out.println(waterLogged(new Integer[]{4, 2, 3}));
    }

    private static int waterLogged(Integer[] array) {
        Deque<Integer> stack = new LinkedList<Integer>();
        if (array.length == 0) return 0;

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
        if (stack.size() == 0) return result;

        final Object[] objects = stack.toArray();
        stack.clear();
//        border = (Integer) objects[0];
        i = 0;
        while (i < objects.length) {
            while (i < objects.length && (Integer) objects[i] < border) {
                stack.add((Integer) objects[i]);
                i++;
            }
            while (i < objects.length && stack.size() > 0) {
                result = result + (border - stack.poll());
            }

            if (i < objects.length)
                border = (Integer) objects[i];
            i++;

        }

        return result;

    }

}
