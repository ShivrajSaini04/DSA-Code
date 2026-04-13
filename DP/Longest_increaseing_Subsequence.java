package DP;

import java.util.ArrayList;

public class Longest_increaseing_Subsequence {
    // Binary Search  O(n logn) solution 
    static int lis(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        for (int ele : arr){
            if (list.size()==0 || ele > list.get(list.size()-1)) 
                list.add(ele);  // agar bada mil raha hai to append karenge 
            else replace(ele , list);
        }
         return list.size();
    }
    // yaha par ham element ka lower bond nikal rahe hai or usko element se replace kar rahe hai 
   static void replace(int ele, ArrayList<Integer> list) {
       int low =0, high = list.size()-1;
       int idx =-1;
       while(low<=high){
        int mid = low +( high - low)/2;
        if (ele <= list.get(mid)){
            idx = mid;
            high = mid -1;
        }
        else low = mid + 1;
       }
        list.set(idx, ele);
    }

         // Tabulation 
         public static int LIS(int[] arr) {
             int n = arr.length;
            int  maxlength =1;
             int[] dp = new int[n];
             for (int i = 0; i < n; i++) dp[i] = 1;

             for (int i = 1; i < n; i++){
                int max =0;
                 for (int j = 0; j < i; j++){
                   if (arr[j] < arr[i]){
                    max = Math.max(max, dp[j]);
                   }
                }
                dp[i] += max;
                maxlength = Math.max(dp[i], maxlength);
             }       
             return maxlength;
         }
         
    //    recurrsion + memoization
    // public static int LIS(int[] arr){
    //     int n = arr.length;
    //     int[][] dp  =  new int[n][n+1];
    //     for(int i=0;i<n;i++)
    //         for(int j=0;j<=n;j++) dp[i][j] = -1;
    //   return   helper(0 ,-1,arr ,dp);
    // }
    
    // private static int helper(int idx, int pre, int[] arr, int[][] dp) {
    //     if (idx == arr.length) return 0;
    //     if (dp[idx][pre+1] != -1) return dp[idx][pre+1];
    //      int skip = helper(idx+1, pre, arr,dp);
    //     if (pre != -1 && arr[idx] > arr[pre])  return dp[idx][pre+1] = skip;
    //     int pick = 1 + helper(idx+1, idx, arr,dp);
    //     return dp[idx][pre+1] = Math.max(pick, skip);
    // }

    public static void main(String[] args) {
        int arr[] = {7 ,2,5,8,7,4,9,10};
        System.out.println(LIS(arr));

    }
}
