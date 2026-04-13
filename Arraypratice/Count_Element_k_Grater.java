import java.util.Arrays;

// Count Element with at least k greater value (Leetcode )

public class Count_Element_k_Grater {

    public static int count_ele(int[] arr, int k) {
        int count = 0;
        int n = arr.length;
        if (n == 0 || k > n || k < 0)
            return 0;
        if (k == 0)
            return n;
        Arrays.sort(arr);
        for (int ele : arr) {
            if (ele < arr[n - k])
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 2 };
        int k = 1;
        System.out.println(count_ele(arr, k));
    }
}
