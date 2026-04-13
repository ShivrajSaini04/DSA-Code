package Tree;

import java.util.LinkedList;
import java.util.Queue;

class BulidTree {
    public Node bulider(int[] preorder, int prlow, int prhi, int[] inorder, int inlow, int inhi) {
        Node root = new Node(preorder[prlow]);
        int i = inlow;
        while (inorder[i] != preorder[prlow])
            i++;
        int leftsize = i - inlow;
        root.left = bulider(preorder, prlow + 1, prlow + leftsize, inorder, inlow, i - 1);
        root.right = bulider(preorder, prlow + leftsize + 1, prhi, inorder, i + 1, inhi);
        return root;
    }

    // taking input function
    public Node bulidtree(int[] preorder, int[] inorder) {
        int n = preorder.length - 1;
        return bulider(preorder, 0, n, inorder, 0, n);
    }

    // print Tree in preorder
    public static void bfs(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (q.size() > 0) {
            Node temp = q.peek();
            if (temp.left != null)
                q.add(temp.left);
            if (temp.right != null)
                q.add(temp.right);
            System.out.print(temp.data + " ");
            q.remove();
        }
        System.out.println();
    }
}

public class Bulid_Tree_in_pre {
    public static void main(String[] args) {
        BulidTree obj = new BulidTree();
        int preorder[] = { 3, 9, 20, 15, 7 };
        int inorder[] = { 9, 3, 15, 20, 7 };
        Node res = obj.bulidtree(preorder, inorder);
        obj.bfs(res);
        // Exact Output: [3,9,20,null,null,15,7]
    }
}
