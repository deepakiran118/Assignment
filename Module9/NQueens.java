package Module9;
public class NQueens {
    final int N = 4;
    int solutionCount = 0;

    // Method to check if a queen can be placed
    boolean isSafe(int board[][], int row, int col) {
        int i, j;
        for (i = 0; i < col; i++)
            if (board[row][i] == 1) return false;

        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1) return false;

        for (i = row, j = col; j >= 0 && i < N; i++, j--)
            if (board[i][j] == 1) return false;

        return true;
    }

    // Method to print the board with 'Q' and '.'
    void printBoard(int board[][]) {
        solutionCount++;
        System.out.println("Solution " + solutionCount + ":");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(board[i][j] == 1 ? " Q " : " . ");
            }
            System.out.println();
        }
        System.out.println("-----------------");
    }

    // Backtracking function to find ALL solutions
    void solveNQ(int board[][], int col) {
        // Base Case: If all queens are placed, print the board
        if (col == N) {
            printBoard(board);
            return; // Return to find the next possible solution
        }

        for (int i = 0; i < N; i++) {
            if (isSafe(board, i, col)) {
                board[i][col] = 1; // Place queen

                // Recur to place the rest
                solveNQ(board, col + 1);

                // BACKTRACK: Remove queen and try the next row
                board[i][col] = 0;
            }
        }
    }

    public static void main(String args[]) {
        NQueens solver = new NQueens();
        int board[][] = new int[4][4];
        solver.solveNQ(board, 0);

        if (solver.solutionCount == 0) {
            System.out.println("No solutions found.");
        } else {
            System.out.println("Total solutions found: " + solver.solutionCount);
        }
    }
}