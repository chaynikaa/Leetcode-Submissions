// class Solution {
//     public boolean isSubsequence(String s, String t) {
        
//         if(s.length()==0)
//             return true;
        
//         if(s.length()>t.length())
//             return false;
        
//         int j=0;
        
//         for(int i=0;i<t.length();i++){
//             char ch = s.charAt(j);
            
//             if(t.charAt(i)==ch){
//                 j++;
//             }
            
//             if(j==s.length())
//             return true;
            
//         }
//             return false;
//     }
// }


class Solution {
    public boolean isSubsequence(String s, String t) {
        
        if(s.length()==0)
            return true;
        
    
        return check(s,t,0,0);
    }
    
    public boolean check(String s, String t, int m, int n){
        if(m==s.length())
            return true;
        
        if(m<s.length() && n==t.length()) 
            return false;
        
        if(s.charAt(m)==t.charAt(n)){
            return check(s,t,m+1,n+1);
        }
        
        else{
            return check(s,t,m,n+1);
        }
    }
}

