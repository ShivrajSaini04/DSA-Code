package Tree.BST;

public class Kth_smallest {
    static int temp=0;
    static int ans =0;
    static void inoerder(Node root) {
        if (root == null)  return;
        inoerder(root.left);
        temp--;
        if (temp==0) ans = root.data;
        inoerder(root.right);
    }
    static int kth(Node root , int k){
        temp=k;
        ans=-1;
        inoerder(root);
        return ans ;
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
    System.out.println(kth(root, 5));
    }
}
