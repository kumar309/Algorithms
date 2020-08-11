package com.kumar.leetcode;

public class MoveZeros {
    public static void main(String[] args) {
        MoveZeros moveZeros = new MoveZeros();
        int[] arr = {0, 1, 5, 0, 3, 0, 12};
        //System.out.println(moveZeros.moveZeroes(arr).toString());
        int[] result = moveZeros.moveZeroes(arr);
        //int[] result = moveZeros.moveZeros(arr);
        for (int i : result) {
            System.out.println(i);
        }
    }

    public int[] moveZeroes(int[] nums) {
        int pos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[pos] = nums[i];
                pos++;
            }
        }
        //at this point pos is incremented till the index which has last non 0 value.so continue after that put 0 till length of array.
        for (; pos < nums.length; pos++) {
            nums[pos] = 0;
        }
        return nums;
    }

    public int[] moveZeros(int[] nums) {
        int count = 0;
        int len = nums.length;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[count++] = nums[i];
            }
        }

        while (count < len) {
            nums[count++] = 0;
        }
        return nums;
    }
}
