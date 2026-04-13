package Tree.BST;

public class search_in_Bst {
    static boolean searchBST(Node root, int tar) {
        if (root == null)
            return false;
        if (root.data == tar)
            return true;
        else if (root.data < tar)
            return searchBST(root.right, tar);
        else
            return searchBST(root.left, tar);
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
        System.out.println(searchBST(root, 7));
    }
}
