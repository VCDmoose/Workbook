package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        System.out.println(firstNonRepeatingCharacter("abcbcd"));
    }

    private static Character firstNonRepeatingCharacter(String string) {
        ArrayList<Character> list = new ArrayList<Character>();
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < string.length(); i++) {
            Character character = string.charAt(i);
            final Integer prevCount = map.get(character);
            final int count = prevCount == null ? 1 : prevCount + 1;
            map.put(character, count);

            if (count == 1) list.add(character);
            else list.remove(character);
        }

        return  list.get(0);

    }
}
