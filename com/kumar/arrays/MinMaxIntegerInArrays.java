package com.kumar.arrays;

/**
 * Created by Kumar on 3/9/2017.
 */
public class MinMaxIntegerInArrays {

    public static void main(String[] args) {
        int[] arr = {10, 12, 1, 2, 3, 4, 5, 6};
        MinMaxIntegerInArrays minMaxIntegerInArrays = new MinMaxIntegerInArrays();
        System.out.println("Min Value:" + minMaxIntegerInArrays.getMinIntegerFromArray(arr));
        System.out.println("Max Value:" + minMaxIntegerInArrays.getMaxIntegerFromArray(arr));
    }

    private int getMinIntegerFromArray(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Invalid Input");
        }

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        return min;
    }

    private int getMaxIntegerFromArray(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
