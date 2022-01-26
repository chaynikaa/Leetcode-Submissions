class Solution {
    int n;
    int m;
    int fresh;
    int minute;
    int[][] steps = {{0,1}, {1,0}, {0,-1}, {-1,0}};
    private void rottenBFS(int[][]g, Queue<int[]> q){
        int size = q.size();
        for(int i = 0; i < size; i++){
            int[] p = q.poll();
            
            for(int[] s: steps){
                int x = s[0] + p[0];
                int y = s[1] + p[1];
                
                if(x < 0 || y < 0 || x >= n || y >= m || g[x][y] == 2 || g[x][y] == 0)
                    continue;
                g[x][y] = 2;
                fresh--;
                q.offer(new int[]{x,y});
            }
        }
        minute++;
        if(!q.isEmpty())
            rottenBFS(g, q);
    }
    public int orangesRotting(int[][] grid) {
        n = grid.length;
        m = grid[0].length;
        minute = 0;
        fresh = 0;
        Queue<int[]> queue = new LinkedList<>();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                 if(grid[i][j] == 2){
                     queue.offer(new int[]{i,j});
                 }
                if(grid[i][j] == 1)
                    fresh++;
            }
        }
        
        rottenBFS(grid, queue);
        return fresh >= 1? -1:minute-1;
        
    }
}