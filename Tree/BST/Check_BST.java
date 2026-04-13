package Tree.BST;

class Pair{
    int min;
    int max;
     Pair(int max , int min){
        this.max=max;
        this.min=min;
    }
}
public class Check_BST {
    static boolean flag ;
    static boolean checkBST(Node root){
        flag = true;
        check(root);
       return flag;
    }
    static Pair  check(Node root){
          if (root==null ) return new Pair(Integer.MIN_VALUE, Integer.MAX_VALUE) ;
          int data = root.data;
        Pair lst =  check(root.left);
        Pair rst = check(root.right);
        int max = Math.max(data, Math.max(lst.max, rst.max));
        int min = Math.min(data, Math.min(lst.min, rst.min));
        if (rst.min <= data || lst.max >= data ) flag = false;
        return new Pair(max, min);
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
        System.out.println(checkBST(root));
    }
}
