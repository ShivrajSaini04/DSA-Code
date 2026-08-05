public class merge_string_alternetely {

    public String mergeAlternately(String word1, String word2) {
        StringBuilder str = new StringBuilder();
        int idx = 0;
        int i = 0, j = 0;
        while (i < word1.length() && j < word2.length()) {
            if (idx % 2 == 0)
                str.append(word1.charAt(i++));
            else
                str.append(word2.charAt(j++));
            idx++;
        }
        while (i < word1.length()) {
            str.append(word1.charAt(i++));
        }
        while (j < word2.length()) {
            str.append(word2.charAt(j++));
        }
        return str.toString();
    }

    public static void main(String[] args) {
        
    }
}