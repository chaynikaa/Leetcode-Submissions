class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            
            if(ch!='*')
                st.push(ch);
            else
                st.pop();
        }
        
        StringBuilder sb = new StringBuilder();
        while(st.size()>0)
            sb.append(st.pop());
        
        return sb.reverse().toString();
        
    }
}