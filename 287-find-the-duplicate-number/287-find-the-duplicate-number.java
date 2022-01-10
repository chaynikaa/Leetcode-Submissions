class Solution {
    
    //1- sort the array and then bring out the duplicate
    //2- using set. if the set already contains the element return that element
    
    public int findDuplicate(int[] nums) {       //Fluyd's algorithm
         int tortoise = nums[0];
        int hare = nums[0];
        
         do{
            tortoise = nums[tortoise];
            hare = nums[nums[hare]];
        }while(tortoise!=hare);
        
        tortoise = nums[0];
        
        while(tortoise!=hare){
            tortoise = nums[tortoise];
            hare = nums[hare];
        }
        
        return hare;
    }
}