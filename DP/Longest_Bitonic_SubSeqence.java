package DP;

import java.util.Arrays;

public class Longest_Bitonic_SubSeqence {
    public static int LBS(int[] arr) {
        int n = arr.length;
        int maxlength = 0;
        int[] dp = new int[n];
         Arrays.fill(dp, 1);
        for (int i = 1; i < n; i++) {
            int max = 0;
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) {
                    max = Math.max(max, dp[j]);
                }
            }
            dp[i] += max;
        }
        int[] dp2 = new int[n];
        Arrays.fill(dp2, 1);
        for (int i = n-2; i >= 0; i--) {
            int max = 0;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[i]) {
                    max = Math.max(max, dp2[j]);
                }
            }
            dp2[i] += max;
        }
        for(int i=0;i<n;i++){
            if (dp[i]!=1 && dp2[i] != 1){
                maxlength = Math.max(maxlength, dp[i] + dp2[i] -1);
            }
        }
        return maxlength;
    }
}
