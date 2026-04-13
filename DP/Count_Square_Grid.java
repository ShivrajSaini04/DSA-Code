package DP;

public class Count_Square_Grid {
    public static int countSquares(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int count = 0;
        // for first row square 
        for (int j = 0; j < m; j++) {
            if (arr[0][j] != 0)
                count++;
        }
        // pahle col ke square ke liye 
        for (int i = 1; i < n; i++) {
            if (arr[i][0] != 0)
                count++;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (arr[i][j] != 0) {
                    arr[i][j] = arr[i][j] + Math.min(arr[i - 1][j - 1], Math.min(arr[i - 1][j], arr[i][j - 1]));
                    count += arr[i][j];
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[][] = { {0,1,1,1},
                       {1,1,1,1},
                      {0,1,1,1}  };
  System.out.println(countSquares(arr));
    }
}
