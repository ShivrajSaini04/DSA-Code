public class Two_FurtestHousesWithDiffrentColour {
    
    // Leetcode 2078

    public static int maxDistance(int[] nums) {
        int ans = 0;
        int n = nums.length;
        // here fix of j
        for (int i = 0; i < n; i++) {
            if (nums[i] != nums[n - 1])
                ans = Math.max(ans, n - 1 - i);
        }
        // here fix of i
        for (int j = n - 1; j >= 0; j--) {
            if (nums[0] != nums[j])
                ans = Math.max(ans, j);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr ={1,1,1,1,5,1,11,1,};
        System.out.println(maxDistance(arr));
    }
}
