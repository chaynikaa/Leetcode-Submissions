class Solution {
    public char findTheDifference(String s, String t) {   
        int sum1 = 0;         
        int sum2 = 0;
        
        for(int i=0;i<s.length();i++)
            sum1 = sum1 + (int)s.charAt(i);
        for(int j=0;j<t.length();j++)
            sum2 = sum2 + (int)t.charAt(j);
        int diff = sum2-sum1;           //USING ASCII VALUES 
        
        return (char)diff;     
    }
}