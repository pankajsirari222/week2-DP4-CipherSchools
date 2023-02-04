import java.util.*;

//T.c. O(V + 2E)
//S.c. O(3*n) == O(n)
public class class40 {
    //BFS
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> res = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        boolean visited[] = new boolean[V];
        visited[0] = true;
        q.offer(0);
        while(!q.isEmpty()) {
            int node = q.poll();
            res.add(node);
            
            for(int x : adj.get(node)) {
                if(!visited[x]) {
                    visited[x] = true;
                    q.offer(x);
                }
            }
        }
        return res;
    }
    //DFS
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean visited[] = new boolean[V];
        visited[0] = true;
        ArrayList<Integer> res = new ArrayList<>();
        dfs(0, adj, res, visited);
        return res;
    }
    public void dfs(int node, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> res, boolean[] visited) {
        visited[node] = true;
        res.add(node);
        
        for(int x : adj.get(node)) {
            if(!visited[x]) {
                dfs(x, adj, res, visited);
            }
        }
    }
}
