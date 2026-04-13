package DP;

public class FindTargetSumWays {
    static int total;
    static int[][] dp;

    public int findTargetSumWays(int[] nums, int target) {
        total = 0;
        for (int ele : nums)
            total += ele;
        dp = new int[nums.length][2 * total + 1];
        return helper(0, 0, target, nums);
    }

    private int helper(int i, int sum, int target, int[] nums) {
        if (i == nums.length) {
            if (sum == target)
                return 1;
            else
                return 0;
        }
        if (dp[i][sum + total] != 0)
            return dp[i][sum + total];
        int add = helper(i + 1, sum + nums[i], target, nums);
        int subtract = helper(i + 1, sum - nums[i], target, nums);
        return dp[i][sum + total] = add + subtract;
    }
}
