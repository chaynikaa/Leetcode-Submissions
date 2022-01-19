class Solution {
    public void reverse(int[] nums, int i , int j){  //o(n) time and o(1) spcae
        int li = i;
        int ri = j;
        
            while(li<ri){
                int temp = nums[li];
                nums[li]=nums[ri];
                nums[ri]=temp;
                li++;
                ri--;      
            }
    }
    
    
    
    public void rotate(int[] nums, int k) 
    { 
        k=k%nums.length;

       reverse(nums,0,nums.length-k-1);
       reverse(nums,nums.length-k,nums.length-1);
       reverse(nums,0,nums.length-1);        
    }
}


// class Solution {        O(n) space and time
//   public void rotate(int[] nums, int k) {
//     int[] a = new int[nums.length];
//     for (int i = 0; i < nums.length; i++) {
//       a[(i + k) % nums.length] = nums[i];
//     }
//     for (int i = 0; i < nums.length; i++) {
//       nums[i] = a[i];
//     }
//   }
// }