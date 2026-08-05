public class Shuffle_Array {

    public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];
        int idx = 0;

        for (int i = 0; i < n; i++) {
            ans[idx++] = nums[i];
            ans[idx++] = nums[i + n];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 6, 3, 4, 2, 7 };
        System.out.println("hello");
        int[] res = shuffle(arr, arr.length / 2);
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length / 2)
                System.out.print(" -  ");
            System.out.print(res[i] + " ");
        }

    }
}
