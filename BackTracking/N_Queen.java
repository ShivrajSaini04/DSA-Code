public class N_Queen {
    static void display(char[][] board) {
        int n = board.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void nqueen(char[][] board, int row) {
        int n = board.length;
        if (row == n) {
            display(board);
            return;
        }
        for (int j = 0; j < n; j++) {
            if (check(board, row, j)) {
                board[row][j] = 'Q';
                nqueen(board, row + 1);
                board[row][j] = 'X'; // Backtracking
            }
        }
    }

    public static boolean check(char[][] board, int row, int col) {
        int n = board.length;

        // check Row
        for (int j = 0; j < n; j++) {
            if (board[row][j] == 'Q')
                return false;
        }
        // check col
        for (int i = 0; i < n; i++) {
            if (board[i][col] == 'Q')
                return false;
        }
        int i = row;
        int j = col;
        // check upper rig diagonal
        while (i >= 0 && j < n) {
            if (board[i--][j++] == 'Q')
                return false;
        }
        // check upper left diagonal
        i = row;
        j = col;
        while (i >= 0 && j >= 0) {
            if (board[i--][j--] == 'Q')
                return false;
        }
        // check lower left diagonal
        i = row;
        j = col;
        while (i < n && j >= 0) {
            if (board[i++][j--] == 'Q')
                return false;
        }
        // check lower rig diagonal
        i = row;
        j = col;
        while (i < n && j < n) {
            if (board[i++][j++] == 'Q')
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }
        nqueen(board, 0);
    }
}
