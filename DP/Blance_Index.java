package DP;

public class Blance_Index {
    public int smallestBalancedIndex(int[] nums) {
        int n = nums.length;
        if (n <= 1)
            return -1;
        long[] dp = new long[n + 1];
        dp[n] = 1;
        for (int j = n - 1; j >= 0; j--) {
            if (dp[j + 1] == -1)
                dp[j] = -1;
            else if (dp[j + 1] > Long.MAX_VALUE / nums[j])
                dp[j] = -1;
            else
                dp[j] = nums[j] * dp[j + 1];

        }

        long sum = 0;
        int idx = -1;
        for (int i = 0; i < n; i++) {
            long left = sum;
            if (dp[i + 1] != -1 && left == dp[i + 1])
                return i;
            sum += nums[i];
        }

        return idx;
    }
}
