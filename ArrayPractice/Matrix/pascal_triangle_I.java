package Matrix;

import java.util.ArrayList;
import java.util.List;

public class pascal_triangle_I {
     public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i=0;i<numRows;i++){
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
        return ans;
    }
}
