package Graph;

import java.util.LinkedList;
import java.util.Queue;

public class Number_Of_Provinces {
    
     void bfs(int i , int[][] adj, boolean[] visit ){
        int n = adj.length;
        Queue<Integer> q = new LinkedList<>();
        visit[i] = true;
        q.add(i);
        while(q.size()>0){
            int front = q.remove();
            for(int j=0;j<n;j++){
               if (adj[front][j]==1 && !visit[j] ){
                q.add(j);
                visit[j]=true;
               }
            }
        }
    }
    
    public int findCircleNum(int[][] adj) {
        int n = adj.length;
        boolean[] visit = new boolean[n];
        int count = 0;
        for (int i=0;i<n;i++){
            if (!visit[i] ){
                bfs(i,adj,visit);
                count++;     
            }
        }
        return count;
    }
}
