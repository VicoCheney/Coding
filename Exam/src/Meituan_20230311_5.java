import java.util.Scanner;

public class Meituan_20230311_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        String colors = in.nextLine();
        String[] fathers = in.nextLine().split(" ");
        int[] fs = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            fs[i] = Integer.parseInt(fathers[i]);
        }
        int res = 0;

        for (int j = 1; j <= n; j++) {
            int dfs = dfs(j, colors, fs);
        }
    }

    public static int dfs(int num, String colors, int[] fs) {

    }
}
