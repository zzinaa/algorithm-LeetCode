class Solution {
    public int romanToInt(String s) {
        
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int sum = 0;
        int back = 0;
        for(int i = s.length() - 1; i >= 0; i --) {
            char cur = s.charAt(i);
            int num = map.get(cur);
            if(num < back) sum -= num;
            else sum += num;
            back = num;
        }

        return sum;
    }
}