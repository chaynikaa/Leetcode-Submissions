class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        if(s1.length()>s2.length())   //if length is greater it cant be a substring
            return false;
        
        int[] map1 = new int[26];
        int[] map2 = new int[26];
        
        for(int i=0;i<s1.length();i++){   //freq array of both the strings
            map1[s1.charAt(i)-'a']++;
            map2[s2.charAt(i)-'a']++;  
        }
        
        for(int i=0;i<s2.length()-s1.length();i++){
            if(matches(map1,map2))                  //if is anagram. return true.
                return true;
            map2[s2.charAt(i+s1.length())-'a']++;   //else update the next char
            map2[s2.charAt(i)-'a']--;               //and remove the starting char
        }
       return matches(map1,map2);                   //check for last pair
    }   
    
    public boolean matches(int[]map1,int[]map2){   //is anagram function
        for(int i=0;i<26;i++){    
            if(map1[i]!=map2[i])
                return false;
        }
        return true;
    }
}