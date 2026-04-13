package DP;

public class NumberOf_Paths {
     static int[][] dp ;
    public static int uniquePaths(int m, int n) {
       dp = new int[m][n];
       return (paths(m-1,n-1));
    }
    
    private static int paths(int m, int n) {
        if (m == 0 || n == 0)
            return 1;
        if (dp[m][n] != 0)
            return dp[m][n];
        return dp[m][n] = paths(m - 1, n) + paths(m, n - 1);
    }

    public static void main(String[] args) {
        System.out.println(uniquePaths(3, 3));
    }
}
