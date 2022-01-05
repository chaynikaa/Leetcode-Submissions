class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> path = new ArrayList<>();
        func(0 , s , path , res);
        
        return res;
        
    }
    
    void func(int index, String s, List<String>path, List<List<String>> res){
        if(index == s.length()){          
            res.add(new ArrayList<>(path));      //got one ans
            return;
        }
        
        for(int i=index;i<s.length();i++){
            if(isPalindrome(s,index,i)){
                path.add(s.substring(index,i+1));     //storing the first palindromic string 
                func(i+1,s,path,res);                 //calling the func for the rest of the string
                path.remove(path.size()-1);          //removing while backtracking
            }
        }
    }
    
    boolean isPalindrome(String s, int start, int end){       //func to check palindrome
        while(start<end){
            if(s.charAt(start++) != s.charAt(end--))
                return false;
        }
        return true;
    }
}