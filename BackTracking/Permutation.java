import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static List<List<Integer>> permuta(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        boolean check[] = new boolean[arr.length];
        helper(arr, list, check, ans);
        return ans;
    }

    public static void helper(int[] arr, ArrayList<Integer> list, boolean check[], List<List<Integer>> ans) {
        if (list.size() == arr.length) {
            ArrayList<Integer> list2 = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
                list2.add(list.get(i));
            }
            ans.add(list2);
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (check[i] == false) {
                list.add(arr[i]);
                check[i] = true;
                helper(arr, list, check, ans);
                check[i] = false;
                list.remove(list.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };

        List<List<Integer>> list3 = permuta(arr);
        for (int i = 0; i < list3.size(); i++) {
            System.out.print(list3.get(i) + " ");
        }
    }
}
