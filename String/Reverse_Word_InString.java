public class Reverse_Word_InString {
    
    // if string leading multiple space (front ,middle,end)
    /* approach -: 
    1. find space and reverse each word from i to j-1, and i=j+2,j=j+2
    2. revrese all String from 0 to n-1
    3. create a new string (sb) and remove space from the front and between the string (if greater than 1)
    4. remove spaces at the end of string 
    5. return created string 
     */
    
    void swap(int i, int j, char[] arr) {
        while (i < j) {
            char ch = arr[i];
            arr[i++] = arr[j];
            arr[j--] = ch;
        }
    }

    public String reverseWords(String s) {
        int i = 0, j = 0;
        int n = s.length();
        char arr[] = s.toCharArray();
        while (j < n) {
            if (j == n - 1)
                swap(i, j, arr);
            if (arr[j] == ' ') {
                j = j - 1;
                if (j >= 0 && j < n)
                    swap(i, j, arr);
                i = j + 2;
                j++;
            }
            j++;
        }
        swap(0, n - 1, arr);
        StringBuilder str = new StringBuilder();
        for (i = 0; i < n; i++) {
            if (arr[i] == ' ' && (str.length() == 0 || str.charAt(str.length() - 1) == ' '))
                continue;
            if (arr[i] == ' ') {
                str.append(arr[i]);
                while (i < n - 1 && arr[i] == ' ')
                    i++;
            }
            str.append(arr[i]);
        }
        j = str.length();
        while (str.charAt(j - 1) == ' ') {
            str.deleteCharAt(j - 1);
            j--;
        }
        return str.toString();
    }

    public static void main(String[] args) {
        
    }
}
