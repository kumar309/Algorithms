package com.kumar.problems;

import jdk.nashorn.internal.runtime.regexp.joni.encoding.CharacterType;

import java.util.Stack;

public class Calculator {
// You are building an educational website and want to create a simple calculator for students to use. The calculator will only allow addition and subtraction of non-negative integers.

// Given an expression string using the "+" and "-" operators like "5+16-2", write a function to find the total.

// Sample input/output:
// calculate("6+9-12")  => 3
// calculate("1+2-3+4-5+6-7") => -2
// calculate("100+200+300") => 600
// calculate("1-2-0") => -1
// calculate("255") => 255
// ur voice is breaking
        public static void main(String[] args) {
            String expression1 = "6+9-12"; // = 3
            String expression2 = "1+2-3+4-5+6-7"; // = -2
            String expression3 = "100+200+300"; // = 600
            String expression4 = "1-2-0"; // = -1
            String expression5 = "255"; // = 255

            Calculator s = new Calculator();
            System.out.println(s.calculate4(expression3));

        }

        public int calculate(String s){
            Stack<Integer> stack = new Stack();
            int sign = 1;
            int result = 0;
            for(int i =0; i < s.length();i++){
                if(Character.isDigit(s.charAt(i))){
                    int num = s.charAt(i)- '0';
                    while(i+1 < s.length() && Character.isDigit(s.charAt(i+1))){
                        num = num * 10 + s.charAt(i + 1)- '0';
                        i++;
                    }
                    result += num * sign;
                }
            }
            return  result;
        }

        public int calculate2(String s){
            int result = 0;
            int sign = 0;
            StringBuffer sb = new StringBuffer();
            Stack<Character> stack = new Stack<>();
            //int count = 0;
            for(int i = 0; i<s.length(); i++){
                System.out.println("i:"+i);
                System.out.println("visited char:"+s.charAt(i));
                if((s.charAt(i)=='+') || (s.charAt(i)=='-')){
                    System.out.println("pushing into stack:"+ s.charAt(i));
                    stack.push(s.charAt(i));
                }else{
                    Character currDigit = s.charAt(i);

//                    if(currDigit.isDigit(s.charAt(i+1))){
//                        continue;
//                    }
                    //sb.append(s.charAt(i));
                    if(stack.size() >0){
                        Character c = stack.pop();
                        String operand = c.toString();
                        System.out.println("Number is:"+sb.toString());
                        System.out.println("operand:"+operand);
                        Character currentDigit = s.charAt(i);
                        System.out.println("currentDigit:"+currentDigit);
                        //System.out.println("NextDigit:"+s.charAt(i+1));
                        if(currentDigit.isDigit(s.charAt(i+1))) {
                            continue;
                        }
                        if(operand.equals("+")) {
                            System.out.println("string to int:"+ Integer.parseInt(sb.toString()));
                            result = result + Integer.parseInt(currentDigit.toString()) +  Integer.parseInt(sb.toString());
                            System.out.println("result so far:" + result);
                            sb.setLength(0);
                        }else {
                            System.out.println("string to int for minus:"+ Integer.parseInt(sb.toString()));
                            result = result + Integer.parseInt(currentDigit.toString()) +  Integer.parseInt(sb.toString());
                            sb.setLength(0);
                        }
                    }else{
                        System.out.println("appending digit"+ s.charAt(i));
                        sb.append(s.charAt(i));
                    }
                }
            }
            return  result;
        }

//        public int calculate1(String s){
//            int result = 0;
//            StringBuffer sb = new StringBuffer();
//            Stack<Character> stack = new Stack<>();
//            int count = 0;
//            for(int i = 0; i<s.length()-1; i++){
//                System.out.println("subst:"+s.substring(i,i+1).equals('+'));
//                if(!s.substring(i,i+1).equals('+') || (!s.substring(i,i+1).equals('-'))){
//                    System.out.println("number found is:"+sb.toString());
//                    sb.append(s.charAt(i));
//
//                    if(count > 0){
//                        Character operand = stack.pop();
//                        result = result + Character.getNumericValue(operand) + Integer.parseInt(sb.toString());
//                        count = 0;
//                    }
//                }else{
//                    System.out.println("imhere");
//                    result= Integer.parseInt(sb.toString());
//                    char ch = s.charAt(i);
//                    stack.push(ch);
//                    count=1;
//                }
//            }
//            return result;
//        }

    //buttercola
    public int calculate3(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        s = s.trim();
        s = s.replaceAll("[ ]+", "");

        Stack<Integer> numStack = new Stack<>();
        Stack<Character> opStack = new Stack<>();

        int ans = 0;

        int i = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                int num = 0;
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    int digit = Character.getNumericValue(s.charAt(i));
                    num = num * 10 + digit;
                    i++;
                }
                numStack.push(num);
            } else {
                if (opStack.isEmpty() || c == '(') {
                    opStack.push(c);
                    i++;
                } else if (c == '*' || c == '/') {
                    if (opStack.peek() == '*' || opStack.peek() == '/') {
                        compute(numStack, opStack);
                    } else {
                        opStack.push(c);
                        i++;
                    }
                } else if (c == '+' || c == '-') {
                    compute(numStack, opStack);
                } else if (c == ')') {
                    while (!opStack.isEmpty() && opStack.peek() != '(') {
                        compute(numStack, opStack);
                    }
                    opStack.pop();
                    i++;
                }
            }
        }

        while (!opStack.isEmpty()) {
            compute(numStack, opStack);
        }

        return numStack.pop();
    }

    //only plus minus
    public int calculate4(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<Character> opStack = new Stack<>();
        int ans = 0;

        int i = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                int num = 0;
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    int digit = Character.getNumericValue(s.charAt(i));
                    num = num * 10 + digit;
                    i++;
                }
                numStack.push(num);
            } else {
                if (opStack.isEmpty()) {
                    opStack.push(c);
                    i++;
                } else if (c == '+' || c == '-') {
                    compute(numStack, opStack);
                }
            }
        }

        while (!opStack.isEmpty()) {
            compute(numStack, opStack);
        }
      return numStack.pop();
    }

    private void compute(Stack<Integer> numStack, Stack<Character> opStack) {
        int num2 = numStack.pop();
        int num1 = numStack.pop();

        char op = opStack.pop();
        int ans = 0;

        switch (op) {
            case '+':
                ans = num1 + num2;
                break;
            case '-' :
                ans = num1 - num2;
                break;
        }

        numStack.push(ans);
    }

}
