class Solution {
    public int[] twoSum(int[] nums, int target) {
     // int[] ans= new int[2];                             // n^2 approach
     // for(int i=0;i<nums.length;i++){                    // approach 2 - sort the array and use two pointer approach
     //     for(int j=0;j<nums.length;j++){
     //         if((nums[i]+nums[j]==target)&& (i!=j)){
     //            ans[0]=i;
     //             ans[1]=j;
     //             return ans;
     //         }       
     //      }
     //   }
     //  return ans;   
        
    int[] result = new int[2];                                     // 0(n) approach
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int i = 0; i < nums.length; i++) {
        if (map.containsKey(target - nums[i])) {
            result[1] = i;
            result[0] = map.get(target - nums[i]);
            return result;
        }
        map.put(nums[i], i);
    }
    return result;
  }
}
