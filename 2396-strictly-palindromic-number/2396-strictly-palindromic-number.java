class Solution {
    public boolean isStrictlyPalindromic(int n) {
        
        
        for(int i=1;i<=n-2;i++){
            
            if(check(Integer.toString(n,i))==false)
                return false;
            
        }
        
        return true;
    }
    
    public boolean check(String s){
        int li = 0;
        int ri = s.length()-1;
        
        while(li<ri){
            if(s.charAt(li)!=s.charAt(ri))
                return false;
            
            li++;
            ri--;
        }
        
        return true;
    }
}