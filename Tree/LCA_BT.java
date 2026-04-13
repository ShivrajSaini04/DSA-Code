package Tree;

// solution class 
class Solution {

      // optimal solution of LCA
    static Node Lca(Node root, Node p, Node q) {
        if (root == null)
            return null;
        if (p == q)
            return p;
        if (p == root || q == root)
            return root;
        Node l = Lca(root.left, p, q);
        Node r = Lca(root.right, p, q);
        if (l != null && r != null)
            return root;
        return (l == null) ? r : l;
    }
         //  not optimal , but good
    public boolean contain(Node root, Node node) {
        if (root == null)
            return false;
        if (root == node)
            return true;
        return contain(root.left, node) || contain(root.right, node);
    }

    public Node lowestCommonAncestor(Node root, Node p, Node q) {
        if (root == null)
            return null;
        if (p == root || q == root)
            return root;
        if (p == q)
            return p;
        boolean leftp = contain(root.left, p);
        boolean rightq = contain(root.right, q);

        if ((leftp && rightq) || (!leftp && !rightq))
            return root;
        if (leftp && !rightq)
            return lowestCommonAncestor(root.left, p, q);
        if (!leftp && rightq)
            return lowestCommonAncestor(root.right, p, q);
        return root;
    }
}

public class LCA_BT {
    public static void main(String[] args) {

    }
}
