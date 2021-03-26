package com.kumar.leetcode;

/**
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 * <p>
 * Idea is to use Kadane Algorithm which  look for all positive contiguous segments of the array (max_ending_here is used for this).
 * And keep track of maximum sum contiguous segment among all positive segments (max_so_far is used for this).
 * Each time we get a positive-sum compare it with max_so_far and update max_so_far if it is greater than max_so_far
 */

public class MaximumSubArray {

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

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        MaximumSubArray msa = new MaximumSubArray();
        System.out.println(msa.maxSubArraySum(nums));
    }
}
