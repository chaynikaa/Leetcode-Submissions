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
//     }                                                           
    
        public boolean searchMatrix(int[][] matrix, int target) {   //one approach is consider the whole as 1array 
                                                                   //apply binary search
            int m = matrix.length;;
            int n = matrix[0].length;
            int left = 0;
            int right = m*n - 1;
            
            // if(m==0)
            //     return false;
                        
            while(left<=right){
                int mid = (left+right)/2;
                
                if(matrix[mid/n][mid%n]==target)
                    return true;
                else if(matrix[mid/n][mid%n]>target)
                    right=mid-1;
                else
                    left=mid+1;
            }
        
            return false;
    }
    
    //        public boolean searchMatrix(int[][] matrix, int target) {   //start searching from top right corner
    //         int i = 0;
    //         int j = matrix[0].length-1;
    //         while(i<matrix.length && j>=0){
    //             if(matrix[i][j]==target)
    //                 return true;
    //             else if(matrix[i][j]>target)
    //                 j--;
    //             else
    //                 i++;
    //         }
    //         return false;
    // }
}