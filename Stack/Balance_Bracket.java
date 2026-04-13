package Stack;

import java.util.Stack;

// it's Applicable for "()" pranthesis
public class Balance_Bracket {
    static boolean check(String str) {
        Stack<Character> st = new Stack<>();
        int n = str.length();
        if (n % 2 == 1)
            return false;
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                st.push(ch);
            } else {
                if (st.isEmpty() && ch == ')')
                    return false;
                st.pop();
            }
        }
        if (st.size() != 0)
            return false;
        return true;
    }

    public static void main(String[] args) {
        String str = "()(())(";
        System.out.println(check(str));
    }
}
