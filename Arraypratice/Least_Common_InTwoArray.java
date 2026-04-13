package Arraypratice;

public class Least_Common_InTwoArray {
        
    //  given both array is sorted

    public int getCommon(int[] nums1, int[] nums2) {
        int first = 0;
        int sec = 0;
        while (first < nums1.length && sec < nums2.length) {
            if (nums1[first] == nums2[sec])
                return nums1[first];
            else if (nums1[first] < nums2[sec])
                first++;
            else
                sec++;
        }
        return -1;
    }
}