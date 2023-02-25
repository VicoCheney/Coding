import java.util.HashSet;

public class LeetCode_128 {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num: nums) {
            set.add(num);
        }
        int res = 0;
        for (int num: nums) {
            if (!set.contains(num - 1)) {
                int cur = num;
                int len = 1;
                while (set.contains(cur + 1)) {
                    cur ++;
                    len ++;
                }
                res = Math.max(res, len);
            }
        }
        return res;
    }
}
