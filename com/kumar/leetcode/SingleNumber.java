package com.kumar.leetcode;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {2,2,1};
        System.out.println(singleNumber(nums));


    }

    public static int singleNumber(int[] nums){
        int unique = 0;

        for(Integer n: nums){
            unique = unique ^ n;  //using the xor property where if two elements have same value, return false else return true.
        }
        return  unique;
    }
}
