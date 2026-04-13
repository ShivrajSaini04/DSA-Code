package DP;

import java.util.Arrays;

public class KnapSack_Zero_One {

    static int[][] dp ;

    public static  int knapsack(int w, int val[], int weight[]) {
        dp = new int[val.length][w+1];
         Arrays.fill(dp, -1);
        return helper(0 , w ,val , weight);

    }
    private static int helper(int i, int w, int[] val, int[] weight) {
        if (i>=val.length) return 0;
        if (dp[i][w]!=-1) return dp[i][w];
         int skip = helper(i + 1, w , val, weight);
         if ( weight[i] > w)  return dp[i][w] = skip;
        int pick = val[i] + helper(i+1, w-weight[i], val, weight);
        return dp[i][w] = Math.max(pick, skip);
    }
    public static void main(String[] args) {
        
    }
}
