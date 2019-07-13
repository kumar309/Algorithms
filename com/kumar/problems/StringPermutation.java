package com.kumar.problems;

public class StringPermutation {
    public static void main(String[] args) {
        StringPermutation sp = new StringPermutation();
        sp.permutation("xyz");
    }

    public void permutation(String input){
        permutation("",input);
    }

    public void permutation(String perm, String input) {
        String word = "";
        if (input == null || input.length() == 0) {
            System.err.println(perm + word);
        } else {
            for (int i = 0; i < input.length(); i++) {
                permutation(perm + input.charAt(i), input.substring(0, i) + input.substring(i + 1, input.length()));
            }
        }
    }

}
