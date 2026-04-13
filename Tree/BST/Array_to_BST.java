package Tree.BST;

public class Array_to_BST {
    
    static Node convart(int[] arr, int left, int rig) {
        if (left>rig ) return null; 
        int mid = (left + rig) / 2;
        Node root = new Node(arr[mid]);
        root.left = convart(arr, left, mid-1);
        root.right = convart(arr, mid + 1, rig);
        return root;
    }

    static Node arraytobst(int[] arr) {
        return convart(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
      Node res=  arraytobst(arr);
      preorder(res);
    }

    static void preorder(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
   
}
