import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

class vertical_sum_bt{


class Pair{
    Node node;
    int dist;
    Pair(Node node , int dist){
        this.node = node;
        this.dist = dist;
    }
}

class Solution {
    public ArrayList<Integer> verticalSum(Node root) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        TreeMap<Integer ,Integer > map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        
        q.add(new Pair(root,0));
        while(q.size()>0){
            Pair temp = q.remove();
            
            Node node = temp.node;
            int dist = temp.dist;
            
            map.put(dist,map.getOrDefault(dist ,0) + temp.node.data);
            
            if (node.left != null)  q.add(new Pair(node.left, dist - 1));
            if (node.right != null)  q.add(new Pair(node.right, dist + 1));
        }
        
        for (int ele : map.values()) ans.add(ele);
        return ans;
    }
}
}