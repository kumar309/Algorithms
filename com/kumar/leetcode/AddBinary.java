package com.kumar.leetcode;

public class AddBinary {
    public static void main(String[] args) {
        addBinaryNumbers("11","1");

    }

    public static String addBinaryNumbers(String a, String b){
        StringBuilder sb = new StringBuilder();
        int i =a.length()-1;
        int j = b.length() - 1;
        int carry = 0;

        while(i>=0 || j>=0){
            int sum = carry;
            if(i>=0){
                sum =sum + a.charAt(i) -'0';
            }

            if(j>=0){
                sum = sum + a.charAt(j) -'0';
            }
            sb.insert(0,sum%2);
            carry = sum/2;
        }
        if(carry > 0){
            sb.insert(0,1);
        }
        return  sb.toString();
    }
}
