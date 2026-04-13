package Bit_Manuplation;

public class ComplementOfNumber {
    
    public static  int bitwiseComplement(int n) {
        if (n == 0)
            return 1;
        int mask = 0;
        while (mask < n) {
            mask = (mask << 1) | 1;
        }
        return (n ^ mask);
    }

    public static void main(String[] args) {
        System.out.println(bitwiseComplement(10));
    }
}
