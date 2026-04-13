package Matrix;

public class Set_Matrix_Zero {

    public static void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        boolean row = false;
        boolean col = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 && matrix[i][j] == 0)
                    row = true;
                if (j == 0 && matrix[i][j] == 0)
                    col = true;
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        int idx = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[idx][j] == 0)
                    matrix[i][j] = 0;
                if (matrix[i][idx] == 0)
                    matrix[i][j] = 0;
            }
        }
        if (row == true) {
            for (int j = 0; j < m; j++)
                matrix[0][j] = 0;
        }
        if (col == true) {
            for (int i = 0; i < n; i++)   
                matrix[i][0] = 0;
        }
    }
    public static void main(String[] args) {
        int mat[][] = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1} };
        int n = mat.length;
        setZeroes(mat);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
