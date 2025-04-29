public class DiagonalMatrix {
    public static void printDiagonals(int[][] matrix) {
        

        System.out.print("Primary Diagonal: ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + " ");
        }

        System.out.println();

        System.out.print("Secondary Diagonal: ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][matrix.length - 1 - i] + " ");
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        printDiagonals(matrix);
    }
}
