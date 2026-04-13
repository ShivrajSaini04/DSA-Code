package Queue;
class Node {
     int data;
     Node next;
     Node(int data){
        this.data=data;
     }
}
   class queue{
      private Node head =null;
       private Node Tail =null;
      private int size =0;
        
    void add(int x){
      Node newNode= new Node(x);
       if (size()==0){
         head=Tail=newNode;
       }else {
           Tail.next=newNode;
           Tail=newNode;
       }
           size++;
    }
    int remove (){
          if (isEmpty()) return -1;
          int ele = head.data;
          head=head.next;
          size--;
          return ele;
    }
    int peek(){
        if (isEmpty()) return -1;
        return head.data;
    }

      boolean isEmpty(){
        return size==0;
      }
     
      int size(){
        return size;
     }

      void display(){
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return ;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+ " ");
            temp=temp.next;
        }
        System.out.println();
    }

 }
public class Queue_LL_imli {
    public static void main(String[] args) {
        queue q =new queue();
        q.display();
       q.add(1);
        q.add(2);
         q.add(3);
          q.add(4);
           q.add(5);
           q.display();
           System.out.println( q.isEmpty());
           q.display();
    }
}
