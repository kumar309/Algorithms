package com.kumar.leetcode;

import java.util.Arrays;

class RemoveDuplicateinArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 4, 5, 5, 6, 7};
        RemoveDuplicateinArray instance = new RemoveDuplicateinArray();
        //System.out.println(instance.removeDuplicates(arr));
        //System.out.println(instance.removeDuplicates2(arr));
        //System.out.println(instance.removeDupsArray(arr));
        testArray(arr);
}

    public int removeDuplicates(int[] nums) {
        int i = 0;

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public int removeDuplicates2(int[] nums) {
        if (nums == null) return 0;
        if (nums.length <= 1) return nums.length;
        int i = 0;
        //int j = 1;
        for (int j = 1; j < nums.length; ) {
            if (nums[i] == nums[j]) {
                j++;
            } else {
                nums[++i] = nums[j++];
                System.out.println("i:" + i + " j:" + j);
            }
        }
        return ++i;
    }

    public int removeDupsArray(int[] arr) {
        int n = arr.length;
        if (n == 0 || n == 1)
            return n;

        // To store index of next unique element
        int j = 0;

        // Doing same as done in Method 1
        // Just maintaining another updated index i.e. j
        for (int i = 0; i < n-1; i++)
            if (arr[i] != arr[i+1])
                arr[j++] = arr[i];

        arr[j++] = arr[n-1];

        for(int k =0; k<j-1; k++){
            System.out.println(arr[k]);
        }

        return j;
    }

    public  static void testArray(int[] arr){
        if(arr==null || arr.length==0)
            return;

        for(int i=0; i< arr.length-1;i++){
            System.out.println("arr[i++]:" + arr[i++]);
            System.out.println("i:" + i);
            System.out.println("***************");
            System.out.println("arr[++i]:" + arr[++i]);
            System.out.println("i:" + i);
        }
    }


}


