class Solution {
    
    private static int[][] dir = new int[][]{ {1,0},{0,1},{-1,0},{0,-1}};  //direction array
    
    private static class Pair {     //pair class
        int x;
        int y;

        Pair(int x, int y) {
          this.x = x;
          this.y = y;
        }  
    }
    
    public int[][] updateMatrix(int[][] mat) {
        
        Queue<Pair> q = new LinkedList<>();  //new queue
        
        for(int i=0;i<mat.length;i++){   
            for(int j=0; j<mat[0].length;j++){
                if(mat[i][j]==0)             //additing the indices of 0
                    q.add(new Pair(i,j));
                else
                    mat[i][j]=-1;           //setting the others to -1
            }
        }
        
        while(q.size()>0){
            
            Pair rem = q.remove();    //removing the 0th element
            
            for(int i=0;i<dir.length;i++){
                int temprow = rem.x + dir[i][0];    //traversing in all possible valid directions
                int tempcol = rem.y+dir[i][1];
                
                if(temprow>=0 && tempcol>=0 && temprow<mat.length && tempcol<mat[0].length && mat[temprow][tempcol]<0){
                    mat[temprow][tempcol] = mat[rem.x][rem.y] + 1;   //means it is solvable. put the distance.
                    q.add(new Pair(temprow,tempcol));                //add the solved one for next iteration
                }
            }
        }
      return mat;  
    }
}