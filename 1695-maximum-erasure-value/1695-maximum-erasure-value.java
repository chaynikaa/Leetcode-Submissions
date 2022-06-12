
class Solution {

    public int maximumUniqueSubarray(int[] nums) {
      HashSet<Integer> set = new HashSet<>();

        int sum = 0;
        int ans = 0;

        int left = 0;
        
        for(int right=0;right<nums.length;right++){
            
            while(set.contains(nums[right])==true){    //removing till we get all unique again
                sum = sum - nums[left];
                set.remove(nums[left]);
                left++;
            }
            sum = sum + nums[right];   
            set.add(nums[right]);
            ans = Math.max(ans,sum);
        }

        return ans;
    }
}