class Solution {
    //tc:o(n*l^2)->l= length of individual word , n length of words 
    //sc:o(n)->n length of words
        
    public int longestStrChain(String[] words) {
        Arrays.sort(words,(a,b)->a.length()-b.length());
        int ans = Integer.MIN_VALUE;
        Map<String,Integer>dp = new HashMap<>();
        for(String word:words){
             int lsc = Integer.MIN_VALUE;
            for(int i =0;i<word.length();i++){
                String pre = word.substring(0,i)+word.substring(i+1,word.length());
                lsc = Math.max(lsc,dp.getOrDefault(pre,0)+1);
            }
            dp.put(word,lsc);
            ans = Math.max(lsc,ans);
        }
        return ans;
    }
}