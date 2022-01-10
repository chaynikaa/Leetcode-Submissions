class Solution {
    public void nextPermutation(int[] nums) {
        
        if(nums.length<=1)
            return;
        
        int i = nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1])
            i--;                             //first lower value from the last -> idx-1

        if(i>=0){
            int j = nums.length-1;
            while(nums[j]<=nums[i])
                j--;               //got the second index. first element from the last which is grter than index 1
      //swapping 
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        }
     reverse(nums,i+1);
    }
    
    public void reverse(int[]nums, int start){
        int i = start;
        int j = nums.length-1;
        
        while(i<j){
            int temp = nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
}