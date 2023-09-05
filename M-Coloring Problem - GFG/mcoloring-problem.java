//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tc = scan.nextInt();

        while (tc-- > 0) {
            int N = scan.nextInt();
            int M = scan.nextInt();
            int E = scan.nextInt();

            boolean graph[][] = new boolean[N][N];

            for (int i = 0; i < E; i++) {
                int u = scan.nextInt() - 1;
                int v = scan.nextInt() - 1;
                graph[u][v] = true;
                graph[v][u] = true;
            }

            System.out.println(new solve().graphColoring(graph, M, N) ? 1 : 0);
        }
    }
}

// } Driver Code Ends


class solve {
    // Function to determine if graph can be coloured with at most M colours
    // such
    // that no two adjacent vertices of graph are coloured with same colour.
   public boolean isSafe(int vertex, boolean graph[][], int[] color, int c, int n) {
        for (int i = 0; i < n; i++) {
            if (graph[vertex][i] && color[i] == c) {
                return false;
            }
        }
        return true;
    }

    public boolean graphColoringUtil(boolean graph[][], int m, int[] color, int vertex, int n) {
        if (vertex == n) {
            return true;
        }

        for (int c = 1; c <= m; c++) {
            if (isSafe(vertex, graph, color, c, n)) {
                color[vertex] = c;

                if (graphColoringUtil(graph, m, color, vertex + 1, n)) {
                    return true;
                }

                // backtrack
                color[vertex] = 0;
            }
        }

        return false;
    }

    public boolean graphColoring(boolean graph[][], int m, int n) {
        int[] color = new int[n];

        if (!graphColoringUtil(graph, m, color, 0, n)) {
            return false;
        }

        return true;
    }
}