

public class ThreeQueensInNxN {

    static int N = 4;  // Change board size here
    static int[][] board = new int[N][N];
    static int count = 0;

    public static void main(String[] args) {
        solve(0, 0);
        System.out.println("Total number of ways to place 3 queens: " + count);
    }

    // Function to solve the 3-Queen problem using backtracking
    public static void solve(int row, int queensPlaced) {
        // If 3 queens are successfully placed, count and print solution
        if (queensPlaced == 3) {
            count++;
            printBoard();
            return;
        }

        // If we exceed the board, return
        if (row >= N)
            return;

        for (int col = 0; col < N; col++) {
            if (isSafe(row, col)) {
                board[row][col] = 1;
                solve(row + 1, queensPlaced + 1); // Move to next row
                board[row][col] = 0; // Backtrack
            }
        }

        // Optionally skip placing a queen in this row
        solve(row + 1, queensPlaced);
    }

    // Check if placing queen at (row, col) is safe
    public static boolean isSafe(int row, int col) {
        // Check column
        for (int i = 0; i < row; i++)
            if (board[i][col] == 1)
                return false;

        // Check left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;

        // Check right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < N; i--, j++)
            if (board[i][j] == 1)
                return false;

        return true;
    }

    // Print current board configuration
    public static void printBoard() {
        System.out.println("Solution " + count + ":");
        for (int[] row : board) {
            for (int cell : row) {
                System.out.print((cell == 1 ? "Q " : ". "));
            }
            System.out.println();
        }
        System.out.println();
    }
}

