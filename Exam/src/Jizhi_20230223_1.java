import java.util.HashSet;
import java.util.Objects;

public class Jizhi_20230223_1 {
    public int numDifferentIntegers (String word) {
        // write code here
        StringBuilder sb = new StringBuilder();
        for (char c:word.toCharArray()) {
            if (isNum(c)) {
                sb.append(c);
            } else {
                sb.append(' ');
            }
        }
        String s = sb.toString();
        String[] s1 = s.split(" ");
        HashSet<Integer> integers = new HashSet<>();
        int res = 0;
        for (String ss:s1) {
            if (!Objects.equals(ss, "")) {
                int sss = Integer.parseInt(ss);
                if (!integers.contains(sss)) {
                    res += sss;
                    integers.add(sss);
                }
            }
        }
        return res;
    }

    public boolean isNum(char c) {
        return c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9';
    }
}
