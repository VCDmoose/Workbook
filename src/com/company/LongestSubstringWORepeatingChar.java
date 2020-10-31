package com.company;


import java.util.HashMap;

// "abcabcbb"
public class LongestSubstringWORepeatingChar {

    public static void main(String[] args) {
        System.out.println(longest("abba"));
        System.out.println(longest("abcabcbb"));
        System.out.println(longest("zwnigfunjwz"));
    }

    private static int longest(String string) {
        int max = 0;
        int localCount = 0;
        int lastRepeat = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < string.length(); i++) {
            final char character = string.charAt(i);
            final Integer characterPosition = map.get(character);
            if (characterPosition == null) localCount = ++localCount;
            else {
                localCount = i - Math.max(lastRepeat, characterPosition);
                lastRepeat = Math.max(lastRepeat, characterPosition);
            }
            map.put(character, i);
            max = Math.max(max, localCount);
        }

        return max;
    }


}
