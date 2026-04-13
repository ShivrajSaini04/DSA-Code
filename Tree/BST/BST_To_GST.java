package Tree.BST;

import java.util.ArrayList;
import java.util.Collections;

public class BST_To_GST {
       // without any extra space  
       static int sum = 0;
       static void reverseinorder(Node root) {
           if (root == null)
               return;
           reverseinorder(root.right);
         int curr =  root.data;
         root.data=sum;
         sum+=curr;
           reverseinorder(root.left);
       }
        //  Main Function
       static void gst(Node root) {
           sum=0;
           reverseinorder(root );
       }

        // with O(n) space
    // static void reverseinorder(Node root, ArrayList<Node> list) {
    //     if (root == null)   return;
    //     reverseinorder(root.right,list);
    //     list.add(root);
    //     reverseinorder(root.left,list);
    // }
    // static void gst(Node root){
    //  ArrayList<Node> list = new ArrayList<>();
    //  reverseinorder(root, list);
    // // Collections.reverse(list);   require(use) for inorder 
    //  int sum =0;
    //  for (int i=0;i<list.size();i++){
    //      Node temp = list.get(i);
    //      int curr = temp.data;
    //     temp.data=sum;
    //     sum+=curr;
    //  }
    // }
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
         gst(root);
        preorder(root);
    }
    
    static void preorder(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

}
