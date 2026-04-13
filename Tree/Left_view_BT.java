package Tree;

import java.util.ArrayList;

public class Left_view_BT {
      private static ArrayList<Integer> lvt(Node root, ArrayList<Integer> list) {
        helper(root, list, 0);
        return list;
    }
    private static void helper(Node root, ArrayList<Integer> list, int i) {
        if (root == null)
            return;
       if (i>=list.size()) 
           list.add(i, root.data);
        else 
            list.set(i, root.data);
        helper(root.right, list, i + 1);
        helper(root.left, list, i + 1);
    }

    public static void main(String[] args) {
        //        1 
        //      /   \ 
        //     3     2
        //          /  \
        //         4     5
        //                \
        //                 6
        //                  \
        //                   -7
        Node root = new Node(1);
        Node a = new Node(2);                          
        Node b = new Node(3);
        root.left = b;
        root.right = a;
        Node c = new Node(4);
        Node d = new Node(5);
        a.left = c;
        a.right = d;
        Node e = new Node(6);
        Node f = new Node(-7);
        c.left = e;
        e.left = f;
        ArrayList<Integer> list = new ArrayList<>();
        list = lvt(root, list);
        System.out.println(list);
    }
}
