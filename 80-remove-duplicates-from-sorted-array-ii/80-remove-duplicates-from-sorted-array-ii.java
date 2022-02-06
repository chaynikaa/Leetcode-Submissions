class Solution {
    public int removeDuplicates(int[] nums) {
        int ans = 1;
        int count = 1;
        int prev = nums [0];
        int k=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=prev){
                prev = nums[i];
                count = 1;
                nums[k]=nums[i];
                k++;
                ans++;
            } else {
                count++;
                if(count<=2){
                    nums[k]=nums[i];
                    k++;
                    ans++;
                }
            }
            
        }
      return ans;  
    }
}




// class Solution {
//     public int removeDuplicates(int[] nums) {
//         int prev = nums[0];
//         int occur = 1;
//         int res = 1;
//         for(int i=1, k=1; i<nums.length; i++) {
//             int num = nums[i];
//             if(num != prev) {
//                 prev = num;
//                 occur = 1;
//                 nums[k++] = prev;
//                 res++;
//             } else {
//                 occur++;
//                 if(occur <= 2) {
//                     nums[k++] = prev;
//                     res++;
//                 }
//             }
//         }
        
//         return res;
//     }
// }