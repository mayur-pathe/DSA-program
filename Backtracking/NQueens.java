public class NQueens {
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
            printBoard(chessBoard);
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
    public static void printBoard(char chessBoard[][]){
        System.out.println("-----chess board-----");
        for(int i=0;i<chessBoard.length;i++){
            for(int j=0;j<chessBoard.length;j++){
                System.out.print(chessBoard[i][j]+" ");
            }System.out.println();
        }
    }
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
    }
}
