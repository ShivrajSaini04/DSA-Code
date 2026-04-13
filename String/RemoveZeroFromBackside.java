public class RemoveZeroFromBackside {
    
    public static String removeTrailingZeros(String num) {
        int n = num.length();
        int i = 0;
        while (i < n) {
            if (num.charAt(n - i - 1) == '0')
                i++;
            else
                break;
        }

        return num.substring(0, n - i);
    }

    public static void main(String[] args) {
        String str = "1238404537000";
        System.out.println(removeTrailingZeros(str));
    }
}
