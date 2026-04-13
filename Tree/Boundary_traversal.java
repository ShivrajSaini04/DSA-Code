package Tree;

import java.util.ArrayList;

public class Boundary_traversal {
    static void left(Node root,ArrayList<Integer> list ){
        if (root.left==null && root.right==null) return ;
        if (root.left!=null) {
            list.add(root.data);
            left(root.left, list);
        }
        else{
            list.add(root.data);
            left(root.right, list);
        }
    }
     
    static void lastlevel(Node root, ArrayList<Integer> list) {
        if(root==null) return;
        if (root.left == null && root.right == null)
           list.add(root.data);
        lastlevel(root.left, list);
        lastlevel(root.right, list);
    }
    
    static void right(Node root, ArrayList<Integer> list) {
        if (root.left == null && root.right == null)  return;  

        if (root.right != null)    right(root.right, list);
         else     right(root.left, list);

        list.add(root.data);
    }
                //  Main Function for add boundary node  
            
    private static ArrayList<Integer> Boundary(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null)
            return list;
        list.add(root.data);
        if (root.left != null) left(root.left, list);    // for left  nodes 
        lastlevel(root, list);                           // for last level  nodes
       if(root.right!=null) right(root.right, list);     // for right nodes 
        return list;
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
        ArrayList<Integer> list = new ArrayList<>();
        list = Boundary(root);
        System.out.println(list);
    }
}
