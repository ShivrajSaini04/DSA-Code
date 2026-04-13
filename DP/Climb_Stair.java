package DP;

public class Climb_Stair {
    
    // memoization solution of this problem
    // we can't apply only recurssion because tle for (45)

    static int[] dp;

    public static  int climbStairs(int n) {
        dp = new int[n + 1];
        return counter(n);
    }

    public static int counter(int n) {
        if (n <= 2)
            return n;
        if (dp[n] != 0)
            return dp[n];
        return dp[n] = counter(n - 1) + counter(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(6));
    }
}
