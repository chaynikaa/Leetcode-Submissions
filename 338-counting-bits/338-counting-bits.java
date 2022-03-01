class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];        
        for(int i=1;i<=n;i++){
            ans[i]=ans[i/2]+i%2;                    //even no. have same no. of set bits because of right shift by 1 which doesnt affect the ans because even no has 0 at the LSB. where as in odd no. the LSB is always 1.
        }
        return ans;
    }
}