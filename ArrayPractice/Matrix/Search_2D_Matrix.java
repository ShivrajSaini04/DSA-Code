package Matrix;

public class Search_2D_Matrix {
    
    // search in 2D matrix
    static boolean search(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int low = 0, high = row * col - 1;
        while (low <= high) {
            int mid = (low + high) / 2;

            int rowMid = mid / col;
            int colMid = mid % col;

            if (matrix[rowMid][colMid] == target)
                return true;
            else if (matrix[rowMid][colMid] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return false;
    }

    public static void main(String[] args) {
        int mat[][] = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
        int n = mat.length;
        System.out.println(search(mat, 13));
    }
}
