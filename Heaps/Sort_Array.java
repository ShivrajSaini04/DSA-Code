package Heaps;

import java.util.PriorityQueue;

public class Sort_Array {

         private static void heapsort(int[] arr) {
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        for (int ele : arr) {
            minheap.add(ele);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = minheap.remove();
        }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 2, 7, 6, 9 };
        heapsort(arr);
        for (int ele : arr) System.out.print(ele + " ");
    }
}
