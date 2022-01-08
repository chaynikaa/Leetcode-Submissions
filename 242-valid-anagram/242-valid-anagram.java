class Solution {
    public boolean isAnagram(String s, String t) {  //approach-1 sort two arrays and compare
                                                    // approach-2 given approach
        int[] arr = new int[27];                    //approach-3 hashing for unique codes
        
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