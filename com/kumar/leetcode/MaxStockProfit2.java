package com.kumar.leetcode;

public class MaxStockProfit2 {
    public static void main(String[] args) {
        MaxStockProfit2 profit = new MaxStockProfit2();
        int[] arr = {100, 180, 260, 310, 40, 535, 695};
        int result = profit.maxProfit(arr);
        System.out.println("max profit:" + result);
    }

    public int maxProfit(int[] prices) {
        int buy = 0;
        int sell = 0;

        buy = prices[0];
        int max = 0;
        max = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > max) {
                max = prices[i];
            } else {
                sell = max;
                System.out.println("buy:" + buy + " sell:" + sell);

                buy = prices[i];
                max = prices[i];
            }

            if (i == prices.length - 1) {
                sell = max;
                System.out.println("buy:" + buy + " sell:" + sell);
            }
        }
         return max;

    }
}
