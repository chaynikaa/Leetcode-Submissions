class Solution {
    public int largestRectangleArea(int[] heights) {
       int[] nsr = nser(heights);
        
        for(int i=0;i<nsr.length;i++)
            System.out.println(nsr[i]);
       int[] nsl = nsel(heights);
       
       int omax=0;
        
        for(int i=0;i<heights.length;i++){
            int height = heights[i];
            int width = nsr[i]-nsl[i]-1;
            int area = height*width;
            omax = Math.max(omax,area);
        }
        return omax;   
    }
    
    public static int[] nser(int[] a){           //right boundary
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[a.length];
        Arrays.fill(ans,a.length);              //considering default right boundary to be length in right case
        
        for(int i=0;i<a.length;i++){
            while(st.size()>0 && a[i]<a[st.peek()]){   
                int idx = st.pop();
                ans[idx]=i;
            }
                st.push(i);
        }
        return ans;   
    }
    
        public static int[] nsel(int[] a){   //left boundary
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[a.length];
        Arrays.fill(ans,-1);                  //considering default left boundary to be -1 in left case
        
        for(int i=a.length-1;i>=0;i--){
            while(st.size()>0 && a[i]<a[st.peek()]){
                int idx = st.pop();
                ans[idx]=i;
            }
                st.push(i);
        }
        return ans;  
    }    
}