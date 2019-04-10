package com.kumar.leetcode;

import java.util.Arrays;

public class ReverseWords {

    public static void main(String[] args) {
        ReverseWords rw = new ReverseWords();
        String s = "the sky is blue";
        rw.reverseWords(s);
        System.out.println(rw.reverseWordsString(s));
    }


    public String reverseWords(String s) {
        if (s == null || s.length() == 0)
            return null;

        String[] strArr = s.split(" ");
        String temp = "";
        int len = strArr.length;
        //System.out.println("len:" + len);
        for (int i = 0; i < strArr.length / 2; i++) {
            temp = strArr[i];
            strArr[i] = strArr[len - 1 - i];
            strArr[len - 1 - i] = temp;
        }

        //String word = strArr.toString();

        String word = Arrays.toString(strArr);
        System.out.println(word);
        return word;
    }


    public String reverseWordsString(String s){
        if(s==null || s.length()==0){
            return "";
        }

        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i =arr.length-1 ; i>=0;i--){
            if(!arr[i].equals("")){
                sb.append(arr[i]).append(" ");
            }
        }

        return arr.length==0 ? "" :sb.substring(0,sb.length()-1);
    }
}
