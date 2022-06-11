class Solution {
    public int longestSubstring(String s, int k) {
        
        int[] freq = new int[26];
        
        int ans = 0;
        
        for(int start = 0; start<s.length(); start++){
            
            Arrays.fill(freq,0);
            
            for(int end = start; end<s.length();end++){
                freq[s.charAt(end)-'a']++;
                
                if(check(s,start,end,k,freq))
                    ans = Math.max(ans, end-start+1);
            }
            
        }
        
        return ans;
        
    }
    
    public boolean check(String s, int start, int end, int k, int[]freq){
        
        for(int i=0;i<freq.length;i++){
            if(freq[i]<k && freq[i]!=0)
                return false;
        }
        
        return true;
    }
}