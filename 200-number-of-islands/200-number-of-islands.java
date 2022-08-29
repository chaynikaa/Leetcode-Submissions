class Solution {
    public int numIslands(char[][] grid) {
        boolean visited[][] = new boolean[grid.length][grid[0].length];
        int count = 0;
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1' && visited[i][j]!=true){
                    dfs(grid,visited,i,j);
                    count++;
                }
                    
            }
        }
        
        return count;
        
    }
    
    public void dfs(char[][]grid,boolean visited[][],int sr, int sc){
        
        if(sr<0 || sc<0 || sr>=grid.length || sc>=grid[0].length || visited[sr][sc]!=false || grid[sr][sc]=='0')
            return;
        
        visited[sr][sc] = true;
        
        dfs(grid,visited,sr+1,sc);
        dfs(grid,visited,sr,sc+1);
        dfs(grid,visited,sr-1,sc);
        dfs(grid,visited,sr,sc-1);

    }
}