package Tree.BST;

public class Delete_Node_BST {
    static Node delete(Node root , int tar){
        if (root==null) return null;
        if (root.data < tar)    root.right = delete(root.right, tar);
        else if (root.data > tar) root.left = delete(root.left, tar);
        else {
            // for leaf node 
            if (root.left==null && root.right==null) return null;
            // for single child 
            if (root.left==null) return root.right;
            if (root.right==null) return root.left;
            // for two child 
             Node temp = root.left;
             while(temp.right!=null) temp = temp.right;
            root.left = delete(root.left, temp.data);
            temp.left = root.left;
            temp.right = root.right;
             return temp;
        }
        return root;
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
       inorder( delete(root, 9));
        
    }
    
    static void inorder(Node root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
}
