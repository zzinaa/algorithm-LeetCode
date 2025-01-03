class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int minus = target - nums[i];
            if(map.containsKey(minus)) {
                return new int[]{map.get(minus), i};
            }
            map.put(nums[i], i);
        }

        return new int[]{};
    }
}