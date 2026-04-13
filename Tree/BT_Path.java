package Tree;

import java.util.ArrayList;
import java.util.List;

public class BT_Path {
    static void helper(Node root, List<String> list, String str) {
        if (root == null)
            return;
        if (root.left == null && root.right == null) { // leaf Node
            str += root.data;
            list.add(str);
            return;
        }
        helper(root.left, list, str + root.data + "->");
        helper(root.right, list, str + root.data + "->");
    }

    static List<String> binaryTreePaths(Node root) {
        List<String> list = new ArrayList<>();
        helper(root, list, "");
        return list;
    }

    public static void main(String[] args) {
        tree tr = new tree();
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
        List<String> l = new ArrayList<>();
        l = binaryTreePaths(root);
        System.out.println(l);
    }
}
