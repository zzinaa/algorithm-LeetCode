class Solution {
    public int maxArea(int[] height) {
        
        int N = height.length;
        int max = 0;
        int l = 0;
        int r = N - 1;

        while(true) {

            int amount = (r - l) * Math.min(height[r], height[l]);
            max = Math.max(amount, max);

            if(height[l] < height[r]) {
                l ++;
            } else {
                r --;
            }
            if(l == r) break;
        }

        return max;
    }
}