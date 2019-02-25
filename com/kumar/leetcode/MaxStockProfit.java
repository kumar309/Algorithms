package com.kumar.leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxStockProfit {

    public static void main(String[] args) {
        MaxStockProfit profit = new MaxStockProfit();
        int[] arr = {7,1,5,3,6,4};
        System.out.println("original:" + Arrays.toString(arr));
        //int[] arr = {7,6,4,3,1};
        int result = profit.maxProfit(arr);
        System.out.println("max profit:{}"+result);
        //System.out.println("max profit:{}"+profit.maxprofit2(arr))
    }

    public int maxProfit(int[] prices) {
        int res = 0;
        if(prices == null || prices.length <=1 )return res;
        int min = prices[0];
        //System.out.println("min:"+min);
        for(int i=1; i< prices.length; i++){
            System.out.println("min:"+min + " & prices[i]:"+prices[i]);
            if(prices[i] > min){
                res = Math.max(res, prices[i] - min);
                System.out.println("res:"+res);
            }else{
                min = prices[i];
                System.out.println("now min:"+ min);
            }
        }
        return res;
    }

    public int maxprofit2(int[] prices){
        int profit = 0;
        int min = 0;

        if(prices==null|| prices.length<=1)
            return profit;

        for(int i=1;i<prices.length;i++){
            if(prices[i] < min){
                min = prices[i];
            }else{
                profit = Math.max(profit,prices[i]-min);
            }
        }

        return profit;
    }
}
