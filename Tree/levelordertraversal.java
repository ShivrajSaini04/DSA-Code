package Tree;

import java.util.LinkedList;
import java.util.Queue;
class Node { // Node class
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}
class Pair {
    Node node;
    int level;
     Pair(Node node , int level){
        this.node= node;
        this.level= level;
    } 
    }

public class levelordertraversal {

 private static void bfs(Node root) {
        if (root==null) return ;
        Queue<Pair> q = new LinkedList<>();
        int currentlevel=0;
        q.add(new Pair(root ,currentlevel)); 
        while(q.size()>0){
            Pair temp =  q.remove();
            int level = temp.level;
             if (currentlevel!=level){
                currentlevel++;
                System.out.println();
             }
              System.out.print(temp.node.data+"  ");
             if (temp.node.left!=null) q.add(new Pair(temp.node.left, level+1));
             if (temp.node.right!=null) q.add(new Pair(temp.node.right, level+1));

        }
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
        bfs(root);
    }
    
}
