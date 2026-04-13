import java.util.HashSet;

public class Longest_SubString_len {

    static int longestsubstring(String str) {
        HashSet<Character> set = new HashSet<>(); // without repeating character substring length
        int i = 0;
        int j = 0;
        int max = 0;
        int n = str.length();
        while (i < n && j < n) {
            char ch = str.charAt(j);

            if (!set.contains(ch)) {
                set.add(ch);
                max = Math.max(max, (j - i) + 1);
            } else {
                while (str.charAt(i) != ch) {
                    char pre = str.charAt(i);
                    set.remove(pre);
                    i++;
                }
                i++;
            }
            j++;
        }
        return max;
    }

    public static void main(String[] args) {
        String str = "shivasaini";
        System.out.println(longestsubstring(str));
    }

}
