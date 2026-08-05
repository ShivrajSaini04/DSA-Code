import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public  class Dissappear_NumberInArray {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        // HashSet<Integer> set = new HashSet<>();
        // for(int ele : nums) set.add(ele);
        // for (int i=1;i<=nums.length;i++){
        //     if (!set.contains(i)) list.add(i);
        // }
        for (int i=0;i<nums.length;i++){
           int idx = Math.abs(nums[i]);
           if (nums[idx-1]>0)   nums[idx-1] = -nums[idx-1];
        }
        for (int i=0;i<nums.length;i++){
          if (nums[i]>0)  list.add(i+1);
        }

        return list;
    }
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> list = new ArrayList<>();
        list = findDisappearedNumbers(arr);
        System.out.println(list);
    }
}
