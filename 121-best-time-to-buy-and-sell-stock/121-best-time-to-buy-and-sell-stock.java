class Solution {
    public int maxProfit(int[] prices) {  
        
        int max=0;
        int min=prices[0];   //keeping the min at 0 index
        
        for(int i=1;i<prices.length;i++){
            
            if(prices[i]<min)         //updating the min while traversing
                min = prices[i];
            
            
            int diff = prices[i]-min;   //diff
            
            max = Math.max(max,diff);   //updating max
            
        }
        return max;
    }
}

