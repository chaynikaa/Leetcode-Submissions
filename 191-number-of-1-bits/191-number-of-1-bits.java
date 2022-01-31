public class Solution {          //kernighans algorithm
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int ans = 0;
        while(n!=0){
            int mask = (n & -n);   //rightmost set bit
            n = n-mask;            //subtracting it
            ans++;
        }
      return ans;  
    }
}