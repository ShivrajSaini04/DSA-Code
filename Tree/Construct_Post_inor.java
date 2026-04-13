package Tree;

public class Construct_Post_inor {
    public Node bulider(int[] postorder, int postlow, int posthi, int[] inorder, int inlow, int inhi) {
        if (postlow > posthi)
            return null;
        Node root = new Node(postorder[posthi]);
        int i = inlow;
        while (inorder[i] != postorder[posthi])
            i++;
        int leftsize = i - inlow;
        root.left = bulider(postorder, postlow, postlow + leftsize - 1, inorder, inlow, i - 1);
        root.right = bulider(postorder, postlow + leftsize, posthi - 1, inorder, i + 1, inhi);
        return root;
    }

    Node buildTree(int[] inorder, int[] postorder) {
        // code here
        int n = postorder.length;
        return bulider(postorder, 0, n - 1, inorder, 0, n - 1);
    }
    public static void main(String[] args) {
        
    }
}
