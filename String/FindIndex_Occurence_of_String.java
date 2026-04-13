
public class FindIndex_Occurence_of_String {

    public static int strStr(String haystack, String needle) {
        if (haystack.equals(needle))
            return 0;
        int n = haystack.length();
        int k = needle.length();
        for (int i = 0; i <= n - k; i++) {
            String str = haystack.substring(i, i + k);
            if (str.equals(needle))
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String str = "leetcode";
        String comp = "code";
        System.out.println(strStr(str , comp));
    }
}
