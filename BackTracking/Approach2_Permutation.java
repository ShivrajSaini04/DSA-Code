import java.util.ArrayList;
import java.util.List;

public class Approach2_Permutation {
    public static List<List<Integer>> permuta(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(arr, 0, ans);
        return ans;
    }

    public static void helper(int[] arr, int idx, List<List<Integer>> ans) {
        if (idx == arr.length - 1) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                list.add(arr[i]);
            }
            ans.add(list);
            return;
        }
        for (int i = idx; i < arr.length; i++) {
            swap(i, idx, arr);
            helper(arr, idx + 1, ans);
            // Backtracking
            swap(i, idx, arr);
        }
    }

    public static void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };

        List<List<Integer>> list3 = permuta(arr);
        System.out.println(list3.size());
        for (int i = 0; i < list3.size(); i++) {
            System.out.print(list3.get(i) + " ");
        }
    }
}
