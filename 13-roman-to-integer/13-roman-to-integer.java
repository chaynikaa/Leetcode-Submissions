class Solution {
    public int romanToInt(String s) {
        
        int[]a = new int[s.length()];
        
        for(int i=0;i<s.length();i++){
            switch(s.charAt(i)){
           case 'I': a[i]=1;
                     break;
           case 'V': a[i]=5;
                     break;
           case 'X': a[i]=10;
                     break;
           case 'L': a[i]=50;
                     break;
           case 'C': a[i]=100;
                     break;
           case 'D': a[i]=500;
                     break;
           case 'M': a[i]=1000;
                     break;
            
          }
        }                  
        
     int sum = 0;
        
     for(int i=0;i<a.length-1;i++){
         if(a[i]<a[i+1]){
             sum=sum-a[i];
         }
         else
             sum=sum+a[i];
     }   
     
    return sum+a[a.length-1];

    }
}