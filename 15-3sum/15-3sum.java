class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();
        Set<Integer> dups = new HashSet<>();
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; ++i)
            if (dups.add(nums[i])) {
                for (int j = i + 1; j < nums.length; ++j) {
                    int complement = -nums[i] - nums[j];
                    if (seen.containsKey(complement) && seen.get(complement) == i) {
                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], complement);
                        Collections.sort(triplet);
                        res.add(triplet);
                    }
                    seen.put(nums[j], i);
                }
            }
        return new ArrayList(res);
    }
}

// class Solution {            //TLE 
//     public List<List<Integer>> threeSum(int[] nums) {
         
//         Set<List<Integer>> res = new HashSet<>();  
        
//         HashMap<Integer,Integer> map = new HashMap<>(); 
        
//         for(int i=0;i<nums.length;i++){
//             int put = map.getOrDefault(nums[i],0);
//             put++;
//             map.put(nums[i],put);   
//         }
        
//         for(int i=0;i<nums.length;i++){
//             int count = map.get(nums[i]);
//             count--;
//             if(count==0)
//                 map.remove(nums[i]);
//             else
//                 map.put(nums[i],count);
//                     //REMOVING DUPLICATES
//                 for(int j=i+1;j<nums.length;j++){
//                   int co = map.get(nums[j]);
//                     co--;
//                      if(co==0)
//                             map.remove(nums[j]);
//                     else
//                             map.put(nums[j],co);
                                
                    
//                     int target = -(nums[i]+nums[j]);
                    
//                     if(map.containsKey(target)){
//                         List<Integer> ans = Arrays.asList(nums[i],nums[j],target);
//                         Collections.sort(ans);
//                         res.add(ans);
//                     }
//                  int s = map.getOrDefault(nums[j], 0);
//                 map.put(nums[j], s + 1);
//                 }
//             int p = map.getOrDefault(nums[i], 0);
//              map.put(nums[i], p + 1);
//         }
        
//       return new ArrayList(res);  
//     }
// }