class Solution {
  public boolean carPooling(int[][] trips, int capacity) {
      
      int stops[] = new int[1001]; 
        for (int t[] : trips) {
          stops[t[1]] += t[0];   //adding the passengers at the time of pick up in a new array
          stops[t[2]] -= t[0];   //subtracting the passenger at the time of drop in the array
       }
       
      for(int number : stops){   //traversing the array
          capacity = capacity-number;
          if(capacity<0)               //limit exceeded
              return false;;
      }
   return true;
 }
}