public class Next_Grather_Letter {
    
    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;
        char max = letters[0];
        int left = 0, right = n - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (letters[mid] > target) {
                max = letters[mid];
                right = mid - 1;
            } else
                left = mid + 1;

        }
        return max;
    }

    public static void main(String[] args) {
        
    }
}
