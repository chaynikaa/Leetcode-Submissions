class Solution {
//     public boolean searchMatrix(int[][] matrix, int target) {  //0(N^2) APPROACH       
//         for(int i=0;i<matrix.length;i++){
//             for(int j=0;j<matrix[0].length;j++){
//                 if(matrix[i][j]==target){
//                     return true;  
//                 }
//             }
//         }
//         return false;
//     }                                                           //one approach is consider the whole as 1 array 
                                                                   //apply binary search
    
        public boolean searchMatrix(int[][] matrix, int target) {   //start searching from top right corner
            int i = 0;
            int j = matrix[0].length-1;
            while(i<matrix.length && j>=0){
                if(matrix[i][j]==target)
                    return true;
                else if(matrix[i][j]>target)
                    j--;
                else
                    i++;
            }
            return false;
    }
}