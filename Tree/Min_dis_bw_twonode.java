package Tree;
//    Minimum distance beetwen two given nodes
public class Min_dis_bw_twonode {
    static Node Lca(Node root, Node p, Node q) {
        if (root == null)
            return null;
        if (p == q)
            return p;
        if (p == root || q == root)
            return root;
        Node l = Lca(root.left, p, q);
        Node r = Lca(root.right, p, q);
        if (l != null && r != null)
            return root;
        return (l == null) ? r : l;
    }
   static int dis=0;
    static int mindis(Node root, Node p, Node q ){
           Node lca = Lca(root, p, q);
           dfs(lca,p,q,0);
           return dis;
          
    }
    private static void dfs(Node root, Node p, Node q, int i) {
        if(root==null) return ;
        if(root==p){
            dis += i;
            return;
        } 
        if(root==q){
             dis+=i;
             return ;
        }
        dfs(root.left, p, q, i+1);
        dfs(root.right, p, q, i + 1);
    }

    static int len(Node root,Node check ,int len) {
        if(root==null) return 0;
        if (root==check) return ++len;
        len(root.left, check, len++);
        len(root.right, check, len++);
        return len;
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
        System.out.println(mindis(root,c,e));
    }
}
