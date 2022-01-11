class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        for (int num : nums) {
            if (nums[Math.abs(num) - 1] < 0) { // seen before
                ans.add(Math.abs(num));
            }
            nums[Math.abs(num) - 1] *= -1;
        }

        return ans;
    }
}


// class Solution {
//     public List<Integer> findDuplicates(int[] nums) {
//         List<Integer> ans = new ArrayList<>();

//         for (int num : nums) {
//             nums[Math.abs(num) - 1] *= -1;
//         }

//         for (int num : nums) {
//             if (nums[Math.abs(num) - 1] > 0) {
//                 ans.add(Math.abs(num));
//                 nums[Math.abs(num) - 1] *= -1;  //prevent duplicates and making the indexes valid simulataneously
//             } 
//         }

//         return ans;
//     }
// }
// class Solution {
//     public List<Integer> findDuplicates(int[] nums) {
        
//         int[] arr = new int[nums.length];   //using array for doing hashing   
//         List<Integer>ans = new ArrayList<>();  //similar as car-pooling ques
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]==nums.length)
//                 arr[0]++;
//             else
//                 arr[nums[i]]++;
//         }
       
//         for(int i=1;i<arr.length;i++){
//             if(arr[i]>1)
//                 ans.add(i);
//         }
        
//         if(arr[0]>1)
//             ans.add(nums.length);
        
//         return ans;
//     }
// }