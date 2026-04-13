package Stack;
import java.util.Stack;
public class Stock_span {
     public static int[] StockSpan(int[] arr){
      int n=arr.length;
      Stack<Integer> st = new Stack<>();
      int [] res=new int [n];
       res[0]=1;
      st.push(0);
      for (int i=1;i<n;i++){
        while(!st.isEmpty() && arr[st.peek()]<=arr[i]  ){
            st.pop();
        }
        if (st.isEmpty()) res[i]=i+1;
        else res[i]=i-st.peek();
        st.push(i);
      }
      return res;
    }
    public static void main(String[] args) {
           int arr[]={100,80,60,70,60,75,85};
        int res[]=StockSpan(arr);
        for (int ele:res){
            System.out.print(ele +" ");
        }
    }
}
