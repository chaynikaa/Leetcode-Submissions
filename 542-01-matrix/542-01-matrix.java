class Solution {
    
    private static int[][] dir = new int[][]{ {1,0},{0,1},{-1,0},{0,-1}};
    
        private static class Pair {
        int x;
        int y;

        Pair(int x, int y) {
          this.x = x;
          this.y = y;
        }  
    }
    
    public int[][] updateMatrix(int[][] mat) {
        
        Queue<Pair> q = new LinkedList<>();
        
        for(int i=0;i<mat.length;i++){
            for(int j=0; j<mat[0].length;j++){
                if(mat[i][j]==0)
                    q.add(new Pair(i,j));
                else
                    mat[i][j]=-1;
            }
        }
        
        while(q.size()>0){
            
            Pair rem = q.remove();
            
            for(int i=0;i<dir.length;i++){
                int temprow = rem.x + dir[i][0];
                int tempcol = rem.y+dir[i][1];
                
                if(temprow>=0 && tempcol>=0 && temprow<mat.length && tempcol<mat[0].length && mat[temprow][tempcol]<0){
                    mat[temprow][tempcol] = mat[rem.x][rem.y] + 1;
                    q.add(new Pair(temprow,tempcol));
                }
            }
        }
      return mat;  
    }
}