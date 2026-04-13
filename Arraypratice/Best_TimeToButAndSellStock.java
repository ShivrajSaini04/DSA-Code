public class Best_TimeToButAndSellStock {
    
    public static  int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profit = Integer.MIN_VALUE;
        int n = prices.length;
        for (int i = 0; i < n; i++) {
            if (min < prices[i]) {
                int curr = prices[i] - min;
                profit = Math.max(profit, curr);
            } else
                min = prices[i];
        }
        if (profit == Integer.MIN_VALUE)
            return 0;
        return profit;
    }

    public static void main(String[] args) {
        int[] arr ={7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
}
