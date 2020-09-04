package com.kumar.leetcode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

class FirstUniqueCharacterInArray {
    public static void main(String[] args) {
        FirstUniqueCharacterInArray fuca = new FirstUniqueCharacterInArray();
        System.out.println(fuca.firstUniqueChar("loveleetcode"));
        System.out.println(fuca.firstUniqueCharIndex("loveleetcode"));
    }

    public Character firstUniqueChar(String s) {
        Character result = null;
        if (s == null || s.length() == 0)
            return null;

        Map<Character, Integer> freqMap = new LinkedHashMap<>(s.length() - 1);
        for (char c : s.toCharArray()) {
            if (!freqMap.containsKey(c)) {
                freqMap.put(c, 1);
            } else {
                freqMap.put(c, -1);
            }
        }

        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() != -1) {
                result = entry.getKey();
                return result;
            }
        }
        return result;
    }

    public int firstUniqueCharIndex(String s) {
        Character result = null;
        if (s == null || s.length() == 0)
            return -1;

        char[] c = s.toCharArray();
        Map<Character, Integer> freqMap = new LinkedHashMap<>(s.length() - 1);
        for (int i = 0; i < s.length(); i++) {
            if (!freqMap.containsKey(c[i])) {
                freqMap.put(c[i], i);
            } else {
                freqMap.put(c[i], -1);
            }
        }

        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() != -1) {
                return entry.getValue();
            }
        }
        return -1;
    }

}