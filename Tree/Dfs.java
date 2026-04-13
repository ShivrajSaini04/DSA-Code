package Tree;

public class Dfs {
   static void dfs(Node root){
        if (root==null) return ;
        System.out.print(root.data+" ");
        dfs(root.left);
        dfs(root.right);

    }
    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right = b;
        Node c = new Node(4);
        Node d = new Node(5);
        a.left = c;
        a.right = d;
        Node e = new Node(6);
        Node f = new Node(-7);
        b.left = e;
        b.right = f;
        dfs(root);
    }
}
