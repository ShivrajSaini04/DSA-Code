package Heaps;

import java.util.PriorityQueue;

public class Min_Cost_TwoRopesAdd {
    public static int minCost(int[] arr) {
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        int cost = 0;
        for (int ele : arr)
            minheap.add(ele);

        while (minheap.size() > 1) {
            int first = minheap.remove();
            int sec = minheap.remove();
            int sum = first + sec;
            cost += sum;
            minheap.add(sum);
        }
        return cost;

    }
    public static void main(String[] args) {
        int[] arr = { 4, 2, 7, 6, 9 };
        System.out.println(minCost(arr));
    }

   
}
