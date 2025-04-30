public class SearchInMatrix {
    public static boolean searchElement(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {           // loop over rows
            for (int j = 0; j < matrix[i].length; j++) {    // loop over columns
                if (matrix[i][j] == target) {
                    System.out.println("Element " + target + " found at position: (" + i + ", " + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Element " + target + " not found in the matrix.");
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        int target = 20;
        searchElement(matrix, target);
    }
}
