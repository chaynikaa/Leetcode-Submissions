// class Solution {                                           //APPROACH-1 SORTING nlogn
//     public int[] intersect(int[] nums1, int[] nums2) {
//         int len=0;
//         if(nums1.length>nums2.length)
//             len=nums2.length;
//         else
//             len=nums1.length;
        
//         int[] ans = new int[len];
    
//         Arrays.sort(nums1);
//         Arrays.sort(nums2);
        
//         int i=0,j=0,k=0;
//         while(i<nums1.length && j<nums2.length){
//             if(nums1[i]>nums2[j])
//                 j++;
//             else if(nums1[i]<nums2[j])
//                 i++;
//             else{
//                 ans[k++] = nums1[i];
//                 i++;j++;
//             }            
//         }
        
//         return Arrays.copyOfRange(ans,0,k);
//     }
// }
class Solution {                                         //APPROACH-2 0(n)
    public int[] intersect(int[] nums1, int[] nums2) {
        
        if(nums1.length>nums2.length)
            return intersect(nums2,nums1);
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int num : nums1){
            if(map.containsKey(num)==false)
                map.put(num,1);
            else{
                int count = map.get(num);
                count++;
                map.put(num,count);
            }
        }
        
        int k=0;
        int count;
        for(int n:nums2){
            count = 0;
             if(map.containsKey(n))
                  count = map.get(n);
            
            if(count>0){
                nums1[k++]=n;
                map.put(n,count-1);
            }
        }
        return Arrays.copyOfRange(nums1,0,k);
    }
}