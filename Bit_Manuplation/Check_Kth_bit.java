package Bit_Manuplation;

public class Check_Kth_bit {

    static boolean isbitSet(int n, int k) {
        return ((n >> k) % 2 == 1);
    }

    public static void main(String[] args) { // check kth bit is set (1) or not return true(1) or false (0)
        int n = 500, k = 4;
        System.out.println(isbitSet(n, k));
    }
}
