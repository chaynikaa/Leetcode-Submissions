// class Solution {
//     public int minSubArrayLen(int target, int[] nums) {   //TLE 
        
//         int ans = Integer.MAX_VALUE;
        
//         for(int i=0;i<nums.length;i++){            
//             for(int j=i;j<nums.length;j++){
//                 int sum = 0;
//                 for(int k=i;k<=j;k++)
//                   sum = sum + nums[k];
                
//                 if(sum>=target){
//                     ans = Math.min(ans, (j-i+1) );
//                     break;
//                 }
//             }
//         }
//         if(ans == Integer.MAX_VALUE)
//             return 0;
//         return ans;
//     }
// }


class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int ans = Integer.MAX_VALUE;
        
        int[] sum = new int[nums.length];
        
        sum[0]  = nums[0];
        
        for(int i=1;i<nums.length;i++)
            sum[i]  = sum[i-1] + nums[i];
        
        for(int i=0;i<nums.length;i++){            
            for(int j=i;j<nums.length;j++){
                int check = sum[j] - sum[i] + nums[i];                
                if(check>=target){
                    ans = Math.min(ans, (j-i+1) );
                    break;
                }
            }
        }
        if(ans == Integer.MAX_VALUE)
            return 0;
        return ans;
    }
}