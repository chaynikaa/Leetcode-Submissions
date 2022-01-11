class Solution {
    public int firstMissingPositive(int[] nums) {
        int flag = 0;
        for(int num:nums){        //if 1 is not present that means 1 is the smallest missing +ve no.
            if(num==1)
                flag=1;
        }
        
        if(flag==0)
            return 1;
//--------------------------------------(checking when 1 is the ans case)------------------------------//
        
        for(int i=0;i<nums.length;i++){      //marking all elements exceeding the length and-ve ones as 1
            if((nums[i]>(nums.length)) || nums[i]<=0 )
                nums[i] = 1;
        }
        
        for(int i=0;i<nums.length;i++){      
            int n = Math.abs(nums[i]);
            
            if(n==nums.length)
                nums[0] = -Math.abs(nums[0]);  //doing math .abs for the case of duplicates
            else
                nums[n] = -Math.abs(nums[n]);
        }
        

        for(int i=1;i<nums.length;i++){
            if(nums[i]>0)
                return i;
        }
                    
        
        if(nums[0]>0)
            return nums.length;
        

        
        return nums.length+1;
    }
}