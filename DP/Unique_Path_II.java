package DP;

public class Unique_Path_II {
    
    static int[][] dp;

    private static  int paths(int m, int n, int[][] grid) {
        // recursion + memoization solution
        if (m < 0 || n < 0)
            return 0;
        if (grid[m][n] == 1)
            return 0;
        if (m == 0 && n == 0)
            return 1;
        if (dp[m][n] != -1)
            return dp[m][n];
        return dp[m][n] = paths(m - 1, n, grid) + paths(m, n - 1, grid);
    }

    public static int uniquePaths(int[][] grid) {
        // code here
        int m = grid.length;
        int n = grid[0].length;
        dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }
        return (paths(m - 1, n - 1, grid));
    }

    // // Tabulation solution
    // public int uniquePaths(int[][] grid) {
    //     int m = grid.length;
    //     int n = grid[0].length;
    //     dp = new int[m][n];
    //     for (int i = 0; i < m; i++) {
    //         for (int j = 0; j < n; j++) {
    //             dp[i][j] = -1;
    //         }
    //     }

    //     for (int i = 0; i < m; i++) {
    //         for (int j = 0; j < n; j++) {
    //             if (grid[i][j] == 1)
    //                 dp[i][j] = 0;
    //             else if (i == 0 && j == 0)
    //                 dp[i][j] = 1;
    //             else {
    //                 int up = 0, left = 0;
    //                 if (i > 0)
    //                     up = dp[i - 1][j];
    //                 if (j > 0)
    //                     left = dp[i][j - 1];
    //                 dp[i][j] = up + left;
    //             }
    //         }
    //     }

    //     return dp[m - 1][n - 1];
    // }

    public static void main(String[] args) {
        int[][] grid = { {0,0,0} , {0,1,0} , {0,0,0}};
         System.out.println(uniquePaths(grid));
    }
}
