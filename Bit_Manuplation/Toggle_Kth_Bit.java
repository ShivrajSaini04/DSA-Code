package Bit_Manuplation;

public class Toggle_Kth_Bit {
    static int toggleKthBit(int n, int k) {

        int temp = (1 << k);
        return (n ^ temp);
    }

    public static void main(String[] args) {
        int n = 5, k = 2;
        System.out.println(toggleKthBit(n, k));
    }
}
