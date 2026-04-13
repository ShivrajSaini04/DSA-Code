package Heaps;

import java.util.ArrayList;

public class BST_To_MaxHeap {
    static int size;
     static int idx ;
    // static int size(Node root) {
    //     if (root == null)
    //         return 0;
    //     return 1 + size(root.left) + size(root.right);
    // }
    
    private static void inorder(Node root, ArrayList<Integer> list) {
         if (root==null) return ;
         inorder(root.left, list);
         list.add(root.data);
         inorder(root.right, list);
    }

     private static void convart(Node root, ArrayList<Integer> list) {
      if (root==null) return;
      convart(root.left, list);
      convart(root.right, list);
      root.data = list.get(idx++);
    }

    static void bsttomaxheap(Node root){
      ArrayList<Integer> list = new ArrayList<>();
        idx=0;
        inorder(root , list);
        idx=0;
        convart(root , list);
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
          bsttomaxheap(root);
         dfs(root);
      }
      
      private static void dfs(Node root) {
          if (root == null)
              return;
            System.out.print(root.data+" ");
          dfs(root.left);
          dfs(root.right);
      }
}
