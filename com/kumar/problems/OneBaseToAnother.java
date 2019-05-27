package com.kumar.problems;

public class OneBaseToAnother {
    public static void main(String[] args) {
        //System.out.println(base10ToBase7("100"));
        System.out.println(convDecimalToBase(100,7));
    }


    public static String base10ToBase7(String num){
        System.out.println(Integer.parseInt(num,10));
        System.out.println(Integer.toString(100,7));
        return Integer.toString(Integer.parseInt(num, 10), 7);
    }

    public static String convDecimalToBase(int num, int base){
        String result = "";
        int remainder =0;

        while (num>0){
            remainder = num%base;
            System.out.println("result:"+result+ "remainder:"+remainder);
            result = result + remainder;
            num = num/base;
        }


        return result;
    }
}
