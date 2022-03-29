    
    //1- sort the array and then bring out the duplicate
    //2- using set. if the set already contains the element return that element
    
    
//         public int findDuplicate(int[] nums) {       //Fluyd's algorithm  0(n)
//          int tortoise = nums[0];                    
//         int hare = nums[0];
        
//          do{
//             tortoise = nums[tortoise];
//             hare = nums[nums[hare]];
//         }while(tortoise!=hare);
        
//         tortoise = nums[0];
        
//         while(tortoise!=hare){
//             tortoise = nums[tortoise];
//             hare = nums[hare];
//         }
        
//         return hare;
//     }

// class Solution {                                //array ad hash nap- 0(n) 0(1) approach
//     public int findDuplicate(int[] nums) {
//         while (nums[0] != nums[nums[0]]) {
//             int nxt = nums[nums[0]];
//             nums[nums[0]] = nums[0];
//             nums[0] = nxt;
//         }
//         return nums[0];
//     }
// }


class Solution {            //binary search  0(nlogn) 0(1) space
    
    public int findDuplicate(int[] nums) {
        // 'low' and 'high' represent the range of values of the target        
        int low = 1, high = nums.length - 1;
        int duplicate = -1;
        
        while (low <= high) {
            int cur = (low + high) / 2;

            // Count how many numbers in 'nums' are less than or equal to 'cur'
            int count = 0;
            for (int num : nums) {
                if (num <= cur)
                    count++;
            }
            
            if (count > cur) {    //if a number is repeated then on counting it must hae 1 more than it should actually have
                duplicate = cur;
                high = cur - 1;
            } else {
                low = cur + 1;
            }
        }
        return duplicate;
    }
}

