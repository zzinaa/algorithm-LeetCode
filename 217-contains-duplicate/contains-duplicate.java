class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Set<Integer> onlyOneSet = new HashSet<>();
        onlyOneSet.add(nums[0]);

        for(int i = 1; i < nums.length; i ++) {
            if(onlyOneSet.contains(nums[i])) return true;
            onlyOneSet.add(nums[i]);
        }

        return false;
    }
}