
import java.util.*;

//  Use  Two Pointer Approach
// if array is sorted 
public class Two_sum {
  public static ArrayList<Integer> list(int arr[], int tar) {
    ArrayList<Integer> list1 = new ArrayList<>();
    Arrays.sort(arr);
    int i = 0, j = arr.length - 1;
    while (i < j) {
      int sum = arr[i] + arr[j];
      if (sum == tar) {
        list1.add(i);
        list1.add(j);
        return list1;
      } else if (sum < tar)
        i++;
      else
        j--;
    }
    list1.add(-1);
    return list1;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arr[] = { 1, 7, 8, 2, 9, 4, 6, 1, 3, 0 };
    int tar = sc.nextInt();
    System.out.println(list(arr, tar));
  }
}