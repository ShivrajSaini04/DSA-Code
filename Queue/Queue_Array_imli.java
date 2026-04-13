package Queue;
class Queue{
   private int arr[] =new int[100];
   private int front =arr.length-1;
   private int rear =arr.length-1;
   private int size=0;

   void add(int ele){
    arr[rear]=ele;
    rear--;
    size++;
   }
   int remove(){
    if (isEmpty()) return -1;
    int ele = arr[front];
    front--;
    size--;
    return ele;
   }
   int peek(){
    if (isEmpty()) return -1;
    return arr[front];
   }
   int size(){
    return size;
   }
   boolean isEmpty(){
    if (size==0) return true ;
    return false ;
   }
   void display(){
    if (isEmpty()) System.out.println("Queue Is Empty.");
     for (int i=front;i>rear;i--){
        System.out.print(arr[i]+" ");
     }
     System.out.println();
   }

}
public class Queue_Array_imli {
    public static void main(String[] args) {
        Queue q=new Queue();
       q.add(1);
        q.add(2);
         q.add(3);
          q.add(4);
           q.add(5);
           q.display();
           q.remove();
           System.out.println(q.size());
           q.display();
    }
}
