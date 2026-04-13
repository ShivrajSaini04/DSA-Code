package Heaps;

import java.util.*;
import java.util.HashMap;
import java.util.PriorityQueue;

class Pair implements Comparable<Pair>{
      int ele ;
      int freq;
      Pair (int ele , int freq){
        this.ele = ele;
        this.freq = freq;
      }

     public int compareTo(Pair p){
       if (this.freq == p.freq)  return Integer.compare(this.ele, p.ele);
        return Integer.compare(this.freq, p.freq);
      }
}
public class Top_k_Freqent {
    private static ArrayList<Integer> topKfreq(int[] arr, int k) {
     HashMap<Integer , Integer> map = new HashMap<>();
     ArrayList<Integer> list = new ArrayList<>();
     for (int ele : arr){
         if (map.containsKey(ele)) {
             map.put(ele, map.get(ele) + 1);
         } else
             map.put(ele, 1);
     }
     PriorityQueue<Pair> minh = new PriorityQueue<>();
     for (int ele : map.keySet()){
            minh.add(new Pair(ele, map.get(ele)));
            if (minh.size()>k) minh.remove();
     }
       while(minh.size()!=0){
         Pair temp = minh.remove();
         list.add(temp.ele);
       }
       Collections.reverse(list);
       return list;
    }
    public static void main(String[] args) {
        int[] arr = { 4, 2, 7, 6, 9,1,2,4,6,6,7,8,9 ,5,4 };
        System.out.println(topKfreq(arr , 4));
    }

    
}
