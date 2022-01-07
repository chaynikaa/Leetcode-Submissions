class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
         Set<List<Integer>> res = new HashSet<>();  
         Set<Integer> dup = new HashSet<>();

        HashMap<Integer,Integer> map = new HashMap<>();   //putting it in Hash Map
        
        for(int i=0;i<nums.length;i++){
            if(dup.add(nums[i])==true){
                for(int j=i+1;j<nums.length;j++){
                    int target = -(nums[i]+nums[j]);
                    
                    if(map.containsKey(target) && map.get(target)==i){
                        List<Integer> ans = Arrays.asList(nums[i],nums[j],target);
                        Collections.sort(ans);
                        res.add(ans);
                    }
                    map.put(nums[j],i);
                }
            }
        }
      return new ArrayList(res);  
    }
}