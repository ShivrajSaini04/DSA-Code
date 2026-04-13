package DP;

import java.util.Arrays;

public class Min_Cost_Climb_Stairs {
    static int[] dp;
    static int minCostClimbingStairs(int[] cost) {
        // Write your code here
         dp = new int[cost.length];
        Arrays.fill(dp, Integer.MIN_VALUE);
         climbstairs(0 , cost);
         return Math.min(dp[0], dp[1]);

    }     
    
    private static int climbstairs(int i, int[] arr) {
        if (i >= arr.length)
            return 0;
        if (dp[i] != Integer.MIN_VALUE)
            return dp[i];
        dp[i] =  arr[i] + Math.min(climbstairs(i + 1, arr), climbstairs(i + 2, arr));
        return dp[i];
    }
    public static void main(String[] args) {
        
    }
}
