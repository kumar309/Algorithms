package com.kumar.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Kumar on 5/16/2017.
 */
public class TwoSum {
    public static void main(String[] args) {
        int arr[] = {3,-1,0,4,2,5};
        int target = 1;
        int arr_indices[] = twoSum(arr,target);
        System.out.println("index[0]" + arr_indices[0] + " index[1]"+ arr_indices[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> myMap = new HashMap<>();
        int[]result = new int[2];

        for(int i=0;i< nums.length;i++){
            System.out.println("i:"+i);
            System.out.println("Value:"+ myMap.get(nums[i]));
            if(myMap.get(nums[i])!=null){
                result[0]=myMap.get(nums[i]);
                result[1]=i;
                System.out.println("result[0]:"+ result[0] + " result[1]"+result[1]);
                return  result;
            }else{
                System.out.println("inserting K:"+(target-nums[i]) + " V:"+i);
                myMap.put(target-nums[i],i);
            }
        }
        return result;
    }
}
