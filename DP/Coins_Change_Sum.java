package DP;

public class Coins_Change_Sum {
      static int[][] dp ;
    public int coinChange(int[] coins, int amount) {
  
       int ans = helper(0 , amount , coins);
       return (ans != Integer.MAX_VALUE)? ans : -1;
    }

    private int helper(int i, int amount, int[] coins) {
        if (i == coins.length){
            if (amount == 0) return 0;
            else return Integer.MAX_VALUE;
        }
       int skip = helper(i+1, amount, coins);
       if (amount < coins[i]) return skip;
        int pick = helper(i, amount - coins[i], coins);
      int take =   (pick == Integer.MAX_VALUE) ? Integer.MAX_VALUE  : pick + 1;
      return Math.min(skip, take);
    }


    public static void main(String[] args) {
        
    }
}
