package Tree.BST;

import java.util.ArrayList;

public class BST_To_Fllatten {
      
     static void inorder(Node root, ArrayList<Node> list) {
            if(root==null) return ;
            inorder(root.left, list);
            list.add(root);
            inorder(root.right, list);
        }

    public static  Node flattenBST(Node root) {   // BST to Sorted Flatten tree (right side )
        if(root==null) return null;               // left of each node is null
            ArrayList<Node> list=new ArrayList<>();
            inorder(root,list);
           for(int i=0;i<list.size()-1;i++){
            Node a = list.get(i);
            Node b= list.get(i+1);
            a.right=b;
            a.left=null;
           }
           Node last = list.get(list.size()-1);
           last.left=null;
           last.right=null;
           return list.get(0);
    }
      public static void main(String[] args) {
          Node root = new Node(9);
          Node a = new Node(5);
          Node b = new Node(11);
          root.left = a;
          root.right = b;
          Node c = new Node(3);
          Node d = new Node(7);
          a.left = c;
          a.right = d;
          Node e = new Node(10);
          Node f = new Node(13);
          b.left = e;
          b.right = f;

          preorder(flattenBST(root));
      }
    static void preorder(Node root){
        if (root==null) return ;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
  }