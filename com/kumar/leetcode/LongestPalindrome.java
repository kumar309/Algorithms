package com.kumar.leetcode;

public class LongestPalindrome {

    public static void main(String[] args) {
        LongestPalindrome lp = new LongestPalindrome();
        String result = lp.longestPalindrome("banana");
        System.out.println(result);
    }

    public String longestPalindrome(String s) {
        if(s==null || s.length()<=1)
            return s;

        int len = s.length();
        System.out.println("len:"+len);
        int maxLen = 1;
        boolean [][] dp = new boolean[len][len];

        String longest = null;
        for(int l=0; l<s.length(); l++){
            for(int i=0; i<len-l; i++){
                int j = i+l; //(I + L)
                System.out.println("j:"+j);
                System.out.println("s.charAt(i):" + s.charAt(i) + " s.charAt(j):" + s.charAt(j));
                System.out.println("j-i:"+ (j-i));
                System.out.println("[i+1]:" + (i+1)+ "[j-1]:" + (j-1));
                if(s.charAt(i)==s.charAt(j) && (j-i<=2||dp[i+1][j-1])){
                    dp[i][j]=true;
                    System.out.println("j-i+1" + (j-i+1));
                    if(j-i+1>maxLen){
                        maxLen = j-i+1;
                        System.out.println("maxLen:"+ maxLen);
                        longest = s.substring(i, j+1);
                        System.out.println("longest:" + longest);
                    }
                }
            }
        }

        return longest;
    }
}
