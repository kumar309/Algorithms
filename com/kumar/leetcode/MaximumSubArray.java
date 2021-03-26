package com.kumar.leetcode;

/**
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 * <p>
 * Idea is to use Kadane Algorithm which  look for all positive contiguous segments of the array (max_ending_here is used for this).
 * And keep track of maximum sum contiguous segment among all positive segments (max_so_far is used for this).
 * Each time we get a positive-sum compare it with max_so_far and update max_so_far if it is greater than max_so_far
 */

public class MaximumSubArray {

    /*
      below method only works when array is purely non negative integers.
      check maxSubArraySum2 for main solution.
     */
    public int maxSubArraySum(int[] nums) {
        int maxSoFar = 0;
        int maxEndingHere = 0;

        for (int i = 0; i < nums.length; i++) {
            maxEndingHere = maxEndingHere + nums[i];
            if (maxEndingHere > maxSoFar)
                maxSoFar = maxEndingHere;
            if (maxEndingHere < 0)
                maxEndingHere = 0;
        }
        return maxSoFar;
    }

    public int maxSubArraySum2(int[] nums) {
        int result = nums[0];
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (sum <= 0) {
                sum = nums[i];
            } else {
                sum += nums[i];
            }
            result = Math.max(result, sum);
        }
        return result;
    }


    public static void main(String[] args) {
        int[] nums = {-2, 11, -3, 14, -1, 12, 11, -5, -4};
        //int[] nums = {-4,-3,-2,-1,-8,-7,1};
        MaximumSubArray msa = new MaximumSubArray();
        System.out.println(msa.maxSubArraySum2(nums));
    }
}
