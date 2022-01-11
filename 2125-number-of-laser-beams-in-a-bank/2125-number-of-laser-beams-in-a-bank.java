class Solution {
    public int numberOfBeams(String[] bank) {
        int m=0;
        int[] arr = new int[bank.length];
        int ans = 0;
        for(int i=0;i<bank.length;i++){
            String s = bank[i];
            int count = 0;     
            for(int j=0;j<s.length();j++){     
                char ch = s.charAt(j);
                if(ch == '1')
                    count++;    //counting the no. of security devices
            }
            if(count!=0)
                arr[m++]=count;   //putting in the array
        }
        for(int i=0;i<m-1;i++)   {
            ans = ans + arr[i]*arr[i+1];   //calc the ans
        }     
        return ans;
        
    }
}