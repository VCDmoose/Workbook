package com.company;

public class MaxContLetters {

    public static void main(String[] args) {
       maxLetter("AA");
    }

    public static void maxLetter(String string) {
        int prev = 0;
        int count = 0;
        char letter = string.charAt(0);
        int max = 0;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(prev) == string.charAt(i)) {
                ++count;
            }
            if (count > max) {
                max = count;
                letter = string.charAt(prev);
            }
            if (string.charAt(prev) != string.charAt(i)) {
                count = 1;
            }

            prev = i;
        }

        System.out.println(max + " " + letter);
    }
}


// AABCDDBBBEA
