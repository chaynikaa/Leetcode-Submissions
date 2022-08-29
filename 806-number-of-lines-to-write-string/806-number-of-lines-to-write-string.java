class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        
        int sum = 0;
        int line = 1;
        
        int[] ans = new int[2];        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            
            sum = sum + widths[ch - 'a'];
            
            if(sum>100){
                line++;
                sum = widths[ch - 'a'];
            }   
        }
       
        ans[0]=line;
        ans[1]=sum;
        
        return ans;
    }
}