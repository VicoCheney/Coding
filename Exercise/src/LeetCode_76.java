import java.util.HashMap;

public class LeetCode_76 {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> tmap = new HashMap<>();
        HashMap<Character, Integer> smap = new HashMap<>();
        for (char tt:t.toCharArray()) {
            tmap.put(tt, tmap.getOrDefault(tt, 0) + 1);
        }
        int l = 0;
        int r = -1;
        int ansL = -1;
        int ansR = -1;
        int len = s.length() + 1;
        while (r < s.length()) {
            r++;
            if (r < s.length() && tmap.containsKey(s.charAt(r))) {
                smap.put(s.charAt(r), smap.getOrDefault(s.charAt(r), 0) + 1);
            }
            while (check(tmap, smap) && l <= r) {
                if (r - l + 1 < len) {
                    len = r - l + 1;
                    ansL = l;
                    ansR = r + 1;
                }
                if (tmap.containsKey(s.charAt(l))) {
                    smap.put(s.charAt(l), smap.get(s.charAt(l)) - 1);
                }
                l++;
            }
        }
        return ansL == -1 ? "" : s.substring(ansL, ansR);
    }

    private static boolean check(HashMap<Character, Integer> tmap, HashMap<Character, Integer> smap) {
        for (char tc:tmap.keySet()) {
            if (smap.containsKey(tc) && smap.get(tc) >= tmap.get(tc)) {
            } else {
                return false;
            }
        }
        return true;
    }
}
