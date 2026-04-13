package Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class postorder_iterative  {
      static ArrayList<Integer> postOrder(Node root) {
        // code here
         Stack<Node> st =new Stack<>();
         ArrayList<Integer> list = new ArrayList<>();
       if(root==null) return list;
       st.push(root);
       while (st.size()>0) {
          Node temp = st.pop();
         list.add(temp.data);
          if (temp.left != null)  st.push(temp.left);
          if(temp.right!=null) st.push(temp.right);
       }
       Collections.reverse(list);
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
       list= postOrder(root);
       System.out.println(list);
    }
}
