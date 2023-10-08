public class NQueensCount {
    public static boolean isSafe(char chessBoard[][],int row ,int col){
        //vertical up
        for(int i=row-1;i>=0;i--){
            if(chessBoard[i][col]=='Q'){
                return false;
            }
        }
        //diagonal left up
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(chessBoard[i][j]=='Q'){
                return false;
            }
        }
        //diagonal right up
        for(int i=row-1,j=col+1;i>=0 && j<chessBoard.length;i--,j++){
            if(chessBoard[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void totalWays(char chessBoard[][],int row){
        //base case
        if(row == chessBoard.length){
            count++;
            return;
        }
        //recursion column loop
        for(int j=0;j<chessBoard.length;j++){
            if(isSafe(chessBoard,row,j)){
                chessBoard[row][j]='Q';
                totalWays(chessBoard, row+1);//function call
                chessBoard[row][j]='X';//backtracking
            }
        }
    }
    static int count =0;
    public static void main(String[] args){
        int N = 4;
        char chessBoard[][] = new char[N][N];
        //initalize a chess board
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                chessBoard[i][j]='X';
            }
        }
        totalWays(chessBoard, 0);
        System.out.println("Total no. of ways to solve a problem is : "+count);
    }
}
