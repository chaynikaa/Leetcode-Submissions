class Solution {
    public int removeDuplicates(int[] nums) {
        int ans = 1;
        int count = 1;
        int prev = nums [0];
        int k=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=prev){
                prev = nums[i];
                count = 1;
                nums[k]=nums[i];
                k++;
                ans++;
            } else {
                count++;
                if(count<=2){
                    nums[k]=nums[i];
                    k++;
                    ans++;
                }
            }
            
        }
      return ans;  
    }
}

