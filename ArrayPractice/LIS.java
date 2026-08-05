import java.util.ArrayList;

public class LIS {
    
    static int lis(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        for (int ele : arr){
            if (list.size()==0 || ele > list.get(list.size()-1)) 
                list.add(ele);  // agar bada mil raha hai to append karenge 
            else replace(ele , list);
        }
         return list.size();
    }
    // yaha par ham element ka lower bond nikal rahe hai or usko element se replace kar rahe hai 
   static void replace(int ele, ArrayList<Integer> list) {
       int low =0, high = list.size()-1;
       int idx =-1;
       while(low<=high){
        int mid = low +( high - low)/2;
        if (ele <= list.get(mid)){
            idx = mid;
            high = mid -1;
        }
        else low = mid + 1;
       }
        list.set(idx, ele);
    }
}
