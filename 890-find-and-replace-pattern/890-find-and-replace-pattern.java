class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        
        List<String> ans  = new ArrayList<>();
        
        for(int i=0;i<words.length;i++){
            String word = words[i];
            if(match(word,pattern))
                ans.add(word);
        }
       return ans; 
    }
    
    public boolean match(String word, String pattern){
        HashMap<Character, Character> m1 = new HashMap<>();
        HashMap<Character, Character> m2 = new HashMap<>();
        
        for(int i=0;i<word.length();i++){
            char w = word.charAt(i);
            char p = pattern.charAt(i);
            
            if(m1.containsKey(w)==false)
                m1.put(w,p);
            
            if(m2.containsKey(p)==false)
                m2.put(p,w);
            
            if(m1.get(w) !=p || m2.get(p)!=w)
                return false;
        }
        return true;
    }
}