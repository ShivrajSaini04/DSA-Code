public class Max_Sum_Subaaray_k {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int currsum = 0;
        int i = 0, j = 0;
        while (j < n) {
            currsum += arr[j];
            if ((j - i + 1) == k) {
                max = Math.max(currsum, max);
                currsum -= arr[i];
                i++;
            }
            j++;
        }
        return max;
    }
}
