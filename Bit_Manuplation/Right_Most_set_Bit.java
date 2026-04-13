package Bit_Manuplation;

public class Right_Most_set_Bit {
    static int setKthBit(int n) {  // turn on from off(0) bit  from the  first rightside 
        return (n | n+1);
    }

    public static void main(String[] args) {
        int n = 5 ;
        System.out.println(setKthBit(n));
    }
}
