public class Rotete_Sorted_Array {
    static int search(int[] arr, int tar) {
        int left = 0, rig = arr.length - 1;
        while (left <= rig) {
            int mid = (left + rig) / 2;
            if (arr[mid] == tar)
                return mid;
            else if (arr[mid] >= arr[left]) {
                if (arr[left] <= tar && arr[mid] > tar)
                    rig = mid - 1;
                else
                    left = mid + 1;
            } else {
                if (arr[mid] < tar && arr[rig] >= tar)
                    left = mid + 1;
                else
                    rig = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        int tar = 0;
        System.out.println(search(arr, tar));
    }
}
