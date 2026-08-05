package matheMaticalProblem;

class Solution {
    public static int gcd(int a, int b) {
        // code here
        while (b % a != 0) {
            int r = b % a;
            b = a;
            a = r;
        }
        return a;
    }
}


public class GCD_TwoNumber {

     public static void main(String[] args) {
        Solution obj = new Solution();
        int a = 12, b = 18;
        System.out.println(obj.gcd(a, b));
     }
}