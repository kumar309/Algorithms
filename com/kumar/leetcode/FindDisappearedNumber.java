package com.kumar.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumber {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDisappearedNumber(arr));
    }

    public static List<Integer> findDisappearedNumber(int[] nums){
        List<Integer> result = new ArrayList<>();
        if(nums ==null || nums.length==0) return  result;

        /*
        the idea is to take the value of nums[i], and goto that index position and mark that value as negative.
        once all the numbers are processed, then it will contain all the negative integers except what is missing.
        Run a second loop for numbers not negative and add it to the list for the result of missing numbers.
         */
        for(int i=0; i < nums.length; i++) {
            int val = Math.abs(nums[i]) - 1;

            if (nums[val] > 0) {
                nums[val] = -nums[val];
            }
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i] >0){
                result.add(i+1);
            }

        }
        return result;
    }
}
