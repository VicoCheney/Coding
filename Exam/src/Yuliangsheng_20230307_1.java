import java.util.ArrayList;

public class Yuliangsheng_20230307_1 {

    //给定一个m*n的矩阵，如果一个元素为0，则将其所在行和列的所有元素都设为0。请使用原地修改输入实现。 用例A：输入[[1,1,1], [1,0,1],[1,1,1]]，输出[[1,0,1], [0,0,0], [1,0,1]]。 用例B：输入[[0,1,2,0], [3,4,5,2], [1,3,1,5]]，输出[[0,0,0,0], [0,4,5,0], [0,3,1,0]]

    public void change(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        ArrayList<Integer> rows = new ArrayList<>();
        ArrayList<Integer> columns = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    rows.add(i);
                    columns.add(j);
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (rows.contains(i) || columns.contains(j)) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
