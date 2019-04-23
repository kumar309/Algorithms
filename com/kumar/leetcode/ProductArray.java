package com.kumar.leetcode;

import java.util.Arrays;

class ProductArray
{

//    void productArray1(int arr[], int n) {
//        int i, temp = 1;
//
//        /* Allocate memory for the product array */
//        int prod[] = new int[n];
//
//        /* Initialize the product array as 1 */
//        for (int j = 0; j < n; j++)
//            prod[j] = 1;
//
//        /* In this loop, temp variable contains product of
//           elements on left side excluding arr[i] */
//        for (i = 0; i < n; i++) {
//            prod[i] = temp;
//            System.out.println("temp:" + temp + "prod[" + i + "]:" + prod[i]);
//            temp *= arr[i];
//            System.out.println("temp:" + temp);
//        }
//
//
//        System.out.println("\n***Right Side***");
//        /* Initialize temp to 1 for product on right side */
//        temp = 1;
//
//        /* In this loop, temp variable contains product of
//           elements on right side excluding arr[i] */
//        for (i = n - 1; i >= 0; i--) {
//            System.out.println("temp:" + temp + "prod[" + i + "]:" + prod[i]);
//            prod[i] *= temp;
//            System.out.println("temp:" + temp + "prod[" + i + "]:" + prod[i]);
//            temp *= arr[i];
//            System.out.println("temp:" + temp + " & " + arr[i]);
//        }
//
//        /* print the constructed prod array */
//        for (i = 0; i < n; i++)
//            System.out.print(prod[i] + " ");
//
//        return;
//    }

    public void productArray2(int [] nums){
        int n = nums.length;
        int[] leftArr = new int[n];

        int left = 1;
        for(int i=0; i<n; i++){
            System.out.println("left:" + left);
            leftArr[i] = left;
            System.out.println("leftArr[" + i + "]:" + leftArr[i]);
            left = left * nums[i];
            System.out.println("new left:"+left);
        }
        System.out.println("Left Array:" + Arrays.toString(leftArr));
        int right = 1;
        int[] prodArr = leftArr;

        for(int i=n-1; i>=0;i--){
            prodArr[i] = right * prodArr[i];
            right = right * nums[i];
        }

        System.out.println(Arrays.toString(prodArr));
    }

    /* Driver program to test above functions */
    public static void main(String[] args) {
        ProductArray pa = new ProductArray();
        int arr[] = {1, 2, 3, 4};
        int n = arr.length;
        //System.out.println("The product array is : ");
        //pa.productArray1(arr, n);
        pa.productArray2(arr);

    }
}

