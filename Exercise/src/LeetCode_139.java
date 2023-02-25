import java.util.Arrays;
import java.util.List;

public class LeetCode_139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        int[] memo = new int[s.length()];
        Arrays.fill(memo, 0);
        return canBreak(s, wordDict, memo, 0);
    }

    public boolean canBreak(String s, List<String> wordDict, int[] memo, int start) {
        if (memo[start] != 0) {
            return memo[start] == 1;
        }
        for (int i = start; i < s.length() + 1; i++) {
            if (wordDict.contains(s.substring(start, i))) {
                if (i == s.length()) {
                    return true;
                }
                if (canBreak(s, wordDict, memo, i)) {
                    memo[i] = 1;
                    return true;
                } else {
                    memo[i] = -1;
                }
            }
        }
        memo[start] = -1;
        return false;
    }
}
