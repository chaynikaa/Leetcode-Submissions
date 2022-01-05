class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int count=0;
        
        Map<Integer,Integer> map = new HashMap();
        for(int i=0;i<time.length;i++){
            int t=time[i];
            
            if(t%60==0)
                count = count + map.getOrDefault(0,0);
            else
                count = count + map.getOrDefault(60 - t%60,0);
            
          map.put(t%60, map.getOrDefault(t%60,0)+1);
        }
        return count;
    }
}