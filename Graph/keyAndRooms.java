package Graph;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class keyAndRooms {

    static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] visit = new boolean[n];
        // bfs(0,rooms,visit);
        dfs(0,rooms, visit);
        for (boolean flag : visit)
            if (!flag)
                return false;
        return true;
    }

    static void dfs(int start , List<List<Integer>> rooms, boolean[] visit) {
        visit[start] = true;
        for(int ele : rooms.get(start)){
            if (!visit[ele]) 
                dfs(ele, rooms, visit);
        }
    }

    
    private static void bfs(int start,List<List<Integer>> rooms, boolean[] visit) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visit[start] = true;
        while (q.size() > 0) {
            int temp = q.poll();
            for (int ele : rooms.get(temp)) {
                if (!visit[ele]) {
                    q.add(ele);
                    visit[ele] = true;
                }
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
