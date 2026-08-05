package Tree;

import java.util.List;
import java.util.ArrayList;

//class Zig { // Like Snake Traversal
//     int height(Node root) {
//         if (root == null || (root.left == null && root.right == null))
//             return 0;
//         return 1 + Math.max(height(root.left), height(root.right));
//     }

//     void nthLevel(Node root, int n, List<Integer> list) {
//         if (root == null)
//             return;
//         if (n == 1) {
//             list.add(root.data);
//             return;
//         }
//         nthLevel(root.left, n - 1, list);
//         nthLevel(root.right, n - 1, list);
//     }

//     void nthLevel2(Node root, int n, List<Integer> list) {
//         if (root == null)
//             return;
//         if (n == 1) {
//             list.add(root.data);
//             return;
//         }
//         nthLevel2(root.right, n - 1, list);
//         nthLevel2(root.left, n - 1, list);
//     }

//     // Main Function Of Logic
//     public List<List<Integer>> Zig(Node root) {
//         List<List<Integer>> ans = new ArrayList<>();
//         int len = height(root) + 1;
//         for (int i = 1; i <= len; i++) {
//             List<Integer> list = new ArrayList<>();
//             if (i % 2 != 0)
//                 nthLevel(root, i, list);
//             else
//                 nthLevel2(root, i, list);
//             ans.add(list);
//         }
//         return ans;

//     }
// }


public class ZigzagOrderTrav_BT {

// optimal apporach 

  static ArrayList<Integer> list = new ArrayList<>();

static ArrayList<Integer> boundaryTraversal(Node root) {
    // code here
    if (root.left != null || root.right != null)
        list.add(root.data);
    if (root.left != null)
        leftBoundary(root.left);
    bottomBoundary(root);
    if (root.right != null)
        rightBoundary(root.right);
    return list;
}

static void leftBoundary(Node root) {
    if (root.left == null && root.right == null)
        return;
    list.add(root.data);
    if (root.left == null)
        leftBoundary(root.right);
    else
        leftBoundary(root.left);
}

static void bottomBoundary(Node root) {
    if (root == null)
        return;
    if (root.left == null && root.right == null)
        list.add(root.data);

    bottomBoundary(root.left);
    bottomBoundary(root.right);
}

static void rightBoundary(Node root) {
    if (root.left == null && root.right == null)
        return;
    if (root.right == null)
        rightBoundary(root.left);
    else
        rightBoundary(root.right);
    list.add(root.data);
}

            // main function
    public static void main(String[] args) {
        // Zig z = new Zig();
        // tree tr = new tree();
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

        System.out.println(boundaryTraversal(root));
    }
}

class Node{
    Node left;
    Node right;
    int data;
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}