import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class LeetCode_56 {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) {
            return new int[0][2];
        }
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        ArrayList<int[]> ints = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            int L = intervals[i][0], R = intervals[i][1];
            if (ints.size() == 0 || ints.get(ints.size() - 1)[1] < L) {
                ints.add(new int[]{L,R});
            } else {
                ints.get(ints.size() - 1)[1] = Math.max(ints.get(ints.size() - 1)[1], R);
            }
        }
        return ints.toArray(new int[ints.size()][]);
    }
}
