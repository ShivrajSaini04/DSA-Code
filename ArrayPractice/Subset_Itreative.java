import java.util.ArrayList;

public class Subset_Itreative {
    static ArrayList<ArrayList<Integer>> subsets(int[] arr) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>()); // empty subset add karo

        for (int i = 0; i < arr.length; i++) {
            int size = ans.size(); // current subsets ka size
            for (int j = 0; j < size; j++) {
                ArrayList<Integer> list = new ArrayList<>(ans.get(j));
                list.add(arr[i]);
                ans.add(list);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 2 };
        System.out.println(subsets(arr));
    }
}
