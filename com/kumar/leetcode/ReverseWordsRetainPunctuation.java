package com.kumar.leetcode;

public class ReverseWordsRetainPunctuation {
    public static void main(String[] args) {
        //String s = revStr("hello brave's new world");
        String st = revWords("hello brave's new world");
        //System.out.println(s);
        System.out.println(st);
    }

    public static String revStr(String s){
        StringBuilder sb = new StringBuilder();
        for (int i=s.length()-1; i>=0;i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static String revWords(String str) {
        StringBuilder sb = new StringBuilder();
        String revd = revStr(str);
        System.out.println("revd:"+revd);
        for (String s : revd.split(" ")){
            sb.append(revStr(s));
            sb.append(" ");
        }
        return sb.toString();
    }

}
