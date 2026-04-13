package Bit_Manuplation;

public class Find_XOR_In_Range {
    static int Xor(int n){
        if (n%4==1) return 1;
        if(n%4==2) return n+1;
        if(n%4==3) return 0;
        else return n;
    }

    public static int findXOR(int l, int r) {
        return (Xor(l-1) ^ Xor(r));
 
    }
    public static void main(String[] args) {
        System.out.println(findXOR(4, 8));
    }
}
