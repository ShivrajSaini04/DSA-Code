package Queue;
class queuea{
   private int arr[] =new int[7];
   private int front =0;
   private int rear =0;
   private int size=0;
   int n=arr.length;

   void add(int ele){
    if(size==0){
       arr[0]=ele;
    }
    else if (size==n) {
        System.out.println("Queue is full");
        return ;
    }
  else if(rear<n-1){
    arr[++rear]=ele;
    }
     else if (rear==n-1){
        rear=0;
    arr[0]=ele;
    }
    size++;
   }
   int remove(){
      int  ele =0;
    if (isEmpty()) return -1;
    else{ 
       ele = arr[front];
      if( front==n-1) front=0;
        else front++;
    }
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
    return size==0;
   }
   void display(){
    if (isEmpty()) System.out.println("Queue Is Empty.");
   else  if(front<=rear){
      for (int i=front;i<=rear;i++){
        System.out.print(arr[i]+" ");
     }
     System.out.println();
   }
   else{
           for (int i=front;i<=n-1;i++){
        System.out.print(arr[i]+" ");
     }
     for (int i=0;i<=rear;i++){
        System.out.print(arr[i]+" ");
     }
     System.out.println();
    }
  }
}
public class Circuler_Queue {
     public static void main(String[] args) {
        queuea q=new queuea();
       q.add(1);
        q.add(2);
         q.add(3);
          q.add(4);
           q.add(5);
           q.add(6);
           q.add(7);
            q.display();
            q.remove();
            q.remove();
               q.remove();
                q.remove();
            q.remove();
               q.remove();
            q.remove();
              q.display();
                                                                                                    q.add(6);
           q.add(7);
           q.add(10);
           q.add(30);
             q.add(1);
        q.add(2);
         q.add(3);
           q.display();
    }
}
