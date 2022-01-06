class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        int n = nums1.length;
        int m = nums2.length;
        int len=0;
        
        if(n>m)
            len=m;
        else
            len=n;
        
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
        
        int[] a = new int[k];
        for(int l=0;l<k;l++)
            a[l] = ans[l];
        return a;
    }
}