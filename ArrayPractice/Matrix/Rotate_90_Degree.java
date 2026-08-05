package ArrayPractice.Matrix;

public class Rotate_90_Degree {
    public void rotate(int[][] matrix) {
        transpose(matrix);
        reversRow(matrix);
    }

    public void reversRow(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            int k = 0, j = n - 1;
            while (k < j) {
                int temp = matrix[i][k];
                matrix[i][k] = matrix[i][j];
                matrix[i][j] = temp;
                k++;
                j--;
            }
        }
    }

    public void transpose(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    } 
}
