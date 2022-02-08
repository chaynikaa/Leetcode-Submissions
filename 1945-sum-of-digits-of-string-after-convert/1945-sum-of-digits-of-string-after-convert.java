class Solution {
    public int getLucky(String s, int k) {
        int sum = 0;
        int ans = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int check = ch-96;            
            if(check>9)
                check = get(check);
            sum = sum+check;
        }
        if(k==1)
        return sum;
        else{
            for(int i=1;i<k;i++){
                ans = get(sum);
                sum = ans;
            }
        }
        return ans;
    }
    
    public int get(int n){
        int r = 0;
        while(n!=0){
            int digit = n%10;
            r = r+digit;
            n=n/10;
        }
        
        return r;
    }
}