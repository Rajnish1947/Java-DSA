public class ThreeQueensOneSolution {

    static int N = 4; // Change board size here
    static int[][] board = new int[N][N];
    static boolean solutionFound = false;

    public static void main(String[] args) {
        solve(0, 0);
        if (!solutionFound) {
            System.out.println("No solution exists.");
        }
    }

    // Function to solve the 3-Queen problem and stop after 1 solution
    public static void solve(int row, int queensPlaced) {
        if (solutionFound) return;

        // If 3 queens are placed, print and mark found
        if (queensPlaced == 3) {
            solutionFound = true;
            printBoard();
            return;
        }

        // If row exceeds board, return
        if (row >= N)
            return;

        for (int col = 0; col < N; col++) {
            if (isSafe(row, col)) {
                board[row][col] = 1;
                solve(row + 1, queensPlaced + 1);
                if (solutionFound) return;
                board[row][col] = 0;
            }
        }

        // Try skipping this row as well (optional)
        solve(row + 1, queensPlaced);
    }

    // Safety check for queen placement
    public static boolean isSafe(int row, int col) {
        for (int i = 0; i < row; i++)
            if (board[i][col] == 1)
                return false;

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;

        for (int i = row - 1, j = col + 1; i >= 0 && j < N; i--, j++)
            if (board[i][j] == 1)
                return false;

        return true;
    }

    // Print board
    public static void printBoard() {
        System.out.println("One valid solution:");
        for (int[] row : board) {
            for (int cell : row) {
                System.out.print(cell == 1 ? "Q " : ". ");
            }
            System.out.println();
        }
    }
}
