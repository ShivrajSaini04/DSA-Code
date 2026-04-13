package Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node { // Node class
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}

 class Pair{
    Node node ;
    int dist ;
    Pair (Node node , int dist ){
        this.node = node;
        this.dist = dist;
    }
}

class TopView{
    ArrayList<Integer> topview(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        while (q.size() > 0) {
            Pair temp = q.remove();
            Node node = temp.node;
            int dis = temp.dist;
            min = Math.min(min, dis);
            max = Math.max(max, dis);
            if (!map.containsKey(dis))
                map.put(dis, node.data);
            if (node.left != null)
                q.add(new Pair(node.left, dis - 1));
            if (node.right != null)
                q.add(new Pair(node.right, dis + 1));
        }
        for (int i = min; i <= max; i++) {
            list.add(map.get(i));
        }
        return list;
    }
}
public class Top_View_BT {
    public static void main(String[] args) {
        TopView obj = new TopView();
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
        ArrayList<Integer> list = new ArrayList<>();
        list = obj.topview(root);
        System.out.println(list);  
    }
}
