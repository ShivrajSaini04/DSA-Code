package Tree;

public class sumofleafnode {
   static int sum = 0;

    static void lastlevel(Node root) {
        if (root == null)  return;
        if (root.left == null && root.right == null) sum += root.data;
        lastlevel(root.left);
        lastlevel(root.right);
    }

    public static int sumOfLeafNodes(Node root) {
        sum=0;
        lastlevel(root);
        return sum;
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
        System.out.println(sumOfLeafNodes(root));
    }
}
