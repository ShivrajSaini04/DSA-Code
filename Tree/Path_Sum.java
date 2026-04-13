package Tree;

public class Path_Sum {
    public static boolean hasPathSum(Node root, int tarSum) {
        if (root == null)
            return false;
        if (root != null && root.left == null && root.right == null) {
            if (root.data == tarSum)
                return true;
        }
        return hasPathSum(root.left, tarSum - root.data) || hasPathSum(root.right, tarSum - root.data);

    }

    public static void main(String[] args) {

    }
}
