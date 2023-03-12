import java.util.*;

public class Didi_20230312_1 {

    private static int N;
    private static int M;
    private static int P;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] ss = in.nextLine().split(" ");
        N = Integer.parseInt(ss[0]);
        M = Integer.parseInt(ss[1]);
        P = Integer.parseInt(ss[2]);
        ArrayList<ArrayList<Integer>> ress = new ArrayList<>();
        Deque<Integer> integers = new ArrayDeque<>();
        dfs(1, 0, N, integers, ress);
        if (ress.size() != 0) {
            StringBuilder res = new StringBuilder();
            for (int i:ress.get(0)) {
                res.append(i + " ");
            }
            System.out.println(res);
        } else {
            System.out.println(-1);
        }
    }

    public static void dfs(int i, int price, int bricks, Deque<Integer> integers, ArrayList<ArrayList<Integer>> ress) {
        if (i == M) {
            price += bricks * bricks;
            if (price == P) {
                integers.add(bricks);
                ress.add(new ArrayList<>(integers));
            }
        } else {
            int max_bricks = bricks - M + i;
            for (int j = 1; j <= max_bricks; j++) {
                integers.add(j);
                dfs(i + 1, price + j * j, bricks - j, integers, ress);
                integers.removeLast();
            }
        }
    }
}
