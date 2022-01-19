class Solution {
    public String reverseWords(String s) {
        
        String words[] = s.split(" ");
        StringBuilder ans = new StringBuilder();
        for(String word:words){
            ans.append(reverse(word) + " ");
        }
        return ans.toString().trim();

    }
    
    public String reverse(String st){
        char[] ans = st.toCharArray();
        int li = 0;
        int ri = st.length()-1;
        while(li<=ri){
            char temp = ans[li];
            ans[li] = ans[ri];
            ans[ri]=temp;
            
            ri--;
            li++;
        }
        return new String(ans);
    }
}
