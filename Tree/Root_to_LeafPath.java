package Tree;

import java.util.ArrayList;

public class Root_to_LeafPath {
    public static ArrayList<ArrayList<Integer>> RTL(Node root){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
         ArrayList<Integer> list = new ArrayList<>();
        hepler(root,list,ans );
        return ans;
    }
       static void hepler(Node root,ArrayList<Integer> list , ArrayList<ArrayList<Integer>> ans) {
        if (root==null) return ;
        if (root.left==null && root.right==null){
            list.add(root.data);
            ans.add(new ArrayList<>(list));
            list.remove(list.size() - 1);
            return;
        }
        list.add(root.data);
        hepler(root.left,list, ans);
        hepler(root.right,list, ans);
        list.remove(list.size() - 1);
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
        System.out.println(RTL(root));
     }
    
}
