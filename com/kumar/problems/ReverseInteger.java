package com.kumar.problems;

import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printDigits(num);

    }

    public static void printDigits(int num){
        System.out.println("Input num:" + num);
        int reverse = 0;
        while(num >0){
            reverse = reverse *10;
            System.out.println("reverse:" +reverse);
            //System.out.println("num%10:" + num%10);
            reverse = reverse + num%10;
            //System.out.println("reverse:" +reverse);
            num = num/10;
            //System.out.println("num:"+num);

        }
        System.out.println(reverse);
    }
}
