package DP;
public class Shorted_Common_SuperSeqence_LOength {
        public static String shortestCommonSupersequence(String str1, String str2) {
            String str = minSuperSeq(str1, str2);
            int n = str1.length();
            int m = str2.length();
            int i = 0, j = 0, k = 0;
            StringBuilder ans = new StringBuilder();
            while (k < str.length()) {
                char ch = str.charAt(k);
                while (ch != str1.charAt(i)) {
                    ans.append(str1.charAt(i));
                    i++;
                }
                while (ch != str2.charAt(j)) {
                    ans.append(str2.charAt(j));
                    j++;
                }
                ans.append(ch);
                i++;
                j++;
                k++;
            }
            if (i < n) {
                while (i < n) {
                    ans.append(str1.charAt(i));
                    i++;
                }
            }
            if (j < m) {
                while (j < m) {
                    ans.append(str2.charAt(j));
                    j++;
                }
            }
            return new String(ans);
     }
        public static  String minSuperSeq(String s1, String s2) {
            // we can use tabulation for optimize solution
            int n = s1.length(), m = s2.length();
            int[][] dp = new int[n + 1][m + 1];
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    if (s1.charAt(i - 1) == s2.charAt(j - 1))
                        dp[i][j] = 1 + dp[i - 1][j - 1];
                    else
                        dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
            String str = "";
            int i = n, j = m;
            while (i > 0 && j > 0) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    if (s1.charAt(i - 1) == s2.charAt(j - 1))
                        str = s1.charAt(i - 1) + str;
                    j--;
                    i--;
                } else {
                    if (dp[i][j - 1] >= dp[i - 1][j])
                        j--;
                    else
                        i--;
                }
            }
            return str;
        }

    public static void main(String[] args) {
        String s1 = "anuj";
        String s2 = "anjum";
        System.out.println(shortestCommonSupersequence(s1,s2));
    }
}
