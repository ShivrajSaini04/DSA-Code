package Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class inorder_itreative {
    static ArrayList<Integer> inOrder(Node root) {
        // code here
         Stack<Node> st =new Stack<>();
         ArrayList<Integer> list = new ArrayList<>();
         Node currNode = root;
         while(currNode!=null || st.size()>0){
           if(currNode!=null){
               if (currNode.left != null) {
                   st.push(currNode);
                   currNode = currNode.left;
               }
               else{
                list.add(currNode.data);
                currNode= currNode.right;
               }
           }
         else {
            Node top = st.pop();
            list.add(top.data);
            currNode=top.right;
         }
       }  
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
       list= inOrder(root);
       System.out.println(list);
    }
}
