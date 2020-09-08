package com.kumar.leetcode;

import java.util.HashSet;
import java.util.Set;

public class WordBreak {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("geeks");
        set.add("for");
        set.add("geeks1");
        System.out.println(wordBreak("geeks1forgeeks",set));
    }

    public static  boolean wordBreak(String s, Set<String> dict) {
        if (s.isEmpty()) return true;

        if (dict.contains(s)) return true;
        int len = s.length();

        for (int i = 1; i < len; i++) {
            String s1 = s.substring(0, i);
            if (dict.contains(s1)) {
                String s2 = s.substring(i, len);
                if (wordBreak(s2, dict)) return true;
            }
        }
        return false;
    }
}
