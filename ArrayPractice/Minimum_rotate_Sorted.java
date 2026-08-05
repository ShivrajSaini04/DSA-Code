public class Minimum_rotate_Sorted {
    static int minimum(int[] arr) {
        int left = 0, rig = arr.length - 1;
        while (left <= rig) {
            int mid = (left + rig) / 2;
            if (arr[left] > arr[rig] && arr[mid] >= arr[left])
                left = mid + 1;
            else
                rig = mid - 1;

        }
        return arr[left];
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 4, 5, 6, 7 };
        System.out.println(minimum(arr));
    }
}
