class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        
         int m = mat.length;
         int n = mat[0].length;
        
         if((m*n) != (r*c))   //no. of elements are not equal
             return mat;
        
        int[][] ans = new int[r][c];
        int row=0;
        int col=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
             ans[row][col] = mat[i][j];
                col++;
                
                if(col == c){   //if we crossed the column
                    row++;      //start another row
                    col=0;      //initialize column to 0 again
                }
            }
        } 
      return ans;  
        
    }
}

