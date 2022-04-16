// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         Set<List<Integer>> res = new HashSet<>();
//         Set<Integer> dups = new HashSet<>();
//         Map<Integer, Integer> seen = new HashMap<>();
//         for (int i = 0; i < nums.length; ++i)
//             if (dups.add(nums[i])) {
//                 for (int j = i + 1; j < nums.length; ++j) {
//                     int complement = -nums[i] - nums[j];
//                     if (seen.containsKey(complement) && seen.get(complement) == i) {
//                         List<Integer> triplet = Arrays.asList(nums[i], nums[j], complement);
//                         Collections.sort(triplet);
//                         res.add(triplet);
//                     }
//                     seen.put(nums[j], i);
//                 }
//             }
//         return new ArrayList(res);
//     }
// }

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);                              //sort the array
        List<List<Integer>> res = new ArrayList<>();    //ans
        
        for(int i=0;i<nums.length-2;i++){              //using the method b+c = -a
                                                       //nums[i] is a in this. so iterating it to the third last
            if(i==0 || (nums[i]!=nums[i-1])){          //to avoid having similar a's [-2,-2,-2,0,1]
                int lo = i+1;                          //initializing lo to next to a
                int hi = nums.length-1;
                int sum = 0-nums[i];                   //making it 2 sum in sorted array problem
            
            while(lo<hi){                      
                if(nums[lo]+nums[hi]==sum){
                    res.add(Arrays.asList(nums[i],nums[lo],nums[hi]));
                
                while(lo<hi && nums[lo]==nums[lo+1])
                    lo++;
                while(lo<hi && nums[hi]==nums[hi-1])
                    hi--;
                
                  lo++;hi--;                    
             }

         else if (nums[hi]+nums[lo]<sum)
                lo++;
          else
                hi--;                
        }
      }
    }
        return res;
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