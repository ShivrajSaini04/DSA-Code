import java.util.ArrayList;
import java.util.HashSet;

public class Missing_Element_Range {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
        ArrayList<Integer> list = new ArrayList<>();
      list=  missing(arr, list, 2, 8);
      System.out.println(list);
    }

    private static ArrayList<Integer> missing(int[] arr,ArrayList<Integer> list, int low , int high) {
        HashSet<Integer> set = new HashSet<>();
       for (int ele : arr) set.add(ele);
       for (int i=low;i<=high;i++){
        if (!set.contains(i)) list.add(i);
       }
       return list;
    }
}
