class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        Arrays.sort(strs, (s1, s2) -> s1.length() - s2.length());

        String ans = "";
        for(int i = 1; i <= strs[0].length(); i ++) {

            String sub = strs[0].substring(0, i);
            for(int j = 1; j < strs.length; j ++) {
                if(!strs[j].substring(0, i).equals(sub)) return ans;
            }

            ans = sub;
        }

        return ans;
    }
}