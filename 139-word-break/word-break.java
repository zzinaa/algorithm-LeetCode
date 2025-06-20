class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        
        int len = s.length();
        boolean[] dp = new boolean[len + 1];
        dp[0] = true;

        for(int i = 1; i <= len; i ++) {
            for(int j = i - 1; j >= 0; j --) {
                String word = s.substring(j, i);
                if(wordDict.contains(word) && dp[j]) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[len];
    }
}