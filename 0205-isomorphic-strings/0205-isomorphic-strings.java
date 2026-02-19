import java.util.HashMap;

public class Solution {
    public boolean isIsomorphic(String s, String t) {
      
        Map<Character, Character> hms = new HashMap<>();
        Map<Character, Character> hmt = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char cs = s.charAt(i);
            char ct = t.charAt(i);
            if (hms.containsKey(cs) && hms.get(cs) != ct)
                return false;
            if (hmt.containsKey(ct) && hmt.get(ct) != cs)
                return false;
            hms.put(cs, ct);
            hmt.put(ct, cs);
        }
        return true;
    }
}