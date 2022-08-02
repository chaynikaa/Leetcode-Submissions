class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        List<Integer> mat = new ArrayList<>();
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat.add(matrix[i][j]);
            }
        }
        Collections.sort(mat);
        return mat.get(k-1);
        
    }
}