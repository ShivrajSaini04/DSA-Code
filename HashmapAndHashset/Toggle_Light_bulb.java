import java.util.ArrayList;
import java.util.List;

public class Toggle_Light_bulb {
    public static List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        int [] freq = new  int[101];
        List<Integer> list = new ArrayList<>();
        for (int i=0;i<bulbs.size();i++){
            freq[bulbs.get(i)]++;
        }
         for (int i=0;i<freq.length;i++){
            if (freq[i]!=0 && freq[i]%2!=0) list.add(i);
        }
        return list;
    }
    public static void main(String[] args) {
        int arr[] = { 20, 10, 30, 30,5,7,20,50 };
        List<Integer> list = new ArrayList<>();
        for (int ele : arr) list.add(ele);
       System.out.println(toggleLightBulbs(list));
    }
}
