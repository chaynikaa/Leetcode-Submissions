class Solution {
    public List<String> summaryRanges(int[] nums) {
        
        List<String> ans = new ArrayList<>();
        if(nums.length==0)    //no range at all
            return ans;
        
        StringBuilder sb = new StringBuilder();
     
        int i=0;
        while(i<nums.length){
            int first = nums[i]; 
            sb.append(first);   //adding the first to the string builder
            i++;
            while(i<nums.length && nums[i]==1+nums[i-1]){   //if the sequence exists
                i++;
            }
            if(first!=nums[i-1])    //checking if the first and last are same or not
                sb.append("->").append(nums[i-1]);
            
            ans.add(sb.toString()); //adding to the final ans
            sb.setLength(0);   //setting the string builder to zero again
        }
      return ans;  
    }
}


