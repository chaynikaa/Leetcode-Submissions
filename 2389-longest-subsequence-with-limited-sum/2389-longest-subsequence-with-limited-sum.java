class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        
        int[]ans = new int[queries.length];
        Arrays.sort(nums);

        for(int i=0;i<queries.length;i++){
            int sum = 0;
            int put = 0;
            int target = queries[i];
            
            for(int j=0;j<nums.length;j++){
                sum = sum + nums[j];
                if(sum  > target)
                    break;
                put++;
            
            }
              ans[i]=put;          
        }
       return ans; 
    }
}