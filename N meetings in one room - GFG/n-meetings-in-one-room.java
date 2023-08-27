//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);

            int start[] = new int[n];
            int end[] = new int[n];

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++)
                start[i] = Integer.parseInt(inputLine[i]);

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) 
                end[i] = Integer.parseInt(inputLine[i]);
                
            int ans = new Solution().maxMeetings(start, end, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends




class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.

    public static int maxMeetings(int start[], int end[], int n)
    {
        if(start.length==0)
        return 0;
        // add your code here
        int ans = 1;
        ArrayList<meeting> list = new ArrayList<>();
        for(int i=0;i<start.length;i++){
            list.add(new meeting(start[i],end[i]));
        }
        Collections.sort(list,(a,b)->a.end-b.end);
        //  meetingComparator mc = new meetingComparator();
        // Collections.sort(list,mc);
            
            int endPoint = list.get(0).end;
            
            for(int i=1;i<start.length;i++){
                if(list.get(i).start>endPoint){
                    ans++;
                    endPoint = list.get(i).end;
                }
            }
        return ans;
    }
}

class meeting{
    int start;
    int end;
    meeting(int start, int end){
        this.start = start;
        this.end = end;
    }
}

// class meetingComparator implements Comparator<meeting>{
//     public int compare(meeting o1, meeting o2){
//         if(o1.end<o2.end)
//         return -1;
//         else
//         return 1;
//     }
// }