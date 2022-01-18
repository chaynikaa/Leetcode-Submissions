class Solution {
    public int searchInsert(int[] nums, int target) {
        int lo=0;
        int hi=nums.length-1;
       int mid = lo+(hi-lo)/2;

        while(lo<=hi){
            if(nums[mid]==target){
                return mid;
            }
            
            else if(nums[mid]>target){
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
            mid = lo+(hi-lo)/2;
        }
        return lo;
        
    }
}