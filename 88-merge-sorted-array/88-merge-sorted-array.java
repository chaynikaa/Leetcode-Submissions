class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      
        int x = m-1;     
        int y = n-1;
        int k = m+n-1;   
      
        
        while(y>=0 && x>=0){        
            if(nums1[x]>=nums2[y]){
                nums1[k]=nums1[x];
                k--;
                x--;
            }else{
                nums1[k]=nums2[y];
                y--;
                k--;
            }
        }
        
          while(y>=0){
                nums1[k]=nums2[y];
                k--;
                y--;   
            } 
    }
}