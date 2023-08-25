//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t-- > 0) {

            int n;
            n = sc.nextInt();

            int k;
            k = sc.nextInt();

            int[] v = new int[n];
            for (int i = 0; i < n; i++) v[i] = sc.nextInt();

            Solution obj = new Solution();
            int res = obj.solve(n, k, v);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    public static int solve(int n, int k, int[] stalls) {
        
        Arrays.sort(stalls);
        int low = 1;
        int high = stalls[n-1]-stalls[0];
        int ans=-1;
        
        while(low<=high){
            int mid = (low+high)/2;
            if(isPossible(n,k,stalls,mid)){
                ans = mid;
                low = mid+1;
            }
            else
            high = mid-1;
        }
        return ans;
    }
    public static boolean isPossible(int n, int k, int[] stalls,int allowed){
        int cows = 1; //assuming we have placed on cow at 0
        int last = stalls[0];
        for(int i=1;i<n;i++){
            if(stalls[i]-last >= allowed){
                cows++;
                last = stalls[i];
            }
            if(cows==k)
            return true;
        }
        return false;
    }
}