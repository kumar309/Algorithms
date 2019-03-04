package com.kumar.leetcode;

class RemoveDuplicateinArray {
    public static void main(String[] args) {
        int[] arr = {1,2,4,4,5,5,6,7};
        RemoveDuplicateinArray instance = new RemoveDuplicateinArray();
        //System.out.println(instance.removeDuplicates(arr));
        System.out.println(instance.removeDuplicates2(arr));
    }
    public int removeDuplicates(int[] nums) {
        int i = 0;

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public int removeDuplicates2(int[] nums) {
        if (nums == null) return 0;
        if (nums.length <= 1) return nums.length;
        int i = 0;
        //int j = 1;
        for (int j=1; j < nums.length; ) {
            if (nums[i] == nums[j]){
                j++;
            }
            else{
                nums[++i] = nums[j++];
                System.out.println("i:"+i + " j:" + j);
            }
        }
        return ++i;
    }


}

