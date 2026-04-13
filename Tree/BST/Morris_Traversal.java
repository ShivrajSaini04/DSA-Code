package Tree.BST;

public class Morris_Traversal {
    static void morrisinorder(Node root){
           if (root==null)  return ;
           Node curr = root;
           while(curr!=null){

            if (curr.left!=null){
                Node pre = curr;
                pre = curr.left;
                while (pre.right != null && pre.right != curr)
                    pre = pre.right;

                if (pre.right == null){
                     pre.right = curr;
                     curr = curr.left;
                }
                if (pre.right==curr) {
                     pre.right = null;
                     System.out.print(curr.data + "  ");
                     curr = curr.right;
                 }
            }
            else {
                System.out.print(curr.data+"  ");
                curr = curr.right;
            }
           }
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
        morrisinorder(root);
    }
}
