public class revrse_vowel_String {
    

    public String reverseVowels(String s) {
        int n = s.length();
        int i = 0, j = n - 1;
        char arr[] = s.toCharArray();
        while (i < j) {
            if (!(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u' ||
                    arr[i] == 'A' || arr[i] == 'I' || arr[i] == 'E' || arr[i] == 'O' || arr[i] == 'U'))
                i++;

            else if (!(arr[j] == 'a' || arr[j] == 'e' || arr[j] == 'i' || arr[j] == 'o' || arr[j] == 'u' ||
                    arr[j] == 'A' || arr[j] == 'I' || arr[j] == 'E' || arr[j] == 'O' || arr[j] == 'U'))
                j--;
            else {
                char ch = arr[i];
                arr[i] = arr[j];
                arr[j] = ch;
                i++;
                j--;
            }

        }
        return new String(arr);
    }

    public static void main(String[] args) {
        
    }
}
