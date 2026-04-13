package Queue;
import java.util.Queue;
import java.util.LinkedList;

public class First_Neg_Window {
   public static long  [] findneg(long arr[],int k){
         int n = arr.length;
         Queue<Integer> q = new LinkedList<>();
         for (int i=0;i<n;i++){
            if (arr[i]<0) q.add(i);
         }
         long res [] = new long[n-k+1];
         for (int i=0;i<n-k+1;i++){
            if (q.size()>0 && q.peek()<i) q.remove();

            if (q.size()>0 && q.peek()<= i+k-1) res[i]=arr[q.peek()];
            else if (q.size()==0) res[i]=0;
            else res[i]=0;
         }
         return res ;
   }
    public static void main(String[] args) {
        long arr[] ={1,-1,-3,4,-5,6,7,-2,8};
        int k=3;
       long res[]= findneg(arr,k);
       for (long ele : res){
        System.out.print(ele+" ");
       }
    }
}
