class Solution {
    public int maxProfit(int[] prices) {

        int buy = prices[0];
        int profit = 0;

        for(int i = 1; i < prices.length; i ++) {
            if(buy < prices[i]) {
                profit += (prices[i] - buy);
                buy = prices[i];
            } else if (buy > prices[i]) {
                buy = prices[i];
            }
        }
        
        return profit;
    }
}