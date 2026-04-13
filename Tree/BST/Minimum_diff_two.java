package Tree.BST;

public class Minimum_diff_two {
    static Integer previous;
    static int ans;

    static void inorder(Node root) {
        if (root == null)
            return;
        inorder(root.left);
        if (previous != null) {
            ans = Math.min(ans, Math.abs(root.data - previous));
        }
        previous = root.data;
        inorder(root.right);                         
    }

   static int absolute_diff(Node root) {      // Absolute Diffrence b/w Two Nodes
        previous = null;
        ans = Integer.MAX_VALUE;
        inorder(root);
        return ans;
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
        System.out.println(absolute_diff(root));
    }
}
