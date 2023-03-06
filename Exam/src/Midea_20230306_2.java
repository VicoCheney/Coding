import java.util.ArrayList;
import java.util.Scanner;

public class Midea_20230306_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        String[] split = line.split("],");
        int m = split.length;
        int[][] dp = new int[m][];
        int i = 0;
        for (String l:split) {
            int j = 0;
            String[] es = l.split(",");
            dp[i] = new int[es.length];
            for (String e:es) {
                dp[i][j++] = Integer.valueOf(e.replace("[","").replace("]",""));
            }
            i++;
        }
        int n = dp[0].length;
        int[][] ndp = new int[m][n];
        for (int x = m - 1; x >= 0; x--) {
            for (int y = n - 1; y >= 0; y--) {
                if (x == m - 1 && y == n - 1) {
                    ndp[x][y] = dp[x][y];
                }
                if (x == m - 1 && y != n - 1) {
                    ndp[x][y] = ndp[x][y + 1] + dp[x][y];
                }
                if (y == n - 1 && x != m - 1) {
                    ndp[x][y] = ndp[x + 1][y] + dp[x][y];
                }
                if (x != m - 1 && y != n - 1) {
                    ndp[x][y] = dp[x][y] + Math.min(ndp[x + 1][y], ndp[x][y + 1]);
                }
            }
        }
        System.out.println(ndp[0][0]);
    }
}
