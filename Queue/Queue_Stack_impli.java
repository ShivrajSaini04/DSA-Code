package Queue;
import java.util.Stack;
class MyQueue{
    Stack<Integer> s1=new Stack<>();
    Stack<Integer> s2=new Stack<>();
     void add(int x){
        s1.push(x);
     }
    int remove(){
        if (isEmpty()) return -1;
        while(s1.size()>1){
            s2.push(s1.pop());
        }

           int ele=s1.pop();
            while(s2.size()>0){
            s1.push(s2.pop());
        }
        return ele;
    }
    int peek(){
        if (isEmpty()) return -1;
        while(s1.size()>1){
            s2.push(s1.pop());
        }
           int ele=s1.peek();
            while(s2.size()>0){
            s1.push(s2.pop());
        }
        return ele;
    }
    void display (){
        if(isEmpty()){
            System.out.println("Queue Is Empty");
        }
        print(s1);
        System.out.println();
    }
    void print(Stack<Integer> st){
        if (st.size()==0) return ;
        int ele=st.pop();
        print(st);
        s1.push(ele);
        System.out.print(ele+" ");
    }
     boolean isEmpty(){
        return size()==0;
     }
    int size(){
        return s1.size();
    }
}
public class Queue_Stack_impli {
    public static void main(String[] args) {
        MyQueue q=new MyQueue();
           q.add(1);
        q.add(2);
         q.add(3);
          q.add(4);
           q.add(5);
           System.out.println(q.size());
           q.display();
          System.out.println( q.remove());
          q.remove();
          q.remove();
           q.display();
              q.add(1);
           q.display();
    }
}
