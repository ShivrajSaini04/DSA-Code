public class Check_one_zero_count {
    // leetcode 1869
    // if contiguous one (1) ( count of one ) is grater than return true
    // else if less than or equal to zero count then return false ;
    public static  boolean checkZeroOnes(String s) {
        int n = s.length();
        int zero = Integer.MIN_VALUE;
        int one = Integer.MIN_VALUE;
        int currzero = 0;
        int currone = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                currone++;
                currzero = 0;
            } else {
                currone = 0;
                currzero++;
            }
            one = Math.max(one, currone);
            zero = Math.max(zero, currzero);
        }
        if (one > zero)
            return true;
        return false;
    }

    public static void main(String[] args) {
        String str = "1100011110001";
        System.out.println(checkZeroOnes(str));
    }
}
