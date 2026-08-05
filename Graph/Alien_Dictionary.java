package Graph;
import java.util.*;
class Solution {
    public String findOrder(String[] words) {
        // code here
        int n = words.length;
        List<List<Integer>> adj = new ArrayList<>();
        int[] ind = new int[26];
        boolean[] visit = new boolean[26];

        for (int i = 0; i < 26; i++)
            adj.add(new ArrayList<>());

        for (String word : words) {
            for (char ch : word.toCharArray()) {
                visit[ch - 'a'] = true;
            }
        }
        for (int i = 0; i < n - 1; i++) {
            String fir = words[i];
            String sec = words[i + 1];
            int len = Math.min(fir.length(), sec.length());
            int j = 0;
            while (j < len && fir.charAt(j) == sec.charAt(j))
                j++;

            if (j == len) {
                if (fir.length() > sec.length())
                    return "";
                continue;
            }
            char ch1 = fir.charAt(j);
            char ch2 = sec.charAt(j);

            int idxFirst = (int) ch1 - 'a';
            int idxSec = (int) ch2 - 'a';
            adj.get(idxFirst).add(idxSec);

            ind[idxSec]++;
        }

        StringBuilder str = new StringBuilder();
        Queue<Integer> q = new LinkedList<>();
        int totalLen = 0;
        for (int i = 0; i < 26; i++) {
            if (visit[i]) {
                totalLen++;
                if (ind[i] == 0)
                    q.add(i);
            }
        }

        while (q.size() > 0) {
            int front = q.poll();
            str.append((char) (front + 'a'));
            for (int ele : adj.get(front)) {
                ind[ele]--;
                if (ind[ele] == 0)
                    q.add(ele);
            }
        }

        if (totalLen != str.length())
            return "";
        return new String(str);
    }
}

public class Alien_Dictionary {
    public static void main(String[] args) {
        
    }
}
