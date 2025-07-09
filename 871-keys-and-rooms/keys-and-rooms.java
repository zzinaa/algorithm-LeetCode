class Solution {

    boolean[] visited;

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        visited = new boolean[n];

        Queue<Integer> q = new LinkedList<>();
        q.offer(0);

        while(!q.isEmpty()) {
            int cur = q.poll();
            visited[cur] = true;

            for(int i = 0; i < rooms.get(cur).size(); i ++) {
                if(visited[rooms.get(cur).get(i)]) continue;
                q.offer(rooms.get(cur).get(i));
            }
        }

        for(int i = 0; i < n; i ++) {
            if(!visited[i]) return false;
        }

        return true;
    }
}