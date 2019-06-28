package com.kumar.problems;

public class Palindrome {
    public static boolean isPalindrome(String word) {
        int len = word.length();
        String rev = "";
        for(int i=0; i<len;i++){
            if(Character.toLowerCase(word.charAt(i))!=Character.toLowerCase(word.charAt(len - i -1)))
                return false;
        }


        return true;
    }

    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("Deleveled"));
    }
}