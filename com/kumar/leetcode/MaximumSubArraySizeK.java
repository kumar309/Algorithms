package com.kumar.leetcode;

import java.util.HashMap;
import java.util.Map;

public class MaximumSubArraySizeK {
    public static void main(String[] args) {
        int[] arr = {1,2,-3,3,-1,2,4};

        MaximumSubArraySizeK instance = new MaximumSubArraySizeK();
        System.out.println(instance.maxSizeSubArraySumEqualK(arr,3));
    }

    public int maxSizeSubArraySumEqualK(int[] nums, int k){
        int sum = 0, max = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            sum +=  nums[i];
            System.out.println("index " + i + " sum:"+ sum);
            if(sum==k){
                System.out.println("max:"+ max + " i+1:"+(i+1));
                max = Math.max(max, i+1);

            }
            //You can store either sum or sum-k, we can use sum-k because when it's 0, we want to use the index value
            int diff = sum -k;
            System.out.println("current diff:" + diff);
            if(!map.containsKey(diff)){
                map.put(diff,i);
                System.out.println("Inserting Key:" + diff + " value: " + i);
            }else{
                System.out.println("Exists in Map as Key:" + diff + " value: " + i);
                max = Math.max(max, i - map.get(diff));
                System.out.println(" max of " + max + " vs " + (i - map.get(diff)));
            }
        }

        return max;
    }

}
