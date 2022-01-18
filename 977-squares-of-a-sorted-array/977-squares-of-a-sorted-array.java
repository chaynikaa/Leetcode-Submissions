class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int left = 0;
        int right = nums.length-1;
        
        for(int i=nums.length-1;i>=0;i--){
            int sq = 0;
            if(Math.abs(nums[left])<Math.abs(nums[right])){
                sq = nums[right];
                right--;
            } else {
                sq = nums[left];
                left++;
            }
           ans[i]=sq*sq;     
        }
        return ans;
    }
}