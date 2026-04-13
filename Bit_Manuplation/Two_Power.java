package Bit_Manuplation;

public class Two_Power {
      
    private static int twopower(int n) {
       return (1 << n);
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(twopower(n));
    }

  
}
