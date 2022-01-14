class Solution {
    public double myPow(double x, int n) {
        double ans = 1.0;
        
        long temp = n;
        if(temp<0)
            temp = -1*temp;
       
        while(temp>0){
            if(temp%2==1){
                ans = ans * x;
                temp--;
            } else {
                x = x*x;
                temp = temp/2;
            }
        }
        
        if(n<0)
            return (double)(1.0)/(double)(ans);
        
        return ans;
    }
}

// class Solution {
//     public double myPow(double x, int n) {
        
//       if(n==0){
//           return 1;
//       }        
//         double temp = myPow(x,n/2);
//         if(n%2==0){
//             return temp*temp;
//         }
//         else{
//             if(n>0)
//             return temp*temp*x;
//             else
//            return (temp*temp)/x;
    
//         }
        
//     }
// }