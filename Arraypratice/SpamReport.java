import java.util.HashSet;

public class SpamReport {
    
        // Leetcode  3295

    public boolean reportSpam(String[] message, String[] bannedWords) {
        HashSet<String> set = new HashSet<>();
        for (String str : bannedWords)
            set.add(str);
        int count = 2;
        for (String str : message) {
            if (set.contains(str))
                count--;
            if (count == 0)
                return true;
        }
        return false;
    }

}
