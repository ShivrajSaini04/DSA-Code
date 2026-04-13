public class reverse_Vowels {
    public static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static String vowelrev(String str) {
        char[] arr = str.toCharArray();
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u' &&
                    arr[j] == 'a' || arr[j] == 'e' || arr[j] == 'i' || arr[j] == 'o' || arr[j] == 'u') {
                swap(arr, i, j);
                i++;
                j--;
            }
            if ((arr[i] != 'a') || (arr[i] != 'e') || (arr[i] != 'i') || (arr[i] != 'o') || (arr[i] != 'u') &&
                    (arr[j] == 'a') || (arr[j] == 'e') || (arr[j] == 'i') || (arr[j] == 'o') || (arr[j] == 'u'))
                i++;
            // if ((arr[i] == 'a') || (arr[i] == 'e') || (arr[i] == 'i') || (arr[i] == 'o')
            // || (arr[i] == 'u') &&
            // (arr[j] != 'a') || (arr[j] != 'e') || (arr[j] != 'i') || (arr[j] != 'o') ||
            // (arr[j] != 'u'))
            else
                j--;
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        String str = "shivasaini";
        System.out.println(str);
        System.out.println(vowelrev(str));
    }
}
