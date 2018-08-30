package com.leetcode;

public class BestTimeToBuy {
    public static void main(String[] args) {
        int[] prices = {1,2};
        BestTimeToBuy ins = new BestTimeToBuy();
        int profit = ins.maxProfit(prices);
        System.out.println(profit);
    }

    public int maxProfit(int[] prices) {
        int profit = 0;
        if(prices == null || prices.length <=1) return profit;

        boolean buyFlag = false;
        int buyPrice  =0;
        int prev = prices[0];
        for (int i = 1; i < prices.length ; i++) {
            if(!buyFlag && prev < prices[i]){
                buyPrice = prev;
                buyFlag = true;
            }else if(buyFlag && (prev > prices[i])){
                 profit = profit + (prev - buyPrice);
                System.out.println("profit is : " + profit);
                 buyFlag = false;
            }

            if (buyFlag && i == (prices.length -1)){
                profit = profit + (prices[i] - buyPrice);
                System.out.println("profit is : " + profit);
            }
            prev = prices[i];
        }

        return profit;

    }

    public int maxProfitOptimum(int[] prices) {
        int maxprofit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                maxprofit += prices[i] - prices[i - 1];
        }
        return maxprofit;
    }
}
