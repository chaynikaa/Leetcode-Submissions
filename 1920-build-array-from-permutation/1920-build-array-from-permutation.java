// class Solution {
//     public int[] buildArray(int[] nums) {
        
//       int[] ans = new int[nums.length]; 
//       for(int j=0,i=0;i<nums.length;i++,j++){
//          int x = nums[i];
//          ans[j]=nums[x];
//      }
//         return ans;
        
//     }
// }

class Solution {
  public int[] buildArray(int[] nums) {
    int n = nums.length;

    for (int i = 0; i < n; i++)
      nums[i] = nums[i] + n * (nums[nums[i]] % n);

    for (int i = 0; i < n; i++)
      nums[i] /= n;

    return nums;
  }
}