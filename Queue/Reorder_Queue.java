package Queue;
import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;

public class Reorder_Queue {
    public static void reorder(Queue<Integer> q){
        Stack<Integer> st = new Stack<>();
        int n= q.size();
        for (int i=0;i<n/2;i++){
            st.push(q.remove());
        }
         for (int i=0;i<n/2;i++){
            q.add(st.pop());
        }
          for (int i=0;i<n/2;i++){
            st.push(q.remove());
        }
          for (int i=0;i<n/2;i++){
            q.add(st.pop());
            q.add(q.remove());
        }
        for (int i=0;i<n;i++)  st.push(q.remove());
        for (int i=0;i<n;i++)   q.add(st.pop());
       
    }
    public static void main(String[] args) {
        Queue<Integer> q =new LinkedList<>();
        for (int i=1;i<=8;i++){
            q.add(i);
        }
        System.out.println(q);
        reorder(q);
        System.out.println(q);
    }
}
