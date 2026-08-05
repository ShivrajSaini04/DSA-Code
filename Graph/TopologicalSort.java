package Graph;
import java.util.*;
class Solution {
    public ArrayList<Integer> topoSort(int V, int[][] edges) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        boolean[] visit = new boolean[V];
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		
		for (int i = 0; i < V; i++)
			adj.add(new ArrayList<>());
		
		for (int[] edge : edges) {
            // because graph is directed
            adj.get(edge[0]).add(edge[1]);
        }
		
        
		for (int i = 0; i<V; i++) {
			if (!visit[i]) {
                dfs(i, adj, visit, list);
            }
        }
        Collections.reverse(list);
        return list;
		
    }

    private void dfs(int i, ArrayList<ArrayList<Integer>> adj, boolean[] visit, ArrayList<Integer> list) {
        visit[i]  = true;
        for(int ele : adj.get(i)){
            if(!visit[ele]){
                dfs(ele, adj, visit, list);
            }
        }
        list.add(i);
    }

    
}


public class TopologicalSort {
    public static void main(String[] args) {
        
    }
}
