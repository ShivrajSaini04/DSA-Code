package Stack;
import java.util.Stack;
public class Previous_Greater {
 public static int[] previ_greater(int[] arr){
      int n=arr.length;
      Stack<Integer> st = new Stack<>();
      int [] res=new int [n];
      res[0]=-1;
      st.push(arr[0]);
     
      for (int i=1;i<n;i++){
        while(!st.isEmpty() && st.peek()<=arr[i]  ){
            st.pop();
        }
        if (st.isEmpty()) res[i]=-1;
        else res[i]=st.peek();
        st.push(arr[i]);
      }
      return res;
    }
    public static void main(String[] args) {
         int arr[]={100,80,60,70,60,75,85};
        int res[]=previ_greater(arr);
        for (int ele:res){
            System.out.print(ele +" ");
        }
    }

}
