public class Len_Last_word {
    public static int wordlen(String str) {
        int n = str.length();
        if (n == 0)
            return 0;
        // str += " ";
        String res = "";
        int len = 0;
        // left to right travel
        // Time complexity 0(n) (where n = length of the given sentence)
        // for (int i = 0; i <= n; i++) {
        // char ch = str.charAt(i);
        // if (ch == ' ') {
        // if (res.length()>0){
        // len = res.length();
        // res = "";
        // }
        // } else
        // res += ch;
        // }

        // right to left Travel
        // Time complexity 0(n) (where n = length of last word of the given sentence)
        for (int i = n - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                if (len > 0) {
                    return len;
                }
            } else
                len++;
        }
        return 0;
    }

    public static void main(String[] args) {
        String str = "Let's take LeetCode contest";
        System.out.println(wordlen(str));
    }
}
