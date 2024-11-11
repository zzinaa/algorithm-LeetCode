class Solution {
    public int removeDuplicates(int[] nums) {
        
        int forth = nums[0];
        int idx = 1;
        for(int i = 1; i < nums.length; i ++) {
            if(forth == nums[i]) continue;
            nums[idx ++] = nums[i];
            forth = nums[i];
        }

        return idx;
    }
}