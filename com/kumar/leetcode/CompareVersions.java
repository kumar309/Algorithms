package com.kumar.leetcode;

public class CompareVersions {

    public static void main(String[] args) {
        String s1 = "2.0.4";
        String s2 = "2.0.3.1";
        System.out.println(compareVersions(s1,s2));
    }

    public static int compareVersions(String s1, String s2){
            String[] nums1 = s1.split("\\.");
            String[] nums2 = s2.split("\\.");

            int i=0;
            while(i<nums1.length || i < nums2.length){
                if(i<nums1.length && i<nums2.length){
                    if((Integer.parseInt(nums1[i]) < Integer.parseInt(nums2[i]))) {
                        return -1;
                    }else if (Integer.parseInt(nums1[i]) > Integer.parseInt(nums2[i])) {
                        return  1;
                    }
                }else if(i< nums1.length){
                    if(Integer.parseInt(nums1[i])!=0){
                        return 1;
                    }
                } else if(i<nums2.length){
                    if(Integer.parseInt(nums2[i])!=0){
                        return  -1;
                    }

                }
                i++;
            }
        return  0;
    }
}
