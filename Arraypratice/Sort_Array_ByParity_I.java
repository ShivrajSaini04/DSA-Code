public class Sort_Array_ByParity_I {

    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        if (n == 0)
            return nums;
        int i = 0, j = n - 1;
        while (i < j) {
            if (nums[i] % 2 != 0 && nums[j] % 2 == 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            } else if (nums[i] % 2 == 0 && nums[j] % 2 == 0)
                i++;
            else
                j--;
        }
        return nums;
    }
}