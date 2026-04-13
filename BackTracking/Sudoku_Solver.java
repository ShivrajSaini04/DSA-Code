 class Solve{
      public static int var=0;
     public static boolean check(char[][]board,int row ,int col,char num){
        int n= board.length;
    // row 
    for (int j=0;j<n;j++){
        if (board[row][j]==num)return false ;
    }
    // for col
     for (int i=0;i<n;i++){
        if (board[i][col]==num)return false ;
    }
    // for 3X3 matrix 
    int sr = row/3*3;
    int sc=col/3*3;
    for (int i=sr;i<sr+3;i++){
        for(int j=sc;j<sc+3;j++){
           if (board[i][j]==num)return false ;
        }
    }
    return true ;
}

       public void  solve(char [][] board,int row,int col){
        int n= board.length;
        if (row==n) {
            var=1;
            return;
        }
       else  if (board[row][col]!='.') {
            if (col!=n-1) solve(board, row, col+1);
            else solve(board, row+1, 0);
            }
        else {
               for (char ch ='1';ch<='9';ch++){
               
                if (check(board, row, col, ch)) {
                 board[row][col]=ch;
                   if (col!=n-1) solve(board, row, col+1);
                    else solve(board, row+1, 0);
                    if (var==1) return ;
                   board[row][col]='.';   // BackTracking
                }
       }
    }  
 }
    public class Sudoku_Solver {
    public static void main(String[] args) {
        
    }
}
 }