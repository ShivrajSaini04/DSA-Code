package DP;

import java.util.Arrays;

public class Stickler_Theif {
    static int[] dp;

    public int findMaxSum(int arr[]) {
        // code here
        dp = new int[arr.length];
        Arrays.fill(dp, Integer.MIN_VALUE);
        return rober(0 , arr);
    }

    private static int rober(int i, int[] arr) {
         if (i>=arr.length) return 0;
         if ( dp[i] != Integer.MIN_VALUE) return dp[i];
         int picker = arr[i] + rober(i+2, arr);
         int skip = rober(i+1, arr);
         int ans = Math.max(picker, skip);
         dp[i] = ans;
         return ans;
    }
}
