import java.util.HashSet;

public class Find_Distnict_ele {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
        System.out.println(distnictele(arr));
    }

    private static int distnictele(int[] arr) {
       HashSet<Integer> set = new HashSet<>();
       for (int ele : arr) set.add(ele);
       return set.size();
    }
}
