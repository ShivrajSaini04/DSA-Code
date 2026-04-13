package BinarySearch;

public class Koko_Banana {
    
    public int minEatingSpeed(int[] piles, int h) {
        int max = -1;
        for (int ele : piles)
            max = Math.max(max, ele);
        int low = 1, high = max;
        int speed = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (hours(mid, piles, h) <= h) {
                speed = mid;
                high = mid - 1;
            } else
                low = mid + 1;
        }
        return speed;
    }

    long hours(int mid, int[] arr, int h) {
        long hour = 0;
        for (int ele : arr) {
            if (ele % mid == 0)
                hour += ele / mid;
            else
                hour += (ele / mid + 1);
        }
        return hour;
    }
}
