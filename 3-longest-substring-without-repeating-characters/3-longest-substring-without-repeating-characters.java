class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        
        int left = 0;
        int right = 0;
        int len = 0;
        
        while(right<s.length()){
            if(map.containsKey(s.charAt(right))==true)
                left = Math.max(map.get(s.charAt(right))+1 , left);  //checking if it lies in the range or not
                
            map.put(s.charAt(right),right);
            len = Math.max(len,right-left+1);
            right++;
            }
       return len; 
    }
}