// public class sumOfDiagonals {
//     public static void sumOfDiagonals(int[][] matrix) {
//         int rows = matrix.length;
//         int cols = matrix[0].length;

//         if (rows != cols) {
//             System.out.println("Matrix is not square. Cannot compute diagonal sums.");
//             return;
//         }

//         int primarySum = 0;
//         int secondarySum = 0;

//         for (int i = 0; i < rows; i++) {
//             primarySum += matrix[i][i];
//             secondarySum += matrix[i][cols - 1 - i];
//         }

//         int totalSum = primarySum + secondarySum;

//         if (rows % 2 == 1) {
//             totalSum -= matrix[rows / 2][cols / 2];
//         }

//         System.out.println("Primary Diagonal Sum: " + primarySum);
//         System.out.println("Secondary Diagonal Sum: " + secondarySum);
//         System.out.println("Total Diagonal Sum: " + totalSum);
//     }

//     public static void main(String[] args) {
//         int[][] matrix = {
//             {1, 2, 3, 8},
//             {4, 5, 6, 9},
//             {7, 8, 9, 8}
//         };

//         sumOfDiagonals(matrix);
//     }
// }



public class DiagonalSumNonSquare {
    public static void sumOfDiagonals(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int primarySum = 0;
        int secondarySum = 0;

        for (int i = 0; i < rows; i++) {
            // Primary Diagonal: i == j
            if (i < cols) {
                primarySum += matrix[i][i];
            }

            // Secondary Diagonal: i + j == cols - 1 → j = cols - 1 - i
            int secCol = cols - 1 - i;
            if (secCol >= 0 && secCol < cols) {
                secondarySum += matrix[i][secCol];
            }
        }

        // Handle overlapping center element only if it's square and odd
        int totalSum = primarySum + secondarySum;
        if (rows == cols && rows % 2 == 1) {
            totalSum -= matrix[rows / 2][cols / 2];
        }

        System.out.println("Primary Diagonal Sum: " + primarySum);
        System.out.println("Secondary Diagonal Sum: " + secondarySum);
        System.out.println("Total Diagonal Sum: " + totalSum);
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 8},
            {4, 5, 6, 9},
            {7, 8, 9, 8}
        };

        sumOfDiagonals(matrix);
    }
}
