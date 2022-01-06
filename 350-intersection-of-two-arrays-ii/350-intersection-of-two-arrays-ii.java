class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int len=0;
        if(nums1.length>nums2.length)
            len=nums2.length;
        else
            len=nums1.length;
        
        int[] ans = new int[len];
    
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int i=0,j=0,k=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]>nums2[j])
                j++;
            else if(nums1[i]<nums2[j])
                i++;
            else{
                ans[k++] = nums1[i];
                i++;j++;
            }            
        }
        
//         int[] a = new int[k];
//         for(int l=0;l<k;l++)
//             a[l] = ans[l];
        
        return Arrays.copyOfRange(ans,0,k);
    }
}