package Tree;

class Node { // Node class
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}

class tree {
    int max(Node root) {
        if (root == null)
            return Integer.MIN_VALUE;
        return Math.max(root.data, Math.max(max(root.left), max(root.right)));
    }

    int min(Node root) {
        if (root == null)
            return Integer.MAX_VALUE;
        return Math.min(root.data, Math.min(min(root.left), min(root.right)));
    }

    int height(Node root) {
        if (root == null || (root.left == null && root.right == null))
            return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    int sum(Node root) {
        if (root == null)
            return 0;
        return root.data + sum(root.left) + sum(root.right);
    }

    int product(Node root) {
        if (root == null)
            return 1;
        return root.data * product(root.left) * product(root.right);
    }

    int size(Node root) {
        if (root == null)
            return 0;
        return 1 + size(root.left) + size(root.right);
    }

    void display(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        display(root.left);
        display(root.right);
    }

    void preorder(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    void inorder(Node root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    void postorder(Node root) {
        if (root == null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    void nthLevel(Node root, int n) {
        if (root == null)
            return;
        if (n == 1) {
            System.out.print(root.data + " ");
            return;
        }
        nthLevel(root.left, n - 1);
        nthLevel(root.right, n - 1);
    }
}

public class Tree_impli {
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
        // tr.display(root);
        // System.out.println(tr.max(root));
        // System.out.println(tr.sum(root));
        // System.out.println(tr.size(root));
        // System.out.println(tr.min(root));
        // System.out.println(tr.product(root));
        // tr.preorder(root);
        // System.out.println();
        // tr.inorder(root);
        // System.out.println();
        // tr.postorder(root);
        // tr.nthLevel(root, 3);
        // System.out.println();
        // System.out.println(tr.height(root));
        // print in level order
        for (int i = 1; i <= tr.height(root); i++) {
            tr.nthLevel(root, i);
        }
    }
}
