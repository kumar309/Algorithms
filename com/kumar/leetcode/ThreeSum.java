package com.kumar.leetcode;

import javafx.util.Pair;
import java.util.*;

public class ThreeSum {

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        //System.out.println(threeSum(nums));
        System.out.println(threeSum2(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();

        if (nums == null || nums.length < 3)
            return new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                if (nums[i] + nums[j] + nums[k] == 0) {
                    List<Integer> l = new ArrayList<>();
                    l.add(nums[i]);
                    l.add(nums[j]);
                    l.add(nums[k]);
                    result.add(l);
                    j++;
                    k--;
                } else if (nums[i] + nums[j] + nums[k] < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return new ArrayList<>(result);
    }

    public static  List<List<Integer>> threeSum2(int[] nums) {
        if(nums==null || nums.length==0)return  new ArrayList<>();

        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        //use a hashset to handle duplicate triplets.
        Set<Pair<Integer,Integer>> set = new HashSet<>();
        for(int i=0; i< nums.length - 2; i++){ //we need to leave aside last two as we need it for comparison for triplets.
            int j= i + 1, k = nums.length -1;
            while(j<k){
                if(nums[i] + nums[j] + nums[k]>0) k--;
                else if(nums[i] + nums[j] + nums[k]<0) j++;
                else{
                    if(!set.contains(new Pair(nums[i],nums[j]))){
                        res.add(Arrays.asList(nums[i],nums[j],nums[k]));
                        set.add(new Pair(nums[i],nums[j]));
                    }
                    j++;
                    k--;
                }
            }
        }
        return  res;
    }
}

