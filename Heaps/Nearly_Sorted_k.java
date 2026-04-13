package Heaps;

import java.util.PriorityQueue;
import java.util.Queue;

public class Nearly_Sorted_k {
    
    public static void nearlySorted(int[] arr, int k) {
        
    //   Given an array arr[] and an integer k, where every element is at most k positions away 
    //   from its correct sorted position. This means that if the array were completely sorted, 
    //   the element at index i in the given array can be at any index from i - k to i + k

        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        int idx = 0;
        for (int ele : arr){
            minheap.add(ele);
            if (minheap.size() > k){
                 arr[idx++] = minheap.remove();
            }
        }
        while (minheap.size()>0) {
            arr[idx++] = minheap.remove();
        }

    }
    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 4};
        nearlySorted(arr, 3);
        for(int ele : arr) 
            System.out.print(ele+" ");
    }
}
