class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        int[] wealth= new int[accounts.length];
        for(int i=0;i<accounts.length;i++){
            for(int j=0;j<accounts[0].length;j++){
                wealth[i]=wealth[i]+accounts[i][j];
                
                }
            if (wealth[i]>max){
                    max=wealth[i];
            }
        }
        
        return max;
        
    }
}