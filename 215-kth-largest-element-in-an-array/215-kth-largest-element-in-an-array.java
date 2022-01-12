class Solution {
    public int findKthLargest(int[] nums, int k) {
        int i;
        Arrays.sort(nums);
        for(i=0;i<nums.length-k;i++);
        
        return nums[i];
        
    }
}