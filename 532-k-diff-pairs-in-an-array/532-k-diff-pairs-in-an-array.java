class Solution {
    public int findPairs(int[] nums, int k) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        
        for(int key: map.keySet()){
            if(k==0){
                if(map.get(key)>=2)
                    ans++;
            } else {
                int diff = key+k;
                if(map.containsKey(diff))
                    ans++;
                int dif = key-k;
                if(map.containsKey(dif))
                    ans++;
            }
        }
        
        if(k==0)
            return ans;
        
        else
            return ans/2;
        
    }
}