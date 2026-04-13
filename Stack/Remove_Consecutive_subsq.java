package Stack;
import java.util.Stack;
public class Remove_Consecutive_subsq {
    static int [] fun(int []arr){
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        for (int i=0;i<n;i++){
            if(st.size()==0) st.push(arr[i]);
           else  if (st.peek()!=arr[i]) st.push(arr[i]);
            else{
                if (i==n-1 || arr[i]!=arr[i+1]) st.pop();
            }
        }
        int res[] = new int[st.size()];
        for (int i=res.length-1;i>=0;i--){
            res[i]=st.pop();
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={1,2,2,3,4,4,4,4,5,5,5,3,2,1};
        int res[]= fun(arr);
        System.out.println("hello");
        for (int ele : res){
            System.out.print(ele +" ");
        }
    }
}
