class Solution {
    public boolean isPalindrome(String s) {
        
        String str = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        if(str.isEmpty()) return true;

        int start = 0;
        int end = str.length() - 1;

        while(start <= end) {
            if(start >= str.length() || end < 0) break;
            if(str.charAt(start) != str.charAt(end)) return false;
            start ++;
            end --;
        }

        return true;
    }
}