class Solution {
    public void solve(char[][] board) {
        
        for(int j=0;j<board[0].length;j++){
            if(board[0][j]=='O')
                dfs(board,0,j);
            if(board[board.length-1][j]=='O')
                dfs(board,board.length-1,j);
        }
        
        for(int i=0;i<board.length;i++){
            if(board[i][0]=='O')
                dfs(board,i,0);
            if(board[i][board[0].length-1]=='O')
                dfs(board,i,board[0].length-1);
        }
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='#')
                    board[i][j]='O';
                else if(board[i][j]=='O')
                    board[i][j]='X';
            }
        }
        
        return;
        
    }
    
    public void dfs(char[][] grid, int sr, int sc){
        
        if(sr<0 || sc<0 || sr>=grid.length || sc>=grid[0].length || grid[sr][sc]!='O')
            return;
        
        grid[sr][sc]='#';
        
        dfs(grid,sr+1,sc);
        dfs(grid,sr-1,sc);
        dfs(grid,sr,sc+1);
        dfs(grid,sr,sc-1);
    }
}