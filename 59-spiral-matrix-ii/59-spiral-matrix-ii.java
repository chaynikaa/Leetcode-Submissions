class Solution {
    public int[][] generateMatrix(int n) {
        
        int[][]ans = new int[n][n];
        int put = 1;

        for(int layer=0;layer<(n+1)/2;layer++){
            
            for(int i=layer;i<n-layer;i++){
                ans[layer][i]=put++;
            }
            
            for(int i=layer+1;i<n-layer;i++){
                ans[i][n-layer-1]=put++;
            }
            
            for(int i=layer+1;i<n-layer;i++){
                ans[n-layer-1][n-i-1]=put++;
            }
            
            for(int i=layer+1;i<n-layer-1;i++){
                ans[n-i-1][layer]=put++;
            }
            
        }
      return ans;  
        
    }
}