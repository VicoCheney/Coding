import java.util.*;

public class Xinghuan_20230219_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();
        int[] queries = new int[q];
        HashSet<Integer> integers = new HashSet<>();
        for (int i = 0; i < n; i ++) {
            integers.add(in.nextInt());
        }
        int max_q = 0;
        for (int j = 0; j < q; j ++) {
            queries[j] = in.nextInt();
            max_q = Math.max(queries[j], max_q);
        }
        ArrayList<Integer> list = new ArrayList<>();
        int start = 0;
        for (int k = 0; k < max_q; k++) {
            start ++;
            while (integers.contains(start)) {
                start++;
            }
            list.add(start);
        }
        for (int jq: queries) {
            System.out.println(list.get(jq - 1));
        }
    }
}
