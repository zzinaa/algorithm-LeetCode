class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        
        List<int[]> list = new ArrayList<>();

        for(int i = 0; i < intervals.length; i ++) {

            if(newInterval[1] < intervals[i][0]) { //검사하는 것 보다 앞에 있을 때
                list.add(newInterval);
                for(int j = i; j < intervals.length; j ++) list.add(intervals[j]);
                return list.toArray(new int[list.size()][]);
            } else if(newInterval[0] > intervals[i][1]) { //검사하는 것 보다 뒤에 있을 때
                list.add(intervals[i]);
            } else { //겹칠 때
                newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
                newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            }
        }

        list.add(newInterval);

        return list.toArray(new int[list.size()][]);
    }
}