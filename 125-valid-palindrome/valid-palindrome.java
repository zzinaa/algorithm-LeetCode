class Solution {
    public boolean isPalindrome(String s) {
        String lowerS = s.toLowerCase();
        StringBuilder sb = new StringBuilder();

        for(char c : lowerS.toCharArray()) {
            if(Character.isDigit(c) || Character.isAlphabetic(c)) {
                sb.append(c);
            }
        }

        String palindromTarget = sb.toString();

        int start = 0;
        int end = palindromTarget.length() - 1;

        while(start < end) {
            if(palindromTarget.charAt(start) != palindromTarget.charAt(end)) {
                return false;
            }

            start ++;
            end --;
        }

        return true;
    }
}