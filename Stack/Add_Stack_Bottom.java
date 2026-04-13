package Stack;

import java.util.Stack;

public class Add_Stack_Bottom {
    static void display(Stack<Integer> st) {
        if (st.size() == 0) {
            st.push(0); // add 0 at bootom
            return;
        }
        int x = st.pop();
        display(st);
        System.out.print(x + " ");
        st.push(x);
    }

    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        display(st);
        System.out.println();
        System.out.println(st);
        // Stack<Integer> st2= new Stack<>();
        // while (st.size()>idx){
        // st2.push(st.pop());
        // }
        // st.push(element);
        // while (st2.size()>0){
        // st.push(st2.pop());
        // }
        // System.out.println(st);
    }
}
