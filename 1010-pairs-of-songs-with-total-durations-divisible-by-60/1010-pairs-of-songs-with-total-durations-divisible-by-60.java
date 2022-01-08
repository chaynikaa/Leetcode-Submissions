class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int rem[]=new int[60];
        int count = 0;
        
        for(int t:time){
            if(t%60 == 0){
                count = count + rem[0];        //handling the case when no. is divisible by 60
            }else{
                count = count + rem[60 - t%60];  //checking for the rem if present or not
            }
            rem[t%60]++;                        //updating the rem value in the array
        }
        return count;                      
    }
}