package Heaps;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

class Triplate implements Comparable<Triplate> {
    int dist;
    int x;
    int y;

    Triplate(int dist, int x, int y) {
        this.dist = dist;
        this.x = x;
        this.y = y;
    }

    public int compareTo(Triplate t){
        return this.dist - t.dist;
    }
}

public class Kth_Closest_pointOrigin {
   
    public static int[][] closestorigin(int[][] arr , int k){
      PriorityQueue<Triplate> maxh = new PriorityQueue<>(Collections.reverseOrder());
      int[][] res = new int[k][2];
      
      for (int[] points : arr){
        int x = points[0] , y = points[1];
        int dist = x*x + y*y;
        maxh.add(new Triplate(dist, x, y));
        if (maxh.size() > k){
            maxh.remove();
        }
      }
   for (int i=0;i<k;i++){
       Triplate temp = maxh.remove();
       res[i][0] = temp.x;
       res[i][1] = temp.y;
   }
      return res;
    }
}
