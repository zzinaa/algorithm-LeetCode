class Solution {
    public int removeDuplicates(int[] nums) {
        
        Set<Integer> set = new LinkedHashSet<>();
        for(int i = 0; i < nums.length; i ++) {
            set.add(nums[i]);
        }

        int idx = 0;
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()) {
            nums[idx] = it.next();
            idx ++;
        }
        
        return set.size();
    }
}