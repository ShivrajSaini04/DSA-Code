package HashmapAndHashset;

import java.util.ArrayList;
import java.util.HashMap;

public class array_duplicate {
    private static ArrayList<Integer>  duplicate(int[] arr) {
       ArrayList<Integer> list = new ArrayList<>();
       HashMap<Integer , Integer> map = new HashMap<>();
       for (int i=0;i<arr.length;i++){
        if (map.containsKey(arr[i])) map.put(arr[i], map.get(arr[i])+1);
        else map.put(arr[i], 1);
       }
       for (int i=0;i<arr.length;i++){
        if (map.get(arr[i])>=2) {
            list.add(arr[i]);
            map.remove(arr[i]);
        } 
       }
       return list;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,1,3,4,5,6,6,7,2};
        System.out.println(duplicate(arr));
    }

    
}
