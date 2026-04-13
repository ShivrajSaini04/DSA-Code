import java.util.HashMap;

public class Most_Freq_Char {
    public static void main(String[] args) {
        String str = "shivasaini";
        System.out.println(freq(str));
    }

    private static char[] freq(String str) {
        HashMap<Character , Integer > map = new HashMap<>();
        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);
           if (map.containsKey(ch)) {
            int freq = map.get(ch);
            map.put(ch, freq+1);
           }
           else 
               map.put(ch, 1);
        }
        int max = -1;
        for (char ch : map.keySet()){
             
        }
    }
}
