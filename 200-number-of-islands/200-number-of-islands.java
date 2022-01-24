class Solution {
    public int numIslands(char[][] grid) {
        boolean visited[][]=new boolean [grid.length][grid[0].length];
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1' && visited[i][j]!=true){
                    dfs(grid,i,j,visited);
                    count++;
                }
            }
        }
        return count;
        
    }
    
    private void dfs(char[][]grid, int sr, int sc, boolean visited[][]){
        if(sr<0 || sc<0 || sr>=grid.length || sc>=grid[0].length || grid[sr][sc]!='1' || visited[sr][sc]==true)
            return;
        
        visited[sr][sc]=true;
        
        dfs(grid,sr+1,sc,visited);
        dfs(grid,sr-1,sc,visited);
        dfs(grid,sr,sc+1,visited);
        dfs(grid,sr,sc-1,visited);

    }
}