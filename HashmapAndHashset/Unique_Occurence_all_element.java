

import java.util.HashMap;
import java.util.HashSet;

public class Unique_Occurence_all_element {

    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for(int ele:arr) map.put(ele, map.getOrDefault(ele, 0)+1);
        for(int ele :  map.keySet() ){
            int freq = map.get(ele);
            if (set.contains(freq)) return false;
            else set.add(freq);
        }
        return true;
    }

    public static void main(String[] args) {
        int []arr = {1 ,2,2,3,2,3};
        System.out.println(uniqueOccurrences(arr));
    }
}
