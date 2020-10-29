package com.kumar.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParanthesis {

    public static void main(String[] args){
        //String s = "{({})}";
        String s = "{({})}(";
        System.out.println(isValidParanthesis(s));
    }

    public static boolean isValidParanthesis(String s){
        boolean result = false;
        if(s==null || s.length()==0)
            return  false;

        Map<Character,Character> map = new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');

        Stack<Character>  stack = new Stack<>();

        for(int i=0; i< s.length();i++){
            char curr = s.charAt(i);
            if(map.keySet().contains(curr)){
                stack.push(curr);
            }else{
                if(map.values().contains(curr)){
                    if(!stack.isEmpty() && map.get(stack.peek())==curr){
                        stack.pop();
                    }
                }else {
                    return false;
                }
            }
        }
        return  stack.isEmpty();
    }
}
