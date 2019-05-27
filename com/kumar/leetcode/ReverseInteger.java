package com.kumar.leetcode;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverseInteger(123));
    }

    public static int countTotalDigitsInNum(int num) {
        int result = 0;
        int count = 0;
        while (num > 0) {
            System.out.println("num%10:" + num % 10);
            num = num / 10;
            System.out.println("num:" + num);
            count++;
        }
        System.out.println("total size of int:" + count);
        return result;
    }

    public static int reverseInteger(int num) {
        int rev = 0;
        while (num != 0) {
            //System.out.println(" "+rev * 10);
           //System.out.println(" "+ num % 10);
            rev = rev * 10 + num % 10;
            System.out.println(rev);
            num = num / 10;
        }

        return rev;

    }
}
