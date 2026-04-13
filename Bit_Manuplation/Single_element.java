
   package Bit_Manuplation;

public class Single_element {

      private static int singleElement(int[] arr) {
        int ans = 0;
        for (int ele : arr) {
            ans ^= ele;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,4,5,6,7,6,8,7,8};
        System.out.println(singleElement(arr));
    }

}
