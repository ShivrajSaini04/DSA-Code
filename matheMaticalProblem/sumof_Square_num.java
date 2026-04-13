package matheMaticalProblem;

public class sumof_Square_num {
    public static boolean sumofsquare(long n) {
        long left = 1;
        long right = (long) Math.sqrt(n);
        while (left < right) {
            long sum = (left * left) + (right * right);
            if (sum == n)
                return true;
            else if (sum < n)
                left++;
            else

                right--;
        }
        return false;

    }

    public static void main(String[] args) {
        int n = 2;
        System.out.println(sumofsquare(n));
    }
}
