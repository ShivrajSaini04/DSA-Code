package Stack;

import java.util.Stack;

public class Next_Greater {
  public static int[] nextgreater(int[] arr) {
    int n = arr.length;
    Stack<Integer> st = new Stack<>();
    int[] res = new int[n];
    res[n - 1] = -1;
    st.push(arr[n - 1]);

    for (int i = n - 2; i >= 0; i--) {
      while (!st.isEmpty() && st.peek() <= arr[i]) {
        st.pop();
      }
      if (st.isEmpty())
        res[i] = -1;
      else
        res[i] = st.peek();
      st.push(arr[i]);
    }
    return res;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 1, 3, 4, 5, 6, 7, 3, 4 };
    int res[] = nextgreater(arr);
    for (int ele : res) {
      System.out.print(ele + " ");
    }
  }
}
