package Graph;
import java.util.*;

class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        List<List<Integer>> adj = new ArrayList<>();
        int[] ind = new int[n];
        for (int i = 0; i < n; i++)
            adj.add(new ArrayList<>());
        for(int i=0;i<n;i++){
            for (int ele : graph[i]) {
                adj.get(ele).add(i);
                ind[i]++;
            }
        }
        // Kahn's Algorithum
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (ind[i] == 0)
                q.add(i);
        }

        while (q.size() > 0) {
            int front = q.poll();
            ans.add(front);
            for (int ele : adj.get(front)) {
                ind[ele]--;
                if (ind[ele] == 0)
                    q.add(ele);
            }
        }

        return ans;
    }
}

public class Find_SafeState {
    public static void main(String[] args) {
        
    }
}
