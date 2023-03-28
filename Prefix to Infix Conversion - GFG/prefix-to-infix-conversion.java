//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            sc.nextLine();
            String s = sc.next();
            Solution obj = new Solution();
            String ans = obj.preToInfix(s);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static String preToInfix(String pre_exp) { 
        // code here  
        Stack<String> st = new Stack<>();                  //reverse , operator 1 + operand + operator 2
        
        for(int i=pre_exp.length()-1;i>=0;i--){
            char c = pre_exp.charAt(i);
            if(Character.isLetterOrDigit(c))
            st.push(c+ "");
            else {
                String a = st.pop();
                String b = st.pop();
                st.push("("+ a + c + b + ")");
            }
        }
        return st.peek();
    }
}
