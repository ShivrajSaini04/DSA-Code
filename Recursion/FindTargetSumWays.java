package Recursion;

public class FindTargetSumWays {
    
    public int findTargetSumWays(int[] nums, int target) {
        return helper(0, target, nums);
    }

    private int helper(int i, int sum, int[] nums) {
        if (i == nums.length){
            if ( sum == 0) return 1;
            else return 0;
        }
        int add = helper(i+1, sum - nums[i], nums);
        int subtract = helper(i + 1, sum + nums[i], nums);
        return add + subtract;
    }

}
