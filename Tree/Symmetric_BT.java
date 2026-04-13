package Tree;
class Solution {
    public Node invertTree(Node root) {
       // if (root.left==null && root.right==null) return root;
        if (root==null) return root;
        Node temp = root.left;
        root.left=root.right;
        root.right=temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
    public boolean isSameTree(Node p, Node q) {
        if (p == null && q == null)
            return true;
        if (p == null || q == null)
            return false;
        if (p.data != q.data)
            return false;
        return (isSameTree(p.left, q.left) && isSameTree(p.right, q.right));
    }
    public boolean isSymmetric(Node root) {
        root.left=invertTree(root. left);
        return isSameTree(root. left, root.right);
    }
}

public class Symmetric_BT {
    public static void main(String[] args) {
        
    }
}
