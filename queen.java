public class queen{
    static int solution=0;

    public static void queens(int n){
        char board[][]=new char[n][n];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                board[i][j]='.';
            }
        }
        helper(board,0);
    }
    
    public static void helper(char board [][],int row){
        if(row==board.length){
            display(board);
            solution++;
            return;
        }

        for(int col=0;col<board.length;col++){
            if(isSafe(row,col,board)){
                board[row][col]='Q';
                helper(board,row+1);
                board[row][col]='.';
            }
        }
    }

    public static boolean isSafe(int row,int col,char board[][]){
        for(int c=0;c<board.length;c++){
            if(board[row][c]=='Q'){
                return false;
            }
        }
        for(int r=0;r<board.length;r++){
            if(board[r][col]=='Q'){
                return false;
            }
        }
        fe
        int r=row; //left up
        for(int c=col;c>=0 && r>=0;c--,r--){
            if(board[r][c]=='Q'){
                return false;
            }
        }

        r=row; //right up
        for(int c=col;c<board.length && r>=0;c++,r--){
            if(board[r][c]=='Q'){
                return false;
            }
        }
        return true;
    }

    public static void display(char board[][]){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        queens(8);
        System.out.println("no of solutions="+solution);
    }
}