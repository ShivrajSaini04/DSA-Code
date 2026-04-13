package Tree;

import java.util.ArrayList;

public class right_view_BT {
    private static ArrayList<Integer> rvt(Node root, ArrayList<Integer> list) {
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
        helper(root.left, list, i + 1);
        helper(root.right, list, i + 1);
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
        c.left = e;
        e.left = f;
        ArrayList<Integer> list = new ArrayList<>();
        list = rvt(root, list);
        System.out.println(list);
    }

}
