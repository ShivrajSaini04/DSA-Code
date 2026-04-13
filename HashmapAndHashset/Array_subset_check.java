package HashmapAndHashset;

import java.util.HashMap;

public class Array_subset_check {

     static boolean isSubset(int[] a, int[] b) {
         HashMap<Integer, Integer> map = new HashMap<>();
         HashMap<Integer, Integer> map2 = new HashMap<>();
         for (int ele : a) {
             if (map.containsKey(ele)) {
                 map.put(ele, map.get(ele) + 1);
             } else
                 map.put(ele, 1);
         }
         for (int ele : b){
            if (!map.containsKey(ele)) return false ;
            int freq = map.get(ele);
            if (freq <= 0 ) return false ;
            map.put(ele,freq-1);
         }
          
         return true;

        //  for (int ele : b) {
        //      if (!map.containsKey(ele))
        //          return false;
        //      if (map2.containsKey(ele)) {
        //          map2.put(ele, map2.get(ele) + 1);
        //      } else
        //          map2.put(ele, 1);
        //  }
        //  for (int ele : b) {
        //      if (map.get(ele) != 0 && map.get(ele) < map2.get(ele))
        //          return false;
        //  }
         //
        //  return true;
    }
    

    public static void main(String[] args) {
        int[] a= { 2, 1, 4, 6, 7, 9, 4, 0, 3, 5, 4 };
        int [] b = {2,1,4,6,7,9,2,4,0,3,5,4};
        System.out.println(isSubset(a,b));
    }
 
}
