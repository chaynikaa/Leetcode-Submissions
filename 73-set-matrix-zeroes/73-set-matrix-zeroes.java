class Solution {
    public void setZeroes(int[][] matrix) {     //0(1) space solution
    int flag = 0;
        
      for(int i=0;i<matrix.length;i++){ 
          if(matrix[i][0]==0)                   //check if we need to make first column to zero or not
              flag=1;
          
          for(int j=1;j<matrix[0].length;j++){   //marking the first row and column to be zero
                if(matrix[i][j]==0){
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                 }
           }
        }
        

        for(int i=1;i<matrix.length;i++){         //marking the whole row and col to zero except first row nd col
                for(int j=1;j<matrix[0].length;j++){
                    if(matrix[i][0]==0 || matrix[0][j]==0)
                        matrix[i][j]=0;
                }
        }
        
        //if the first row need to be set to zero then by above conditions matirx 0,0 will be 0                         
        if(matrix[0][0]==0){ 
            for(int j=0;j<matrix[0].length;j++)
                matrix[0][j]=0;
        }

        if(flag==1){                      //setting the first col to zero
            for(int i=0;i<matrix.length;i++)
                matrix[i][0]=0;
        }
        
 }
}



// class Solution {
//     public void setZeroes(int[][] matrix) {     //0(m+n) space solution
//         HashSet<Integer> rset = new HashSet<>();
//         HashSet<Integer> cset = new HashSet<>();
        
//         for(int i=0;i<matrix.length;i++){         //storing the rows and columns in set
//             for(int j=0;j<matrix[0].length;j++){
//                 if(matrix[i][j]==0){
//                     rset.add(i);
//                     cset.add(j);
//                 }
//             }
//         }
        
//            for(int i=0;i<matrix.length;i++){  //setting the value to 0
//             for(int j=0;j<matrix[0].length;j++){
//                 if(rset.contains(i) || cset.contains(j)){
//                   matrix[i][j]=0;
//                 }
//             }
//         }
        
        
//     }
