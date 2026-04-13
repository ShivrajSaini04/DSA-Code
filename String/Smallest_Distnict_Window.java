import java.util.HashMap;
import java.util.HashSet;

public class Smallest_Distnict_Window {

    public int findSubString(String str) {
        // code here
        int n = str.length();
        HashSet<Character> set = new HashSet<>();
        for (char ch : str.toCharArray()) {
            set.add(ch);
        }
        int k = set.size();
        int length = Integer.MAX_VALUE;
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0, j = 0;
        while (j < n) {
            char ch = str.charAt(j);

            if (map.containsKey(ch))
                map.put(ch, map.get(ch) + 1);
            else
                map.put(ch, 1);

            while (map.size() == k) {
                length = Math.min(length, j - i + 1);

                char key = str.charAt(i);
                map.put(key, map.get(key) - 1);

                if (map.get(key) == 0)
                    map.remove(key);
                i++;
            }

            j++;
        }
        return length;
    }
   

}