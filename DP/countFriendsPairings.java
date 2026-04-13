package DP;

public class countFriendsPairings {
    
    // public long countFriendsPairing(int n) {
    // // question samjh nahi aaya hai lekin fir bhi submit kiya hai
    // // ye code mera nahi hai
    // if (n <= 2) return n;
    // return countFriendsPairings(n-1) + (n-1)*countFriendsPairings(n-2);
    // }

    static long[] dp;

    public long countFriendsPairing(int n) {
        dp = new long[n + 1];
        return friends(n);
    }

    public long friends(int n) {
        if (n <= 2)
            return n;
        if (dp[n] != 0)
            return dp[n];
        return dp[n] = friends(n - 1) + (n - 1) * friends(n - 2);
    }
}
