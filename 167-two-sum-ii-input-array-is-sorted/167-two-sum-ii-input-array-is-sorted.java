class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int []ans = new int[2];
        int ri = numbers.length-1;
        int li = 0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[li]+numbers[ri]==target){
                ans[0]=li+1;
                ans[1]=ri+1;
            }
            else if (numbers[li]+numbers[ri]>target)
                ri--;
            else
                li++;
                
        }
        return ans;
    }
}


// class Solution {
//     public int[] twoSum(int[] numbers, int target) {
//         int lo = 1;
//         int hi = numbers.length;
//         int []ans = new int[2];
//         while(lo<=hi){
//             int mid = lo + (hi-lo)/2;
//             if(lo+mid==target){
//                 ans[0]=lo;
//                 ans[1]=mid;
//             }
//             else if((lo+mid)>target)
//                 hi=mid-1;
//             else
//                 lo=mid+1;
//         }
        
//         return ans;
//     }
// }