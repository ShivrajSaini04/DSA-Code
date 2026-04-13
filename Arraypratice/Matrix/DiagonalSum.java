package Matrix;
public class DiagonalSum {
  public static int diagonalSum(int[][] mat) {
    int rig = 0;
    int left = 0;
    int n = mat.length;
    for (int i = 0; i < mat.length; i++) {
      left += mat[i][i];
      rig += mat[i][n - 1 - i];
    }
    // for odd matrix
    if (mat.length % 2 != 0) {
      rig -= mat[n / 2][n / 2];
    }
    return (rig + left);
  }

  public static void main(String[] args) {
    int arr[][] = { { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 } };
    System.out.println(diagonalSum(arr));
  }
}
