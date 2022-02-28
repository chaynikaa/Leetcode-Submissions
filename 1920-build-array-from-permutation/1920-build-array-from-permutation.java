class Solution {
    public int[] buildArray(int[] nums) {
        
      int[] ans = new int[nums.length]; 
      for(int j=0,i=0;i<nums.length;i++,j++){
         int x = nums[i];
         ans[j]=nums[x];
     }
        return ans;
        
    }
}