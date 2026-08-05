package Bit_Manuplation;

class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;
        boolean flag = (dividend < 0) ^ (divisor < 0);
        long divd = Math.abs((long) dividend);
        long divs = Math.abs((long) divisor);
        int ans = 0;

        while (divd >= divs) {
            long temp = divs;
            int multiple = 1;

            while ((temp << 1) <= divd) {
                temp <<= 1;
                multiple <<= 1;
            }
            divd -= temp;
            ans += multiple;
        }

        return flag ? -ans : ans;
    }
}

public class Divide_Integer {
    public static void main(String[] args) {
        Solution s = new Solution();
        int ans = s.divide(10, 3);
        System.out.println(ans);    
    }
}
