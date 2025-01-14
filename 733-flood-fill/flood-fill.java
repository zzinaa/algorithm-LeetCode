class Solution {

    int[] dx = {1, -1, 0, 0};
    int[] dy = {0, 0, -1, 1};

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        if(image[sr][sc] == color) return image;

        int start = image[sr][sc];

        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{sr, sc});

        while(!q.isEmpty()) {

            int[] cur = q.poll();
            image[cur[0]][cur[1]] = color;

            for(int i = 0; i < 4; i ++) {
                int nx = cur[0] + dx[i];
                int ny = cur[1] + dy[i];

                if(nx < 0 || ny < 0 || nx >= image.length || ny >= image[0].length 
                || image[nx][ny] != start)
                continue;

                q.offer(new int[]{nx, ny});
            } 
        }

        return image;
    }
}