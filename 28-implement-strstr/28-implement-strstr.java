class Solution {
    public int strStr(String haystack, String needle) {
        
        if(needle.length()==0)
            return 0;
        
        if(needle.length()>haystack.length())
            return -1;
        
        for(int i=0;i<haystack.length() && (haystack.length()>=(i+needle.length())); i++){
            if(haystack.charAt(i)==needle.charAt(0) && (haystack.substring(i,i+needle.length()).equals(needle)))
                return i;
        } 
        
        return -1;
    }
}


// class Solution {
//     public int strStr(String haystack, String needle) {
//         int ans = haystack.indexOf(needle);
        
//         return ans;
        
//     }
// }