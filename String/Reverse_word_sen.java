
public class Reverse_word_sen {
  public static void reverseString(char[] arr, int i, int j) {
    // char arr[] = s.toCharArray();
    while (i < j) {
      char temp = arr[i];
      arr[i++] = arr[j];
      arr[j--] = temp;
    }
  }

  public static void main(String[] args) {
    String str = "Let's take LeetCode contest";
    str += " ";
    char[] arr = str.toCharArray();
    int j = 0;
    for (int i = 0; i < str.length(); i++) {
      if (arr[i] == ' ') {
        reverseString(arr, j, i);
        j = i + 1;
      }
    }
    String res = new String(arr);
    System.out.println(res);
  }
}
