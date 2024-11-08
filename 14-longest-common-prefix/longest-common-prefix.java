class Solution {
    public String longestCommonPrefix(String[] strs) {

        String ans = "";
        int idx = 0;

        while(idx <= 200) {
            if(strs[0].length() < idx) return ans;
            String tmp = strs[0].substring(0, idx); //f
            for(int i = 1; i < strs.length; i ++) {
                if(strs[i].length() < idx) return ans;
                String sub = strs[i].substring(0, idx); // f, f
                if(!tmp.equals(sub)) return ans;
            }
            ans = tmp;
            idx ++;
        }

        return ans;
    }
}