import java.util.HashMap;

    class LRUCache {
    static HashMap<Integer,Integer> map;
    static int size ;
    static int recentkey;
    public LRUCache(int capacity) {
        size = capacity;
    }
    // wrong code 
    public int get(int key) {
        if (size>0) {
            size--;
            recentkey = key;
            return map.get(key);
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if (map.size()==size) map.remove(recentkey);
       map.put(key,value);
    }
}

