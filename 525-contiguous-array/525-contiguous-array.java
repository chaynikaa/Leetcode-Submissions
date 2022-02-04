class Solution {
    public int findMaxLength(int[] nums) {
        int count = 0;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int sum = 0;
    
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]==0)           //considering all 0s to be -1s
                sum += -1;
            else 
                sum += 1;
            
            if(map.containsKey(sum)){
                int idx = map.get(sum);
                int length = i-idx;
                count = Math.max(count,length);
            }else{
                map.put(sum,i);
            }             
        }
        
        return count;
    }
}