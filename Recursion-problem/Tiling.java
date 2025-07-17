public class Tiling {

    public static int TilingProblem(int n) {
        // Base cases
        if (n == 0 || n == 1) {
            return 1;
        }

        // Recursive case
        int vertically = TilingProblem(n - 1);
        int horizontally = TilingProblem(n - 2);

        int totalWays = vertically + horizontally;
        return totalWays;
    }

    public static void main(String[] args) {
        System.out.println(TilingProblem(8));  // Output: 3
    }
}

