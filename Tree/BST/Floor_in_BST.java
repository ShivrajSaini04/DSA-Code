package Tree.BST;

public class Floor_in_BST {
    static int min;
    static int floor;

    static void min(Node root) {
        if (root == null)
            return;
        min = root.data;              // this Question return the  previous (  or Equal  ) value from X 
        min(root.left);
    }

    static void check(Node root, int tar) {
        if (root == null)
            return;
        if (root.data <= tar) {
            floor = root.data;
            check(root.right, tar);
        } else
            check(root.left, tar);
    }

    public static int floor(Node root, int x) {
        min = Integer.MAX_VALUE;
        min(root);
        if (x < min)
            return -1;
        check(root, x);
        return floor;

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
        System.out.println(floor(root,13));
    }
}
