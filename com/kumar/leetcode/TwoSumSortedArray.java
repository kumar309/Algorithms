package com.kumar.leetcode;

import java.util.Arrays;

public class TwoSumSortedArray {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSumSorted(nums, target)));
    }

    public static int[] twoSumSorted(int[] nums, int target){
        if(nums==null|| nums.length <2) return  new int[]{-1,-1};

        //take two pointers left from index 0 and right from the end.
        int left = 0, right = nums.length-1;

        while(left < right){
            int sum=nums[left] + nums[right];
            if(sum > target){
                right--;
            }else if(sum < target){
                left++;
            }else{
                return new int[]{left+1, right + 1};
            }
        }
        return  new int[] {-1,-1};
    }
}
