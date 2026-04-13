package Heaps;
import java.util.*;
class MedianFinder {

    PriorityQueue<Integer> maxh = new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> minh = new PriorityQueue<>();
    public MedianFinder() {
        maxh = new PriorityQueue<>(Collections.reverseOrder());
        minh = new PriorityQueue<>();
    }

    public void addNum(int num) {
       
        if(maxh.size()==0 ){
            maxh.add(num);
        }  else {
            if (num < maxh.peek()) maxh.add(num);
            else minh.add(num);
        }
         if ( maxh.size() ==  minh.size()+2 )  minh.add(maxh.remove());
         if (minh.size() == maxh.size() + 2)   maxh.add(minh.remove());
    }

    public double findMedian() {
        if (maxh.size() == minh.size() ){
            return (maxh.peek() + minh.peek())/2;
        }
        else if (maxh.size() < minh.size() ) return minh.peek();
        else return maxh.peek();
    }
}

public class Median_Data_Stream {
    
}
