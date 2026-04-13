package Bit_Manuplation;

public class Set_Kth_bit {
    
    static int setKthBit(int n, int k) {
        
        int temp = (1 << k);
        return (n | temp);
    }

    public static void main(String[] args) {
        int n = 5 , k = 2;
        System.out.println(setKthBit(n, k));
    }
}
