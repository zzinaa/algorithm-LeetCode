class Solution {
    public int[][] kClosest(int[][] points, int k) {

        PriorityQueue<int[]> pq = new PriorityQueue<>((p1, p2) -> 
        Integer.compare((int) Math.pow(p1[0], 2) + (int) Math.pow(p1[1], 2), (int) Math.pow(p2[0], 2) + (int) Math.pow(p2[1], 2)));
        
        for(int i = 0; i < points.length; i ++) {
            pq.offer(points[i]);
        }

        List<int[]> list = new ArrayList<>();
        for(int i = 0; i < k; i ++) {
            list.add(pq.poll());
        }

        return list.toArray(new int[list.size()][]);
    }
}