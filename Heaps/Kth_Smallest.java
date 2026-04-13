package Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class Kth_Smallest {

    private static int kthSmallest(int[] arr , int k) {
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            maxheap.add(arr[i]);
            if (maxheap.size() > k)
                maxheap.remove();
        }
        return maxheap.peek();
    }
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(kthSmallest(arr , 3));
    }

}
