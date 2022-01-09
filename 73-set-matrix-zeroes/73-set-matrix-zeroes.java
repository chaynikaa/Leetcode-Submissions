class Solution {
    public void setZeroes(int[][] matrix) {     //0(m+n) space solution
        HashSet<Integer> rset = new HashSet<>();
        HashSet<Integer> cset = new HashSet<>();
        
        for(int i=0;i<matrix.length;i++){         //storing the rows and columns in set
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    rset.add(i);
                    cset.add(j);
                }
            }
        }
        
           for(int i=0;i<matrix.length;i++){  //setting the value to 0
            for(int j=0;j<matrix[0].length;j++){
                if(rset.contains(i) || cset.contains(j)){
                  matrix[i][j]=0;
                }
            }
        }
        
        
    }
}