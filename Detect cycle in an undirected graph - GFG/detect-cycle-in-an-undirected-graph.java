//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) adj.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            boolean ans = obj.isCycle(V, adj);
            if (ans)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        int[] visited = new int[V];
        for(int i=0;i<V;i++){
            if(visited[i]==0)
            if(check(V,adj,visited,i))
            return true;
        }
        return false;
    }
    
    public boolean check(int V, ArrayList<ArrayList<Integer>>adj, int[]visited , int src){
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(src,-1));
        visited[src] = 1;
        
        while(q.size()>0){
            Pair node = q.poll();
            for(int i:adj.get(node.node)){
                if(visited[i]==0){
                    visited[i]=1;
                    q.add(new Pair(i,node.node));
                } else {
                    if(i!=node.parent)
                    return true;
                }
            }
        }
        return false;
    }
}
class Pair{
    int node;
    int parent;
    Pair(int node, int parent){
        this.node = node;
        this.parent = parent;
    }
}