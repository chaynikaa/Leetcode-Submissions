//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    public static void main(String args[])throws IOException
    {
        //reading input using BufferedReader class
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        //reading total testcases
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            //reading number of elements and weight
            int n = Integer.parseInt(read.readLine());
            int w = Integer.parseInt(read.readLine());
            
            int val[] = new int[n];
            int wt[] = new int[n];
            
            String st[] = read.readLine().trim().split("\\s+");
            
            //inserting the values
            for(int i = 0; i < n; i++)
              val[i] = Integer.parseInt(st[i]);
             
            String s[] = read.readLine().trim().split("\\s+"); 
            
            //inserting the weigths
            for(int i = 0; i < n; i++)
              wt[i] = Integer.parseInt(s[i]);
              
            //calling method knapSack() of class Knapsack
            System.out.println(new Solution().knapSack(w, wt, val, n));
        }
    }
}




// } Driver Code Ends


class Solution 
{ 
    //Function to return max value that can be put in knapsack of capacity W.
     int knapSack(int W, int wt[], int val[], int n) 
    { 
         int[][]dp = new int[n][W+1];
         
        //  for(int i=0;i<n;i++){
        //      if(wt[i]<W){
        //          dp[i][0]=val[i];
        //      }
        //  }
         
        for(int x=wt[0];x<=W;x++){
             dp[0][x]=val[0];
         }
         
         for(int i=1;i<n;i++){
             for(int wei=0;wei<=W;wei++){
                 int  notTake = dp[i-1][wei];
                 int take = Integer.MIN_VALUE;
                 if(wt[i]<=wei)
                 take = val[i]+dp[i-1][wei-wt[i]];
                 
                 dp[i][wei] = Math.max(take,notTake);
             }
         }
         return dp[n-1][W];
    } 

}


