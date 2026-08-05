

import java.util.ArrayList;
import java.util.List;

public class Pascal_triangle_II {
    
    public static  List<Integer> getRow(int rowIndex) {
        // we can use ncr formula for optimization
         List<List<Integer>> ans = new ArrayList<>();
        for (int i=0;i<=rowIndex;i++){
            List<Integer> list = new ArrayList<>();
            for(int j=0;j<=i;j++){
              if (j==0 || j==i) list.add(1);
              else {
                List<Integer> temp = ans.get(i-1);
                int res = temp.get(j) +  temp.get(j-1);
                list.add(res);
              }
            }
            ans.add(list);
        }
        return ans.get(rowIndex);
    }

    public static void main(String[] args) {
        System.out.println(getRow(3));
    }
}
