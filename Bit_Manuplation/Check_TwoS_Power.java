package Bit_Manuplation;

public class Check_TwoS_Power {

    private static boolean isTowPower(int n) {
        return ((n & (n-1) )== 0) ;
    }

    public static void main(String[] args) {
        int n = 18;
        System.out.println(isTowPower(n));
    }
    
}
