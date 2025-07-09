class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {

        int[] ans = new int[spells.length];

        Arrays.sort(potions);

        for(int i = 0; i < spells.length; i ++) {
            ans[i] = binarySearch(spells[i], potions, success);
        }

        return ans;
    }

    private int binarySearch(int spell, int[] potions, long success) {

        if((long) potions[potions.length - 1] * spell < success) return 0;
        if((long) potions[0] * spell >= success) return potions.length;

        int result = 0;

        int st = 0;
        int ed = potions.length - 1;
        int mid;

        while(st <= ed) {
            mid = (st + ed) / 2;

            if((long) potions[mid] * spell >= success && (long) potions[mid - 1] * spell < success) {
                return potions.length - mid;
            } else if ((long) potions[mid] * spell < success) {
                st = mid + 1; // 뒷부분 검사
            } else {
                ed = mid - 1; // 앞부분 검사
            }
        }

        return result;
    }
}