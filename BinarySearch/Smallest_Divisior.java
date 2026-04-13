package BinarySearch;

public class Smallest_Divisior {
    
    int smallestDivisor(int[] arr, int k) {
        // Code here
        int max = -1;
        for (int ele : arr)
            max = Math.max(max, ele);
        int low = 1, high = max;
        int speed = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (divisior(mid, arr, k) <= k) {
                speed = mid;
                high = mid - 1;
            } else
                low = mid + 1;
        }
        return speed;
    }

    long divisior(int mid, int[] arr, int k) {
        long div = 0;
        for (int ele : arr) {
            if (ele % mid == 0)
                div += ele / mid;
            else
                div += (ele / mid + 1);
        }
        return div;
    }
}
