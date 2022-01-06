class Solution {
    public int longestConsecutive(int[] nums) {
        
        if(nums.length==0)           //edge case
            return 0;
        
        int max = Integer.MIN_VALUE;
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int n:nums){
            if(map.containsKey(n) == false){        //if it is a duplicate then ignore
                int sp = n;
                int ep = n;
                
                if(map.containsKey(n-1)==true){        //update start point
                    sp = sp - map.get(n-1);
                }
                
                if(map.containsKey(n+1)==true){       //update end point
                    ep = ep + map.get(n+1);
                }
                
                int newlen = ep-sp+1;               //find the new length
                
                map.put(sp,newlen);               //update the length of start point in the map
                map.put(ep,newlen);               //update the length of end point in the map
                
                if(sp!=n && ep!=n)                // if it is not the start point and not the end point      
                    map.put(n,1);                //length you can put any->doesnt matter
                
                max = Math.max(max,newlen);        //finding the max consequence
            }  
        }
    return max;
    }
}