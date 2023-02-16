public class Bole_20230216_4 {
    public int queens (int n) {
        // write code here
        int[] res = new int[1];
        if (n <= 0) {
            return res[0];
        }
        boolean[] columns = new boolean[n];
        boolean[] b1 = new boolean[2 * n - 1];
        boolean[] b2 = new boolean[2 * n - 1];
        dfs(0, n, res, columns, b1, b2);
        return res[0];
    }

    private void dfs(int i, int n, int[] res, boolean[] columns, boolean[] b1, boolean[] b2) {
        if (i == n) {
            res[0]++;
            return;
        }
        for (int column = 0; column < n; column++) {
            int b1_index = column - i + n - 1;
            int b2_index = column + i;
            if (columns[column] || b1[b1_index] || b2[b2_index]) {
                continue;
            }
            columns[column] = true;
            b1[b1_index] = true;
            b2[b2_index] = true;
            dfs(i + 1, n, res, columns, b1, b2);
            columns[column] = false;
            b1[b1_index] = false;
            b2[b2_index] = false;
        }
    }
}
