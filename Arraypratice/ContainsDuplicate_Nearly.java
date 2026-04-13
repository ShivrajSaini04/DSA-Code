import java.util.HashSet;

public class ContainsDuplicate_Nearly {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) { 
            if (set.contains(nums[i])) 
                return true;
            set.add(nums[i]);
    
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
        System.out.println(containsNearbyDuplicate(arr , 3));
    }
}
