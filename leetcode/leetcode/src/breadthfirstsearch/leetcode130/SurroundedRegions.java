package bradthfirstsearch.leetcode130;

public class SurroundedRegions {
    public void solve(char[][] board) {
        if (board.length == 0 || board[0].length == 0) {
            return;
        }
        int m = board.length, n = board[0].length;

        for (int i = 0; i < m; i++) {
            flush(board, i, 0);
            flush(board, i, n - 1);
        }
        for (int j = 0; j < n; j++) {
            flush(board, 0, j);
            flush(board, m - 1, j);
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                flip(board, i, j);
            }
        }
    }

    private void flush(char[][] board, int i, int j) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != 'O') {
            return;
        }
        board[i][j] = 0;
        flush(board, i - 1, j);
        flush(board, i + 1, j);
        flush(board, i, j + 1);
        flush(board, i, j - 1);
    }

    private void flip(char[][] board, int i, int j) {
        if (board[i][j] == 'O') {
            board[i][j] = 'X';
        } else if (board[i][j] == 0) {
            board[i][j] = 'O';
        }
    }
}
