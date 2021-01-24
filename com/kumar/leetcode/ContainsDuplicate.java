package com.kumar.leetcode;

import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, 3, 4, 5, 5, 6};
        boolean result = containsDups(arr);
        System.out.println(result);
    }

    public static boolean containsDups(int[] arr) {
        if (arr == null || arr.length == 0) {
            return false;
        }

        HashSet<Integer> mySet = new HashSet<>();

        for (int i : arr) {
            if (!mySet.add(i))
                return true;
        }
        return false;
    }

}
