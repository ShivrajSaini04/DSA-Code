public class Thousand_Separator {
    
       // Leetcode 1556

    public static  String thousandSeparator(int n) {
        StringBuilder str = new StringBuilder();
        if (n == 0)
            return "0";
        int count = 0;
        while (n != 0) {
            int rem = n % 10;
            if (count > 0 && count % 3 == 0)
                str.append(".");
            str.append(rem);
            count++;
            n /= 10;
        }

        return new String(str.reverse());
    }

    public static void main(String[] args) {
        int n = 123456789;
        System.out.println(thousandSeparator(n));
    }
}
