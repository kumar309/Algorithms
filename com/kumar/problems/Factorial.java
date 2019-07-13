package com.kumar.problems;

public class Factorial {
    public static void main(String[] args) {
        Factorial f = new Factorial();
        System.out.println(f.factorial(7));

        System.out.printf("recursive factorial:" + f.factorialRecursive(7));
    }

    public int factorial(int n){
        int fact=1;

        for(int i=1; i<=n; i ++){
            fact = fact * i;
        }
        return  fact;
    }

    public int factorialRecursive(int n){
        if(n==0){
            return 1;
        }else{
            return n * factorialRecursive(n-1);
        }
    }
}
