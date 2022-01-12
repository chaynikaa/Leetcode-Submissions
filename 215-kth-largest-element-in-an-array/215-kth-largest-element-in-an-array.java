class Solution {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<k;i++)
            pq.add(nums[i]);
        
        for(int i=k;i<nums.length;i++){
            if(nums[i]>pq.peek()){
                pq.remove();
                pq.add(nums[i]);
            }
        }
        
        return pq.peek();
    }
}

// class Solution {                                  //0(nlogn)
//     public int findKthLargest(int[] nums, int k) {
//         int i;
//         Arrays.sort(nums);
//         for(i=0;i<nums.length-k;i++);
        
//         return nums[i];
        
//     }
// }