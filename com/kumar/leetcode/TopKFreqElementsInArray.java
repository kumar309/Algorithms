package com.kumar.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFreqElementsInArray {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3,3,3,3,3,3,3};
        int k = 2;
        getTopKFreqElements(nums,2 );
        //System.out.println();
    }

    public static List<Integer> getTopKFreqElements(int[] nums, int k){
        List<Integer> res = new ArrayList<>();
        Map<Integer, Integer> freqMap = new HashMap<>();

        //1. store the freq into a map
        for(int i=0; i < nums.length; i++){
            freqMap.put(nums[i], freqMap.getOrDefault(nums[i],0)+ 1);
        }

        //create a bucket list where index position will be freq of occurence.
        List<Integer>[] bucket = new ArrayList[nums.length + 1];

        for( int key: freqMap.keySet()){
            int freq = freqMap.get(key);
            if(bucket[freq]==null)
                bucket[freq] = new ArrayList<>();
                bucket[freq].add(key);
        }

        // fill the result list and return
        for(int pos = nums.length; pos >=0 && res.size()<k; pos--){
            if(bucket[pos]!=null){
                res.addAll(bucket[pos]);
                System.out.println(bucket[pos]);
            }
        }

        return  res;
    }
}
