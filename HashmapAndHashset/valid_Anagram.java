package HashmapAndHashset;

import java.text.CharacterIterator;
import java.util.HashMap;

public class valid_Anagram {
    static boolean valid(String str , String str2){
         HashMap<Character, Integer> map = new HashMap<>();
         for (char ch : str.toCharArray()){
           if (map.containsKey(ch)){
            map.put(ch, map.get(ch)+1);
           }
           else map.put(ch, 1);
         }

         for (char ch : str2.toCharArray()){
            if (!map.containsKey(ch)) return false ;
            int freq = map.get(ch);
            if (freq <= 0 )  return false ;
            map.put(ch, freq-1);
         }
         return true ;
    }
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
      System.out.println(valid(s, t));
    }
}
