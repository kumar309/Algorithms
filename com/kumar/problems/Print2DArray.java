package com.kumar.problems;

import java.util.Arrays;

public class Print2DArray {
    public static void main(String[] args) {
        Print2DArray print2DArray = new Print2DArray();
        int[][] arr = {{1,2,3},
                       {4,5,6},
                       {7,8,9},
                       {10,11,12}
                      };
        //print2DArray.print2DArray(arr);
        for(int i=0;i<arr.length;i++)
        System.out.println(Arrays.toString(arr[i]));
        System.out.println(arr[2][1]);
    }


    public void print2DArray(int[][] arr) {
        for(int i=0; i < arr.length; i++){
            for(int j=0; j < arr[0].length; j++){
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
