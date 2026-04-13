package Tree.BST;

public class LCA_BST {
    static Node newnode = new Node(0);

          //  Brute Force 

    // static void helper(Node root, Node r1, Node r2) {
    //     if (root == null)
    //         return;
    //     if (r1.data == r2.data) {
    //         newnode = new Node(r1.data);
    //         return;
    //     }
    //     if (root.data <= r2.data && root.data >= r1.data)
    //         newnode = new Node(root.data);
    //     if (root.data < r2.data && !(root.data > r1.data))
    //         lca(root.right, r1, r2);
    //     if (!(root.data < r2.data) && (root.data > r1.data))
    //         lca(root.left, r1, r2);
    // }

    static Node lca(Node root, Node r1, Node r2) {
        // newnode = root;
        // helper(root, r1, r2);
        // return newnode;
       
        //  IInd Approach  (optimal)

         if (root.data > r2.data && root.data > r1.data)  return lca(root.left, r1, r2);
        else  if (root.data < r2.data && root.data < r1.data) return lca(root.right, r1, r2);
          else return root;
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
        Node res = lca(root, e, f);
        System.out.println(res.data);
    }

}
