package Tree.BST;

public class sum_between_twoNodes {
       public static int rangeSumBST(Node root, int low, int high) {
        if(root==null) return 0;
        if (root.data < low) return rangeSumBST(root.right,low ,high);
        else if (root.data > high) return rangeSumBST(root.left,low ,high);
        else return root.data  + rangeSumBST(root.right,low ,high)   + rangeSumBST(root.left,low ,high);
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
        System.out.println(rangeSumBST(root, 7,13));
    }
}