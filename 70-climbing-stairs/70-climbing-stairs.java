class Solution {
    public int climbStairs(int n) {
        if(n==1)
            return 1;
        int first=1,second=1,third,total=2;
        for(int i=2;i<n;i++){
            third=first+second;
            total=total+third;
            first=second;

            second=third;
        }
        return first+second;
    }
}