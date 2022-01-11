class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        List<Integer> ans = new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
            int n = Math.abs(nums[i]);
            if(n == nums.length)
                nums[0] = -Math.abs(nums[0]);
            else
                nums[n] = -Math.abs(nums[n]);
        }
        
    
        
        for(int i=1;i<nums.length;i++){
            if(nums[i]>0)
                ans.add(i);
        }
        
        if(nums[0]>0)
            ans.add(nums.length);
        
        return ans;
        
    }
}