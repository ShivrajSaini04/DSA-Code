import java.util.HashMap;

public class non_repeating_char {
    

    public static int firstUniqChar(String str) {
          HashMap<Character, Integer> map = new HashMap<>();
         for (char ch : str.toCharArray()){
           if (map.containsKey(ch)){
            map.put(ch, map.get(ch)+1);
           }
           else map.put(ch, 1);
         }
         for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if (map.get(ch)==1) return i;
         }
          return -1;
    }
    public static void main(String[] args) {
        String str = "geekforgeeks";
        System.out.println(firstUniqChar(str));
    }
}
