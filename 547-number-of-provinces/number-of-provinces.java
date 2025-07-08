class Solution {

    boolean[] visited;

    public int findCircleNum(int[][] isConnected) {
        int cnt = 0; 
        int n = isConnected.length;
        visited = new boolean[n];

        for(int i = 0; i < n; i ++) {
            if(visited[i]) continue;
            dfs(isConnected, n, i);
            cnt ++;
        }

        return cnt;
    }

    private void dfs(int[][] isConnected, int n, int i) {
        visited[i] = true;

        for(int j = 0; j < n; j ++) {
            if(visited[j]) continue;
            if(isConnected[i][j] == 1) {
                dfs(isConnected, n, j);
            }
        }
    }
}