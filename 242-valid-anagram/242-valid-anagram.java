class Solution {
    public boolean isAnagram(String s, String t) {
        
        int[] arr = new int[27];
        
        if(s.length()!=t.length())
            return false;
        
        for(char ch:s.toCharArray()){
            arr[ch-'a']+=1;
        }
        
        for(char c:t.toCharArray()){
            if(arr[c-'a']==0)
                return false;
            
            arr[c-'a']--;
        }
      return true;  
    }
}