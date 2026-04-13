package Heaps;

class Node { // Node class
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}

public class Is_BT_Heap {

    static int size ;
    
    static int size(Node root) {
        if (root == null)
            return 0;
        return 1 + size(root.left) + size(root.right);
    }

    static boolean isCBT(Node root, int idx){
        if (root==null) return true;
        if (size < idx) return false;
       return isCBT(root.left, 2 * idx) && isCBT(root.right, 2*idx+1);
    }

    static boolean  maxheap(Node root){
        if (root == null || root.left==null && root.right==null ) return true;
        if (root.left == null && root.right!=null) return false ; 
        if ((root.left!=null && root.data < root.left.data) || (root.right!=null && root.right.data>root.data)) 
           return false ;
       return maxheap(root.left) && maxheap(root.right);
    }

    public static boolean isBinaryHeap(Node root){
          size =  size(root);
       return maxheap(root) && isCBT(root,1);
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
        System.out.println(isBinaryHeap(root));
    }
}
