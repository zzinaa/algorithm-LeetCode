class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] ans = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if(map.get(nums[i]) != null) {
                ans[0] = map.get(nums[i]);
                ans[1] = i;
                break;
            }
            int minus = target - nums[i];
            map.put(minus, i);
        }

        return ans;
    }
}