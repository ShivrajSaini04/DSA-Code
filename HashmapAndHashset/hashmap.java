package HashmapAndHashset;

import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        HashMap <Integer,Integer> map=new HashMap<>();
        map.put(5,5);
        map.put(1,2);
        map.put(2,3);
        map.put(4,4);
       // map.remove(2);
        System.out.println(map);
        map.put(3,3 );
          System.out.println(map);
    }
}
