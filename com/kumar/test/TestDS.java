package com.kumar.test;

import java.util.Arrays;

public class TestDS {
    static int[] arr = {1, 7, 3, -1, 0, -8, 8, 4};

    public static void main(String[] args) {
        TestDS tds = new TestDS();
        System.out.print(" " + Arrays.toString(tds.reverseArray(arr)));
    }

    public int[] reverseArray(int[] arr) {
        int len = arr.length;
        int[] result = new int[len];

        if (arr == null || arr.length == 0) return result;
        int pos = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            result[pos++] = arr[i];
        }
        return result;
    }
}
