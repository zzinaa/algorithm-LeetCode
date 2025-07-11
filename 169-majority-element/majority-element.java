class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for(int i = 0; i < n; i ++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        int ans = 0;

        for(int key : map.keySet()) {
            int count = map.get(key);
            if(count > n / 2) {
                ans = key; 
                break;
            }
        }

        return ans;
    }
}