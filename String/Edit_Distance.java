public class Edit_Distance {
    
    public int editDistance(String s1, String s2) {
        int n = s1.length(), m = s2.length();
        int[][] dp = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                dp[i][j] = -1;
            }
        }
        return edit(n - 1, m - 1, new StringBuilder(s1), new StringBuilder(s2), dp);
    }
    
    static int edit(int i, int j, StringBuilder str1, StringBuilder str2, int[][] dp) {
        if (i < 0 )    return j+1;
        if (j < 0)    return i + 1;
        if (dp[i][j] != -1) return dp[i][j];
        if (str1.charAt(i) == str2.charAt(j)) return edit(i - 1, j - 1, str1, str2, dp);
         int replace =1+ edit(i-1, j-1, str1, str2, dp);
         int remove = 1 + edit(i-1, j, str1, str2, dp);
         int insert = 1 + edit(i, j-1, str1, str2, dp);

            return dp[i][j] = Math.min(replace , Math.min(remove, insert));
    }

}
