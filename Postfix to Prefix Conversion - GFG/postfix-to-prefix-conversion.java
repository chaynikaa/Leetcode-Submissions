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
            String ans = obj.postToPre(s);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static String postToPre(String post_exp) {
        // code here
        Stack<String> st = new Stack<>();
        
        for(int i=0;i<post_exp.length();i++){
            char ch = post_exp.charAt(i);
            
            if(Character.isLetterOrDigit(ch))
            st.push(ch + "");
            else {
                String a = st.pop();
                String b = st.pop();
                
                st.push( ch + b + a);
            }
        }
        return st.peek();
    }
}
