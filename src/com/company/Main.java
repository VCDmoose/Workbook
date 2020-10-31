package com.company;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.BinaryOperator;
import java.util.regex.*;
import java.util.stream.Collectors;

public class Main {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        Instant now = Instant.now();

        System.out.println(count("1234"));

        System.out.println(Duration.between(Instant.now(), now).get(ChronoUnit.NANOS));
    }

    private static int count(String string) {

        HashMap<String, Integer> map = new HashMap<>();
        return count(string, map);

    }

    private static int count(String string, HashMap<String, Integer> map) {
        if (string.length() == 1) return 1;
        else if (string.length() == 2) {
             if (Integer.parseInt(string) <= 26) return 2;
            else return 1;
        }
        if (map.containsKey(string))
            return map.get(string);
        else {
            int count = count(string.substring(1), map) + (Integer.parseInt(string.substring(0, 2)) <= 26 ? count(string.substring(2), map) : 0);
            map.put(string, count);
            return count;
        }

    }

}
//PT8H23M27SBAut
//1000000
