public class LeetCode_79 {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        boolean[][] visits = new boolean[board.length][board[0].length];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j ++) {
                if (board[i][j] == word.charAt(0)) {
                    visits[i][j] = true;
                    if (checkBoard(board, word, i, j, 1, visits)) {
                        visits[i][j] = false;
                        return true;
                    }
                    visits[i][j] = false;
                }
            }
        }
        return false;
    }

    private static boolean checkBoard(char[][] board, String word, int i, int j, int s, boolean[][] visits) {
        if (s == word.length()) {
            return true;
        }
        char cs = word.charAt(s);
        if (i > 0 && !visits[i - 1][j] && board[i - 1][j] == cs) {
            visits[i - 1][j] = true;
            if (checkBoard(board, word, i - 1, j, s + 1, visits)) {
                visits[i - 1][j] = false;
                return true;
            }
            visits[i - 1][j] = false;
        }
        if (i < board.length - 1 && !visits[i + 1][j] && board[i + 1][j] == cs) {
            visits[i + 1][j] = true;
            if (checkBoard(board, word, i + 1, j, s + 1, visits)) {
                visits[i + 1][j] = false;
                return true;
            }
            visits[i + 1][j] = false;
        }
        if (j > 0 && !visits[i][j - 1] && board[i][j - 1] == cs) {
            visits[i][j - 1] = true;
            if (checkBoard(board, word, i, j - 1, s + 1, visits)) {
                visits[i][j - 1] = false;
                return true;
            }
            visits[i][j - 1] = false;
        }
        if (j < board[0].length - 1 && !visits[i][j + 1] && board[i][j + 1] == cs) {
            visits[i][j + 1] = true;
            if (checkBoard(board, word, i, j + 1, s + 1, visits)) {
                visits[i][j + 1] = false;
                return true;
            }
            visits[i][j + 1] = false;
        }
        return false;
    }
}
