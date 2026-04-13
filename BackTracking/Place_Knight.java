public class Place_Knight {
    public static int max = -1;

    public static boolean check(char[][] grid, int row, int col) {
        int n = grid.length;
        int i, j;
        // check 2 up 1 right
        i = row - 2;
        j = col + 1;
        if (i >= 0 && j < n && grid[i][j] == 'K')
            return false;
        // check 2 up 1 left
        i = row - 2;
        j = col - 1;
        if (i >= 0 && j >= 0 && grid[i][j] == 'K')
            return false;
        ;
        // check 2 Down 1 right
        i = row + 2;
        j = col + 1;
        if (i < n && j < n && grid[i][j] == 'K')
            return false;
        ;
        // check 2 Down 1 Left
        i = row + 2;
        j = col - 1;
        if (i < n && j >= 0 && grid[i][j] == 'K')
            return false;
        ;
        // check 2 right 1 up
        i = row - 1;
        j = col + 2;
        if (i >= 0 && j < n && grid[i][j] == 'K')
            return false;
        ;
        // check 2 right 1 Down
        i = row + 1;
        j = col + 2;
        if (i < n && j < n && grid[i][j] == 'K')
            return false;
        ;
        // check 2 Left 1 up
        i = row - 1;
        j = col - 2;
        if (i >= 0 && j >= 0 && grid[i][j] == 'K')
            return false;
        // check 2 Left 1 Down
        i = row + 1;
        j = col - 2;
        if (i < n && j >= 0 && grid[i][j] == 'K')
            return false;
        return true;
    }

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

    public static void nKnight(char[][] board, int row, int col, int num) {
        int n = board.length;
        if (row == n) {
            // display(board);
            max = Math.max(num, max);
            return;
        }
        int i = row;
        int j = col;
        if (check(board, row, col)) {
            board[i][j] = 'K';
            if (col != n - 1)
                nKnight(board, row, col + 1, num + 1);
            else
                nKnight(board, row + 1, 0, num + 1);
            board[i][j] = 'X';
        }
        if (col != n - 1)
            nKnight(board, row, col + 1, num);
        else
            nKnight(board, row + 1, 0, num);
    }

    public static void main(String[] args) {
        int n = 3;
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }
        nKnight(board, 0, 0, 0);
        System.out.println(max);
    }
}
