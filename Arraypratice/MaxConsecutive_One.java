public class MaxConsecutive_One {
    public static int count_one(int arr[]) {
        int n = arr.length, count = 0;
        int max = -1, i = 0;
        while (i < n) {
            if (arr[i] == 1) {
                count++;
                i++;
            } else {
                count = 0;
                i++;
            }
            max = Math.max(max, count);
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1 };
        System.out.println(count_one(arr));
    }
}
