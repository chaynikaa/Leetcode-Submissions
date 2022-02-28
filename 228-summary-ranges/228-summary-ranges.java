class Solution {
    public List<String> summaryRanges(int[] nums) {
        
        List<String> ans = new ArrayList<>();
        if(nums.length==0)
            return ans;
        
        StringBuilder sb = new StringBuilder();
     
        int i=0;
        while(i<nums.length){
            int first = nums[i];
            sb.append(first);
            i++;
            while(i<nums.length && nums[i]==1+nums[i-1]){
                i++;
            }
            if(first!=nums[i-1])
                sb.append("->").append(nums[i-1]);
            
            ans.add(sb.toString());
            sb.setLength(0);
        }
      return ans;  
    }
}


