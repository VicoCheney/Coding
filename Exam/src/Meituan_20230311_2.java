import java.util.Scanner;

public class Meituan_20230311_2 {

    private static int res_max = 0;
    private static int k = 0;
    private static int n = 0;
    private static int m = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        n = Integer.parseInt(s1.split(" ")[0]);
        m = Integer.parseInt(s1.split(" ")[1]);
        k = Integer.parseInt(s1.split(" ")[2]);
        String[] colors = new String[n];
        for (int i = 0; i < n; i++) {
            colors[i] = in.nextLine();
        }
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            String[] s = in.nextLine().split(" ");
            for (int j = 0; j < m; j++) {
                matrix[i][j] = Integer.parseInt(s[j]);
            }
        }

        dfs(matrix, 0, 0, colors, 0);

        System.out.println(res_max);
    }

    public static void dfs(int[][] matrix, int i, int j, String[] colors, int money) {
        if (money > res_max) {
            res_max = money;
        }
        char color = colors[i].charAt(j);
        if (i < n - 1) {
            if (color == colors[i + 1].charAt(j)) {
                dfs(matrix, i + 1, j, colors, money + matrix[i + 1][j]);
            } else {
                if (money >= k) {
                    dfs(matrix, i + 1, j, colors, money + matrix[i + 1][j] - k);
                }
            }
        }
        if (j < m - 1) {
            if (color == colors[i].charAt(j + 1)) {
                dfs(matrix, i, j + 1, colors, money + matrix[i][j + 1]);
            } else {
                if (money >= k) {
                    dfs(matrix, i, j + 1, colors, money + matrix[i][j + 1] - k);
                }
            }
        }
    }
}
