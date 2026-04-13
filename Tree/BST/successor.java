package Tree.BST;

public class successor {
    static Node succ(Node root) {
        if (root==null  || root.right==null  ) return null;

        Node temp = root;
        temp = root.right;
        while (temp.left != null)
            temp = temp.left;
        return temp;
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
        System.out.println(succ(root).data);
    }
}
