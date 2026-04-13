package DP;

public class Nth_Fibbo {
    static int[] dp;
    static  int fibbo(int n){
       dp = new int[n+1];
      return  helper(n);
    }

    static int helper(int n){
        if (n==0) return 0;
        if (n==1) return 1;
        if (dp[n]!=0) return dp[n];
        int ans = helper(n-1) + helper(n-2);
        dp[n] = ans;
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(fibbo(40));
    }
}
