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
        
        int start = 0;
        int sum = 0;
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            sum = sum + nums[i];
            
            while(sum>=target){
                ans = Math.min(ans, i-start+1);
                sum = sum-nums[start++];
            }
        }
        
        if(ans == Integer.MAX_VALUE)
            return 0;
        
        return ans;
    }
}