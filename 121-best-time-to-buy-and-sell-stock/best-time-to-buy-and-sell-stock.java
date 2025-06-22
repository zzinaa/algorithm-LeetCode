class Solution {
    public int maxProfit(int[] prices) {
        
        int profit = 0;
        int buy = prices[0];

        for(int i = 1; i < prices.length; i ++) {
            if(buy < prices[i]) { // 산 값보다 비쌀 경우
                profit = Math.max(profit, prices[i] - buy); // 비교
            } else {
                buy = prices[i]; // 쌀 경우에는 i 번째에 사는 걸로 변경
            }
        }

        return profit;
    }
}