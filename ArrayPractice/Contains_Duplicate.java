import java.util.HashMap;
import java.util.HashSet;

public class Contains_Duplicate {
    public static  boolean containsDuplicate(int[] nums) {
        // HashMap<Integer,Integer> map = new HashMap<>();
        // for (int ele : nums){
        //     if (map.containsKey(ele)) map.put(ele, map.get(ele)+1);
        //    else  map.put(ele, 1);
        // }
        // for (int key : map.keySet()){
        //     if (map.get(key) >= 2) return true;
        // }
        // return false;

        HashSet<Integer> set = new HashSet<>();
        for (int ele:nums){
            if(set.contains(ele)) return true;
            else set.add(ele);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
        System.out.println(containsDuplicate(arr));
    }
}
