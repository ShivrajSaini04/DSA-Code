
public class Valid_Sudoku {
    // check Sudoku
    public static boolean check(char[][]board,int row ,int col,int num){
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
        // result function 
    public static boolean isvalid(char[][]board){
        int n= board.length;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (board[i][j]=='.') continue;
                char num = board[i][j];
                if(check(board,i,j,num)==false) return false ;
                  board[i][j]=num;
            }
        }
        return true ;
    }
    public static void main(String[] args) {
        
    }
}
