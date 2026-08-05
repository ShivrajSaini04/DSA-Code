package BinarySearch;

public class singleElementInSorted {
    
    static int single(int[] arr){
        int n = arr.length;
        int left = 0 , rig = n-1;
        while(left<=rig){
            int mid = left + (rig - left) /2;
            if (mid%2==0 && arr[mid] == arr[mid-1]) left = mid+1;
            else 
        }
    }
    public static void main(String[] args) {
        int[] arr = { 1,1,2,2,3, 4, 4, 5,5, 6,6, 7,7, 8,8 };
    }
}
