package Stack;

class Stack {
      
   private int stack[]=new int[20];
   private int idx=0;
   // for stack capacity 
    int capacity(){
        return stack.length;
    }// if stack is empty
    boolean isEmpty(){
        if (idx==0) return true;
        return false ;
    }
    // if stack is full
    boolean isFull(){
        if (idx==stack.length) return true;
        return false ;
    }
     // push element in stack
    void push (int ele ){
        if(isFull()) {
              System.out.println("Stack is Full");
           return ;
        }
        stack[idx++]=ele;
    }
     // peek top element of stack
     int peek(){
        if (isEmpty()==true) {
            System.out.println("Stack is Empty");
           return 0;
         }
       return stack[idx-1];
    }  
      // pop top element of stack
       int pop(){
         if (isEmpty()) {
            System.out.println("Stack is Empty");
           return 0;
         }
        int x=stack[idx-1];
        stack[idx-1]=0;
        idx--;
        return x;
    }
    // print stack 
    void disply(){
     for (int i=0;i<idx;i++){
        System.out.print(stack[i]+" ");
     }
     System.out.println();
    }  
    // size of stack
        int size(){
        return idx;
    }      
    }
public class stack_array_imple {
    public static void main(String[] args) {
        Stack st= new Stack();
         st.push(1);
         st.push(2);
          st.push(3);
           st.push(4);
            st.push(5);
        st.disply();
        st.pop();
         st.disply();
        System.out.println(st.peek());
         System.out.println(st.isEmpty());
          System.out.println(st.size());
           System.out.println(st.capacity());
            System.out.println(st.isFull());
    }
}
