package com.kumar.leetcode;

public class MoveZeros {
    public static void main(String[] args) {
        MoveZeros moveZeros = new MoveZeros();
        int[] arr= {0,1,5,0,3,0,12};
        //System.out.println(moveZeros.moveZeroes(arr).toString());
        int[] result = moveZeros.moveZeroes(arr);
        for(int i:result){
            System.out.println(i);
        }
    }

    public int[] moveZeroes(int[] nums) {
        int pos =0;
        for(int i=0; i< nums.length;i++){
            if(nums[i] != 0){
                System.out.println("pos:"+ pos);
                nums[pos++] = nums[i];
                System.out.println("pos_incr:"+pos + " nums[i]:"+nums[i]);
            }
        }
        for(; pos < nums.length; pos++){
            nums[pos] =0;
        }
        return  nums;
    }
}
