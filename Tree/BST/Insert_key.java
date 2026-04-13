package Tree.BST;

public class Insert_key {
   
   static  void preorder(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
 
    static void helper(Node root, int key) {
        
         if (root.data == key) return ;

        else  if (root.data < key){
                if (root.right==null) root.right = new Node(key);
               else  helper(root.right, key);
        }
         else{
            if (root.left == null) root.left = new Node(key);
           else  helper(root.left, key);
         }
    }

    static Node insert(Node root, int key){
         helper(root,key);
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
      //Node e = new Node(10);
        Node f = new Node(13);
     // b.left = e;
        b.right = f;

        preorder(insert(root,10));
    }
}
