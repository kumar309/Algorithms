package com.kumar.leetcode;

class ReverseWordsInStringII {
    public static void main(String[] args) {
        ReverseWordsInStringII rwis = new ReverseWordsInStringII();
        String s = "the sky is blue";
        char[] ch = s.toCharArray();
        rwis.reverseWords(ch);
    }
    public void reverseWords(char[] str) {
        int i = 0;
        for (int j = 0; j <= str.length; j++) {
            //after last word there is no white space, so check if length is now met
            //also check if white space is met.
            if (j == str.length || str[j] == ' ') {
                reverse(str, i, j - 1);
                i = j + 1;
            }
        }

        reverse(str, 0, str.length - 1);
        System.out.println(String.valueOf(str));
    }

    public void reverse(char[] s, int i, int j){
        while(i<j){
            char temp = s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }
    }

}

