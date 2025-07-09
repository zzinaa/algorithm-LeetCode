class Solution {

    boolean[] visited;

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        visited = new boolean[n];
        visited[0] = true;

        dfs(rooms, 0);

        for(boolean v : visited) {
            if(!v) return false;
        }

        return true;
    }

    private void dfs(List<List<Integer>> rooms, int cur) {

        for(int key : rooms.get(cur)) {
            if(visited[key]) continue;
            visited[key] = true;
            dfs(rooms, key);
        }
    }
}