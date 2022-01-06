// class Solution {
//     public int sumOfUnique(int[] nums) {                   //HashMap approach
//         int sum = 0 ;
//         HashMap<Integer,Integer> map = new HashMap<>();
        
//         for(int i=0;i<nums.length;i++){
//             if(map.containsKey(nums[i])==false){
//                 map.put(nums[i],1);
//             }
//             else{
//                 int count = map.get(nums[i]);
//                 count++;
//                 map.put(nums[i],count);
//             }
//         }
        
//         for(int key : map.keySet()){
//             if(map.get(key)==1)
//                 sum=sum+key;
//         }
//         return sum;
//     }
// }

class Solution {
    public int sumOfUnique(int[] nums) {    
        int sum = 0;
        int map[] = new int[101];       //same approach as that of car-pooling question
        
        for (int num : nums) {
            if (map[num] == 0) {
                sum += num; 
            } else if (map[num] == 1) {
                sum -= num;
            }
            map[num] += 1;
        }
        
        return sum;
    }
}