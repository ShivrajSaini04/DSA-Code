package Heaps;

import java.util.PriorityQueue;

public class Kth_Largest {
     public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        int n = nums.length;
        for (int i=0; i<n; i++){
             minheap.add(nums[i]);
            if (minheap.size() > k)   minheap.remove();
        }
       return minheap.peek();
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(findKthLargest(arr, 3));
    }
}
