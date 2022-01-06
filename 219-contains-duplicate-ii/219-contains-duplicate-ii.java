class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            int n = nums[i];
            if(map.containsKey(n)==false)
                map.put(n,i);
            else{
                int index = map.get(n);
                int diff = Math.abs(index-i);
                if(diff<=k)
                    return true;
                else
                    map.put(n,i);
            }
        }
        return false;
        
    }
}