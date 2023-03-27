//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            System.out.println(
                new Solution().infixToPostfix(br.readLine().trim()));
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to convert an infix expression to a postfix expression.
    public static int prec(Character c){
        if(c=='-' || c=='+')
        return 1;
        
        else if(c=='/' || c=='*')
        return 2;
        
        else if(c=='^')
        return 3;
        
        else 
        return -1;
        
        
    }
    
    public static String infixToPostfix(String exp) {
        // Your code here
        
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        
        for(int i=0;i<exp.length();i++){
            char ch = exp.charAt(i);
            
            if(Character.isLetterOrDigit(ch))
            sb.append(ch);
            
            else if(ch=='(')
            st.push(ch);
            
            else if(ch==')'){
                while(st.size()>0 && st.peek()!='(')
                sb.append(st.pop());
                
                st.pop();
            } else {
                while(st.size()>0 && prec(ch)<=prec(st.peek()))
                sb.append(st.pop());
                
                st.push(ch);

            }
        }
        
        while(st.size()>0){
            sb.append(st.pop());
        }
        
        return sb.toString();
    }
}