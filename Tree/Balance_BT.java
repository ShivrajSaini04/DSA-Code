package Tree;

public class Balance_BT {
    static int height(Node root) {
        if (root == null || (root.left == null && root.right == null))
            return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static boolean isvalid(Node root) {
        if (root == null)
            return true;
        int leftheight = height(root.left);
        int rightheight = height(root.right);
        if (root.left != null)
            leftheight++;
        if (root.right != null)
            rightheight++;
        int diff = leftheight - rightheight;
        if (diff < 0)
            diff *= -1;
        if (diff > 1)
            return false;
        return (isvalid(root.left) && isvalid(root.right));
    }

    public static void main(String[] args) {
        solution obj = new solution();
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
        System.out.println(isvalid(root));

    }
}

// using Dyanamic programig
// optimal approach
class solution {
    static boolean flag = true;

    public boolean blance(Node root) {
        if (root == null)
            return true;
        System.out.println(root.data);
        flag = true;
        level(root);
        return flag;
    }

    private int level(Node root) {
        if (root == null)
            return 0;
        int leftlev = level(root.left);
        int rightlev = level(root.right);
        if (Math.abs(leftlev - rightlev) > 1)
            flag = false;
        return 1 + Math.max(leftlev, rightlev);
    }
}