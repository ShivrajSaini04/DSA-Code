package Tree;

// AT Leetcode
class Solution {
    public Node invertTree(Node root) {
        // if (root.left==null && root.right==null) return root; // For Leaf Node
        if (root == null)
            return root;
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}

// AT GFG
class solu {
    void mirror(Node root) {
        if (root == null)
            return;
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        mirror(root.left);
        mirror(root.right);
    }
}

public class Invert_BT {
    public static void main(String[] args) {

    }
}
