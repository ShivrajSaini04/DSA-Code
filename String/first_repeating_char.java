import java.util.HashSet;

public class first_repeating_char {

     public static char repeatedCharacter(String str) {
        HashSet<Character> set = new HashSet<>();
        //  HashMap<Character, Integer> map = new HashMap<>();
         for (char ch : str.toCharArray()){
        //    if (map.containsKey) return ch;
           //else map.put(ch, 1);
         if (set.contains(ch)) return ch;
         else  set.add(ch);
         }
         return ' ';
    }
    public static void main(String[] args) {
        String str = "leetcode";
        System.out.println(repeatedCharacter(str));
    }
}
