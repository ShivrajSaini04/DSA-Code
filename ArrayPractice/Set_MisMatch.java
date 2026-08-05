import java.util.HashMap;

public class Set_MisMatch {
    
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n= nums.length;
        int[] res = new int[2];
        for (int ele : nums) {
            if (map.containsKey(ele))
             map.put(ele , map.get(ele)+1);
            else map.put(ele , 1);
        }
        for(int i=1;i<=n;i++){
            if (!map.containsKey(i))
                res[1] = i;
            else if (map.get(i) == 2)
                res[0] = i;
        }
        return res;
    }
    
}
