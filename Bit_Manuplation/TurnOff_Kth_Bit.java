package Bit_Manuplation;

public class TurnOff_Kth_Bit {
    static int turnOffBit(int n, int k) {

        int mask = ~(1 << k);
        return (n & mask);
    }

    public static void main(String[] args) {
        int n = 8 , k = 3;
        System.out.println(turnOffBit(n, k));
    }
}
