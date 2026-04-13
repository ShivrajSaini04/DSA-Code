package Tree;

public class Diameter_BT {

    static int height(Node root) {
        if (root == null || (root.left == null && root.right == null))
            return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static int Dia_bt(Node root) {
        if (root == null || (root.left == null && root.right == null))
            return 0;
        int leftans = Dia_bt(root.left);
        int rightans = Dia_bt(root.right);
        int mid = height(root.left) + height(root.right);
        if (root.left != null)
            mid++;
        if (root.right != null)
            mid++;
        int max = Math.max(leftans, Math.max(rightans, mid));
        return max;
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
        System.out.println(Dia_bt(root));
    }
}
