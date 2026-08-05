public class Reaarange_Array_By_Sign {
    
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int pos = 0;
        int neg = 1;
        for (int ele : nums) {
            if (ele < 0) {
                res[neg] = ele;
                neg += 2;
            } else {
                res[pos] = ele;
                pos += 2;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        
    }
}
