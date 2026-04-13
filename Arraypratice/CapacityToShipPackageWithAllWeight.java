public class CapacityToShipPackageWithAllWeight {
    
    public static int shipWithinDays(int[] arr, int day) {
        int n = arr.length;
        int total = 0;
        int max = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            total += arr[i];
            max = Math.max(max, arr[i]);
        }
        int low = max, high = total;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (days(mid, arr) <= day) {
                high = mid - 1;
                ans = mid;
            } else
                low = mid + 1;
        }
        return ans;
    }

    public static int days(int capacity, int[] arr) {
        int days = 1;
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (sum + arr[i] > capacity) {
                sum = 0;
                days++;
            }
            sum += arr[i];
        }
        return days;
    }

}
