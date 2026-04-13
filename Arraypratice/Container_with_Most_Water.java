public class Container_with_Most_Water {
    public static int[] mostwater(int arr[]) {
        int idx[] = new int[3];
        int i = 0, j = arr.length - 1;
        int min = 0, area = 0, len = 0, max = 0;
        while (i < j) {
            min = Math.min(arr[i], arr[j]);
            len = j - i;
            area = min * len; // using formula of reactangle
            if (area > max) {
                max = area;
                idx[0] = i;
                idx[1] = j;
                idx[2] = area;
            }
            if (arr[i] <= arr[j])
                i++;
            else
                j--;
        }
        return idx;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 6, 3, 4, 2 };
        System.out.println("hello");
        int[] res = mostwater(arr);
        for (int i : res) {
            System.out.print(i + " ");
        }

    }
}
