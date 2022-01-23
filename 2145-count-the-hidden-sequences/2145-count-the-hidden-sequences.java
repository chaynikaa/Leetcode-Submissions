class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        int count=0; 
        int sum=0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i=0;i<differences.length;i++){
            sum+=differences[i];
            max = Math.max(max,sum);
            min = Math.min(min,sum);
        }
        
        for(int i=lower;i<=upper;i++){
            if(i+min>=lower && i+max<=upper)
                count++;
        }
       return count; 
    }
}


// class Solution {               //BRUTE FORCE->TLE
//     public int numberOfArrays(int[] differences, int lower, int upper) {
//         int count=0; 
//         int[] check = new int[differences.length+1];
//         int x=lower;
//         while(x<=upper){
//             int flag=0;
//             check[0]=x;
//             for(int i=1;i<check.length;i++){
//                 check[i] = check[i-1]+differences[i-1];
//                 if(check[i]>upper || check[i]<lower){
//                     flag=1;
//                     break;
//                 }
//             }
//             if(flag==0)
//             count++;
//             x++;
//         }
        
//         return count;
//     }
// }