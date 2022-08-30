class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map = new HashMap<>();
        
        if(s.length()!=t.length())
            return false;
        
        for(int i=0;i<s.length();i++){
            
            if(map.containsKey(s.charAt(i))){    //if found
                if(map.get(s.charAt(i)) != t.charAt(i))   //check the mapping is right or not
                    return false;
            }
            else if (map.containsValue(t.charAt(i)))   //check if it is mapped with other one
               return false;
               
               else
               map.put(s.charAt(i),t.charAt(i));   //put it in the map
            
        }
       return true; 
    }
}
               
               
