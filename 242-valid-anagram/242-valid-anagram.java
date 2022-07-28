class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length()!=t.length())
            return false;
        
        int[] check = new int[27];
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            check[ch - 'a'] ++;
        }
        
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            check[ch - 'a']--;
        }
        
        for(int i=0;i<27;i++){
            if (check[i]!=0)
                return false;
        }
        return true;
    }
}