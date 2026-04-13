package Stack;

class Node {
   int data;
   Node next;

   Node(int data) {
      this.data = data;
   }
}

class Stack {
   private Node head = null;
   private int size = 0;

   boolean isEmpty() {
      if (head == null)
         return true;
      return false;
   }

   void push(int x) {
      Node newNod = new Node(x);
      newNod.next = head;
      head = newNod;
      size++;
   }

   int peek() {
      if (isEmpty())
         return -1;
      return head.data;
   }

   int pop() {
      if (isEmpty())
         return -1;
      int ele = head.data;
      head = head.next;
      size--;
      return ele;
   }

   void display() {
      displayrec(head);
      System.out.println();
   }

   void displayrec(Node temp) {
      if (temp == null)
         return;
      displayrec(temp.next);
      System.out.print(temp.data + " ");
   }

   int size() {
      return size;
   }
}

public class Stack_LL_Imple {
   public static void main(String[] args) {
      Stack st = new Stack();
      st.push(1);
      st.push(2);
      st.push(3);
      st.push(4);
      st.push(5);
      st.display();
      System.out.println(st.pop());
      System.out.println(st.peek());
      System.out.println(st.isEmpty());
      System.out.println(st.size());
   }
}
