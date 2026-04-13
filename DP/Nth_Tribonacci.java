package DP;

public class Nth_Tribonacci {
    
    public static  int tribonacci(int n) {
        if (n <= 1)
            return n;
        if (n <= 3)
            return n - 1;
        int[] dp = new int[4];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            dp[3] = dp[0] + dp[1] + dp[2];
            dp[0] = dp[1];
            dp[1] = dp[2];
            dp[2] = dp[3];
        }
        return dp[3];
    }

    public static void main(String[] args) {
        System.out.println(tribonacci(40));
    }
}
