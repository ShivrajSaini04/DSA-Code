package Bit_Manuplation;

import java.util.ArrayList;

public class Subsets_Bit {
     static ArrayList<ArrayList<Integer>> subsets(int[] arr) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int n = arr.length;
        int totalsub = (1<<n);

        for (int i = 0; i < totalsub; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if(((i >> j ))%2 == 1)list.add(arr[j]);
            }
            ans.add(list);
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 2 };
        System.out.println(subsets(arr));
    }
}
