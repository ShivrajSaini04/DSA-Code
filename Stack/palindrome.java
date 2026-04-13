public class palindrome {
    public static boolean isPalindrome(String s) {
        if (s.length() == 0 || s.length() == 1)
            return true;
        String str = "";
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 48 && 57 >= ch) {
                str += ch;
            } else if (ch >= 'a' && ch <= 'z')
                str += ch;
        }
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "0P";
        System.out.println(isPalindrome(s));
    }
}
