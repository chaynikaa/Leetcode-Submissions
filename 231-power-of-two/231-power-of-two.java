// class Solution {
//     public boolean isPowerOfTwo(int n) {
        
//         if(n<=0){
//             return false;
//         }
        
//         int ans = (n) & (n-1);
//         if(ans==0)
//             return true;
//         else
//            return false;
//     }
// }

class Solution {
    public boolean isPowerOfTwo(int n) {

        while(n>1){
            if((n%2!=0) && n!=1)
                return false;
            else
                n=n/2;
        }
        
        if(n==1)
            return true;
        else
            return false;
    }
}