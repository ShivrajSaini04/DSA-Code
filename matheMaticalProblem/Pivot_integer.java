package matheMaticalProblem;

public class Pivot_integer {
         
          // clean solution
    // public static  int pivotInteger(int n) {
    //     int total = n * (n + 1) / 2;
    //     int x = (int) Math.sqrt(total);
    //     if (x * x == total)
    //         return x;
    //     return -1;
    // }
          
    //    my solution
    public static int pivotInteger(int n) {
        if (n == 1)
            return 1;
        for (int i = 2; i <= n; i++) {
            int total = (n * (n + 1)) / 2;
            int sum = (i * (i + 1)) / 2;
            int diff = (total - sum) + i;
            if (diff == sum)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(pivotInteger(8));
    }
}
