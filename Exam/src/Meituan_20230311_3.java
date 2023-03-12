import java.util.HashMap;
import java.util.Scanner;

public class Meituan_20230311_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        String[] starts_str = in.nextLine().split(" ");
        String[] ends_str = in.nextLine().split(" ");
        int[] starts = new int[n];
        int[] ends = new int[n];
        int min_start = Integer.MAX_VALUE;
        int max_end = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            starts[i] = Integer.parseInt(starts_str[i]);
            ends[i] = Integer.parseInt(ends_str[i]);
            min_start = Math.min(starts[i], min_start);
            max_end = Math.max(ends[i], max_end);
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int res_max = 0;
        for (int j = min_start; j <= max_end; j++) {
            int count = 0;
            for (int k = 0; k < n; k++) {
                if (starts[k] <= j && ends[k] >= j) {
                    count++;
                }
            }
            res_max = Math.max(res_max, count);
            map.put(j, count);
        }
        int perfect_times = 0;
        for (int time:map.keySet()) {
            if (map.get(time) == res_max) {
                perfect_times++;
            }
        }
        System.out.println(res_max + " " + perfect_times);
    }
}
