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






























''' The 8-Queens problem is a classical example of a constraint satisfaction problem. The task
is to place 8 queens on an 8×8 chessboard in such a way that no two queens attack each
other. In chess, a queen can move any number of squares vertically, horizontally, or
diagonally. Hence, the problem requires arranging the queens so that no two queens share
the same row, column, or diagonal.
To solve this problem efficiently, we use the backtracking technique. Backtracking is a
general algorithmic method used to solve problems by trying possible solutions and
abandoning them if they do not satisfy the required conditions. In simple terms, it is a
systematic way of exploring all possible configurations until a valid one is found.
The idea behind solving the 8-Queens problem with backtracking is as follows:
● Place a queen in a row one by one.
● For each row, check if placing the queen in a particular column is safe (i.e., it does not
conflict with any previously placed queens).
● If safe, move to the next row and place another queen.
● If not safe, backtrack and try the next column.
● Continue until all 8 queens are successfully placed or all possibilities are exhausted.
Properties of Backtracking:
1. Recursive approach – the function calls itself for the next decision step.
2. Constraint checking – ensures partial solutions are valid at every step.
3. Backtracking – if a partial solution fails, the algorithm goes back and tries another
option.
Applications of Backtracking:
● Solving puzzles like Sudoku, crosswords, and the N-Queens problem.
● Finding Hamiltonian paths and cycles in graphs.

● Generating permutations and combinations.
● Constraint satisfaction problems in AI.

Thus, the 8-Queens problem not only demonstrates the use of backtracking but also builds
a foundation for solving many AI-related search and optimization problems.'''