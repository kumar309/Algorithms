package com.kumar.problems;

public class Fibonacci {
    public static void main(String[] args) {
        //System.out.println(closestFibonacci(13));
        //System.out.println(closestFibonacci(12));
        //System.out.println(closestFibonacci(33));
        System.out.println(closestFibonacci(34));
    }

    static int closestFibonacci(int n) {
        int fib = 1;
        if (n == 1 || n == 2) {
            fib = 1;
        }
        int fib1 = 1;
        int fib2 = 1;
        for (int i = 3; i <= n; i++) {
            //System.out.println("fibo1:"+fib1 + " fibo2:"+fib2);
            fib = fib1 + fib2; //Fibonacci number is sum of previous two Fibonacci number
            //System.out.println("fibonacci:"+fib);

            if (fib > n) {
                return fib2;
            }
            fib1 = fib2;
            fib2 = fib;

        }

        return 0;
    }
}
