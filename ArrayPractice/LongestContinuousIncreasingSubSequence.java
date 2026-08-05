public class LongestContinuousIncreasingSubSequence {

    public static  int findLengthOfLCIS(int[] nums) {
        int max = 1;
        int count = 1;
        int n = nums.length;
        if (n <= 1)
            return n;
        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[i - 1])
                count++;
            else
                count = 1;
            max = Math.max(max, count);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,3,6,7,8,9,0,8};
        System.out.println(findLengthOfLCIS(arr));
    }
}
