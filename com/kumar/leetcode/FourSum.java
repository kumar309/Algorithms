package com.kumar.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static void main(String[] args) {
        int[] nums = {4,3,3,4,4,2,1,2,1,1};
        int target = 9;
        fourSum(nums,target);

    }

    //tc -> o(n)^3, sc-> O(1)
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();

        if (nums == null || nums.length == 0)
            return res;

        Arrays.sort(nums);

        //use 4 pointers. start i from 0th, j from 1st, left from 2nd, right from end
        //fixed i and j and then use two sum method to find the two numbers between left and right
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int remaining_sum = target - nums[j] - nums[i];
                int left = j + 1;
                int right = nums.length - 1;

                while (left < right) {
                    int two_sum = nums[left] + nums[right];
                    if (two_sum < remaining_sum) {
                        left++;
                    } else if (two_sum > remaining_sum) {
                        right--;
                    } else {
                        List<Integer> quad = new ArrayList<>();
                        quad.add(nums[i]);
                        quad.add(nums[j]);
                        quad.add(nums[left]);
                        quad.add(nums[right]);
                        res.add(quad);
                        System.out.println("Inserted quadruplet:"+nums[i] + "," + nums[j]+ "," + nums[left]+ "," + nums[right]);

                        //ignore the duplicate for the 3rd number(left pointer)
                        while (left < right && nums[left] == quad.get(2)) ++left;

                        //ignore the duplicate for thr 4th number( right pointer)
                        while (left < right && nums[right] == quad.get(3)) --right;
                    }
                }

                //check duplicates of number 2 (j pointer) and ignore if duplicate.
                //move j to one value before the non duplicate as above loop also does j++
                while (j + 1 < nums.length && nums[j + 1] == nums[j]) ++j;
            }
            //check duplicates of number 1 (i pointer) and ignore if duplicate.
            //move i to one value before the non duplicate as above loop also does i++
            while (i + 1 < nums.length && nums[i + 1] == nums[i]) ++i;
        }
        return res;
    }
}
