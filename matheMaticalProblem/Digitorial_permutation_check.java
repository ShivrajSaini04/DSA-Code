package matheMaticalProblem;


public class Digitorial_permutation_check {
     static  int factorial(int n ){
          if (n==0 || n==1) return 1;
          return n*factorial(n-1);
      }
    public static  boolean isDigitorialPermutation(int n) {
        int data = n ;
        int sum = 0;
        int[] freq = new int[10];
        while (n!=0){
            int rem = n%10;
            sum += factorial(rem);
            freq[rem]++;
            n/=10;
        }
        if (data == sum ) return true;
       while(sum!=0){
            int rem = sum%10;
            if(freq[rem]<=0) return false ;
            freq[rem]--;
           sum /= 10;
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) return false;
        }
        return true ;
    }

    public static void main(String[] args) {
        System.out.println(isDigitorialPermutation(541));
    }
}
