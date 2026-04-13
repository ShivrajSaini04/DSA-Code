package DP;

public class Longest_Common_Subseqence {
    
    static int LCS(int i, int j, StringBuilder str1, StringBuilder str2, int[][] dp) {
        if (i < 0 || j < 0)
            return 0;
        if (dp[i][j] != -1)
            return dp[i][j];
        if (str1.charAt(i) == str2.charAt(j))
            return dp[i][j] = 1 + LCS(i - 1, j - 1, str1, str2, dp);
        else
            return dp[i][j] = Math.max(LCS(i - 1, j, str1, str2, dp), LCS(i, j - 1, str1, str2, dp));
    }

    static int lcs(String s1, String s2) {
        // code here
        int n = s1.length(), m = s2.length();
        int[][] dp = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                dp[i][j] = -1;
            }
        }
        return LCS(n - 1, m - 1, new StringBuilder(s1), new StringBuilder(s2), dp);
    }
}
