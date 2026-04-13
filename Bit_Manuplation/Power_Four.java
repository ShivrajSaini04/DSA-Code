package Bit_Manuplation;

public class Power_Four {

    static boolean poweroftwo(int n) {
        return ((n & (n - 1)) == 0);
    }

    static boolean isSquare(int n) {
        int root = (int) Math.sqrt(n);
        return (root * root == n);
    }

    public static boolean isPowerOfFour(int n) {
        if (n == 0)
            return false;
        return (poweroftwo(n) && isSquare(n));
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfFour(64));
    }
}
