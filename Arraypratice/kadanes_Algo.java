public class kadanes_Algo {
    // Maximum Subarray Sum Using Kadane's Algorithum
    public static int fun(int arr[]) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { -3, -6, -6, -7, 0, -3, -7, -9 };
        System.out.println(fun(arr));
    }
}
