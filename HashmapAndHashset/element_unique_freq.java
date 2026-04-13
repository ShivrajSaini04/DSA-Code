package HashmapAndHashset;

import java.util.HashMap;
import java.util.Map;

public class element_unique_freq {
       
      public static int firstUniqueFreq(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
       for (int i =0 ;i<nums.length;i++){
          int key = nums[i];
          if (map.containsKey(key)){
             int freq = map.get(nums[i]);
             map.put(key, freq+1);
          }
          else  map.put(key, 1);
    }
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int value : map.values()) {
            
            if (freqMap.containsKey(value)) {
                int old = freqMap.get(value);
                freqMap.put(value, old + 1);
            } else {
                freqMap.put(value, 1);
            }
        } 
         for (int i = 0; i < nums.length; i++) {
            
            int frequency = map.get(nums[i]);

            if (freqMap.get(frequency) == 1) {
                return nums[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
         int arr [] = {20,10,30,30};
         System.out.println(firstUniqueFreq(arr));
    }
}