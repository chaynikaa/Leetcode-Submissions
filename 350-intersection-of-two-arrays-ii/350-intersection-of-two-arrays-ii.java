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
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<nums1.length;i++){
            map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
        }
        
        int k=0;
        for(int n:nums2){
            int count = map.getOrDefault(n,0);
            if(count>0){
                nums1[k++]=n;
                map.put(n,count-1);
            }
        }
        return Arrays.copyOfRange(nums1,0,k);
    }
}