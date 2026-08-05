public class Concatenation_array {
    public static  int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] res = new int[2 * n];
        for (int i = 0; i < n; i++) {
            res[i] = nums[i];
            res[i + n] = nums[i];
        }
        return res;
    }
    public static void main(String[] args) {  // store singal array two times 
        int[] arr = { 1, 2, 5, 6, 3, 4, 2 };
        System.out.println("hello");
        int[] res = getConcatenation(arr);
        for (int i : res) {
            System.out.print(i + " ");
        }

    }
}
