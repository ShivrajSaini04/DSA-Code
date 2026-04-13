package Tree;

import java.util.ArrayList;

public class Flatten_BT_Link_L {
        
        static Node flatten(Node root){
            if(root==null) return null;
            ArrayList<Node> list=new ArrayList<>();
            dfs(root,list);
           for(int i=0;i<list.size()-1;i++){
            Node a = list.get(i);
            Node b= list.get(i+1);
            a.right=b;
            a.left=null;
           }
           Node last = list.get(list.size()-1);
           last.left=null;
           last.right=null;
            return root;
        }

    private static void dfs(Node root, ArrayList<Node> list) {
            if(root==null) return ;
            list.add(root);
            dfs(root.left, list);
            dfs(root.right, list);
        }

    public static void main(String[] args) {
        
    }
}