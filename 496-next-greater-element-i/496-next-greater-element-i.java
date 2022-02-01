class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        int[] temp = new int[nums2.length];
        temp = nger(nums2);
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    ans[i]=temp[j];
                }
            }
        }
      return ans;  
    }
    
    public int[] nger(int[]arr){
        Stack<Integer> st = new Stack<>();
        int[]ans = new int[arr.length];
        Arrays.fill(ans,-1);
        for(int i=0;i<arr.length;i++){
            while(st.size()!=0 && arr[i]>arr[st.peek()]){
                int idx = st.pop();
                ans[idx] = arr[i];
            }
            st.push(i);
        }
        
        return ans;
    }
}