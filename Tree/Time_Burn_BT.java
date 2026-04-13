package Tree;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

 class Pair {
     Node node ;
     int level ;
     Pair(Node node , int level ){
        this.node = node ;
        this.level = level;
     }
}

public class Time_Burn_BT {
    static Node start ;

    static void dfs(Node root, HashMap<Node, Node> map,int target) {
        if (root == null)
            return;
        if (root.data == target ) start = root;
        if (root.left!=null) map.put(root.left, root);
        if (root.right != null) map.put(root.right, root);
        dfs(root.left,map,target);
        dfs(root.right,map,target);

    }

     static int burntime(Node root, int target) {
        if (root==null || (root.left == null && root.right == null) ) return 0; // base case

       HashMap<Node,Node> map = new HashMap<>();
       HashSet<Node> set = new HashSet<>();
       Queue<Pair> q = new LinkedList<>();
       start = null;
       dfs(root,map,target);
       int time = 0;

       q.add(new Pair(start, 0));
       set.add(start);
       while(q.size()>0){
        Pair temp = q.remove();
        Node node = temp.node;
        int level = temp.level;
        time = Math.max(time, level);
        if (node.left!=null && (!set.contains(node.left))) {
            q.add(new Pair(node.left, level+1));
            set.add(node.left);
        }
        if (node.right != null && (!set.contains(node.right))) {
            q.add(new Pair(node.right, level + 1));
            set.add(node.right);
        }
        if (map.containsKey(node) && (!set.contains(map.get(node)))){
            q.add(new Pair(map.get(node), level+1));
            set.add(map.get(node));
        }
       }
       return time;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right = b;
        Node c = new Node(4);
        Node d = new Node(5);
        a.left = c;
        a.right = d;
        Node e = new Node(6);
        Node f = new Node(-7);
        b.left = e;
        b.right = f;
        System.out.println(burntime(root,2));
    }
}
