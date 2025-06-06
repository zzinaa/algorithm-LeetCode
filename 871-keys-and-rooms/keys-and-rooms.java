class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        
        int n = rooms.size();
        boolean[] visited = new boolean[n];

        Queue<Integer> q = new LinkedList<>();
        q.offer(0);
        visited[0] = true;

        while(!q.isEmpty()) {
            int cur = q.poll();

            List<Integer> keys = rooms.get(cur);
            for(int key : keys) {
                if(visited[key]) continue;
                q.offer(key);
                visited[key] = true;
            }
        }

        for(boolean v : visited) {
            if(!v) return false;
        }

        return true;
    }
}