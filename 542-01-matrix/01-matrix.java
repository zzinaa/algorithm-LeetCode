class Solution {
    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, -1, 1};

    public int[][] updateMatrix(int[][] mat) {

        int m = mat.length;
        int n = mat[0].length;

        int[][] result = new int[m][n];
        boolean[][] visited = new boolean[m][n];
        Queue<int[]> q = new LinkedList<>();

        for(int i = 0; i < m; i ++) {
            for(int j = 0; j < n; j ++) {
                if(mat[i][j] == 0) {
                    visited[i][j] = true;
                    q.offer(new int[]{i, j});
                }
            }
        }

        while(!q.isEmpty()) {

            int[] cur = q.poll();

            for(int j = 0; j < 4; j ++) {
                int nx = cur[0] + dx[j];
                int ny = cur[1] + dy[j];

                if(nx < 0 || ny < 0 || nx >= mat.length || ny >= mat[0].length || visited[nx][ny]) continue;

                q.offer(new int[]{nx, ny});
                visited[nx][ny] = true;
                result[nx][ny] = result[cur[0]][cur[1]] + 1;
            }
        }
        return result;
    }

}