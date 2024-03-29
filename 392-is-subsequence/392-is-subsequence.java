class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0)
            return true;
        
        if(s.length()>t.length())
            return false;
        
        int j = 0;
        
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            
            if(ch == s.charAt(j))
                j++;
            
            if(j==s.length())
                return true;
        }
        
        return false;
    }
}