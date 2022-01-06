class Solution {
    public int longestConsecutive(int[] nums) {
        
        if(nums.length==0)
            return 0;
        
        int max = Integer.MIN_VALUE;
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int n:nums){
            if(map.containsKey(n) == false){
                int sp = n;
                int ep = n;
                
                if(map.containsKey(n-1)==true){
                    sp = sp - map.get(n-1);
                }
                
                if(map.containsKey(n+1)==true){
                    ep = ep + map.get(n+1);
                }
                
                int newlen = ep-sp+1;
                
                map.put(sp,newlen);
                map.put(ep,newlen);
                
                if(sp!=n && ep!=n)
                    map.put(n,1);
                
                max = Math.max(max,newlen);
            }  
        }
    return max;
    }
}