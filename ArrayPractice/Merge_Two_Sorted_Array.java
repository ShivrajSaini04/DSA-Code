

public class Merge_Two_Sorted_Array {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0)  // here m or n number of element in array , array length nahi hai ye 
            return;
        int i = m - 1, j = n - 1, idx = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] >= nums2[j]) {
                nums1[idx--] = nums1[i--];
            } else {
                nums1[idx--] = nums2[j--];
            }

        }
        while (idx > -1 && j >= 0) {
            nums1[idx--] = nums2[j--];
        }
        while (idx > -1 && i >= 0) {
            nums1[idx--] = nums1[i--];
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,3,5,7,8,0,0,0};
        int arr2[] = {2,5,7};   
        merge(arr, 5, arr2, 3);
        for(int ele : arr) System.out.print(ele+" ");
    }

}