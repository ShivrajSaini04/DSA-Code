public class Majority_Element_I {
    
    public static int majorityElement(int[] nums) {
        int majo = 0, count = 0;
        for (int ele : nums) {
            if (count == 0)
                majo = ele;
            if (ele == majo)
                count++;
            else
                count--;
        }
        return majo;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr = { 1, 2, 3, 2, 2, 4, 2 };
        System.out.println(majorityElement(arr));
    }
}
