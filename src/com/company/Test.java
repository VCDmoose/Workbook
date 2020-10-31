package com.company;

import java.util.ArrayDeque;
import java.util.Deque;

public class Test {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        deque.add("first element");
        deque.addFirst("last element");

        String lastElement = deque.peekLast();

        System.out.println(deque.poll());
        System.out.println(deque.poll());
        System.out.println(deque.peekLast());
    }
}
