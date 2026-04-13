import java.util.HashMap;

public class Two_Sum_hash {

    private static int[] twosum(int[] arr, int tar) {
        int [] res = new int[2];
        int n = arr.length;
        HashMap<Integer , Integer> map = new HashMap<>();
        for (int i=0;i<n;i++){
            map.put(arr[i], i);
        }
        for (int i=0 ; i<n ; i++){
            int key = tar - arr[i];
            if (map.containsKey(key) && i!=map.get(key)){
                res[0] = i;
                res[1] = map.get(key);
                break;
            }
        }
        return res;

    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 6, 3, 4, 2 };
        System.out.println("hello");
        int[] res = twosum(arr,9);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}
