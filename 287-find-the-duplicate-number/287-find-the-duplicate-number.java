    
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

class Solution {                                //array ad hash nap- 0(n) 0(1) approach
    public int findDuplicate(int[] nums) {
        while (nums[0] != nums[nums[0]]) {
            int nxt = nums[nums[0]];
            nums[nums[0]] = nums[0];
            nums[0] = nxt;
        }
        return nums[0];
    }
}


