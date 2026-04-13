package Heaps;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

class Pair implements Comparable<Pair> {
    char ch;
    int freq;

    Pair(char ch, int freq) {
        this.ch = ch;
        this.freq = freq;
    }

    public int compareTo(Pair p) {
        if (this.freq == p.freq)
            return Integer.compare(this.ch, p.ch);
        return Integer.compare(this.freq, p.freq);
    }
}

class Sort_by_freq_char {
    public static String frequencySort(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else
                map.put(ch, 1);
        }

        PriorityQueue<Pair> maxh = new PriorityQueue<>(Collections.reverseOrder());

        for (char key : map.keySet()) {
            maxh.add(new Pair(key, map.get(key)));
        }
        StringBuilder res = new StringBuilder();
        while (maxh.size() != 0) {
            Pair temp = maxh.remove();
            for (int i = 0; i < temp.freq; i++)
                res.append(temp.ch);
        }

        return res.toString();
    }

    public static void main(String[] args) {
      
    }
}
