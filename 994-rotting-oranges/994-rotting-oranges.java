class Solution {
    private static int[][]dir = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
    private static class Pair{
        int x;
        int y;
        
        Pair(int x,int y){
            this.x = x;
            this.y = y;
        }
    }
    public int orangesRotting(int[][] grid) {
        Queue<Pair> q = new LinkedList<>();
        int fresh = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2)
                    q.add(new Pair(i,j));
                if(grid[i][j]==1)
                    fresh++;
            }
        }
        
        if(fresh==0)
            return 0;
        
        int time = -1;
        
        while(q.size()>0){
            int size = q.size();
            time++;
            
            while(size-->0){
                Pair rem = q.remove();
                for(int i=0;i<dir.length;i++){
                    int tempr = rem.x + dir[i][0];
                    int tempc = rem.y + dir[i][1];
                    
                    if(tempr>=0 && tempc>=0 && tempr<grid.length && tempc<grid[0].length && grid[tempr][tempc]==1){
                        grid[tempr][tempc]=0;
                        q.add(new Pair(tempr,tempc));
                        fresh--;
                    }
                }
            }
        }
                    
            if(fresh==0)
                return time;
            else
                return -1;
            
    }
}