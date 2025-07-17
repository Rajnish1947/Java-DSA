public class PrintBinaryString {

    public static void printBinaryStrings(int n, int lastPlace, StringBuilder str) {
        if (n == 0) {
            System.out.println(str.toString());
            return;
        }

        // Append '0' and recurse
        str.append("0");
        printBinaryStrings(n - 1, 0, str);
        str.deleteCharAt(str.length() - 1); // backtrack

        // Append '1' only if lastPlace was 0
        if (lastPlace == 0) {
            str.append("1");
            printBinaryStrings(n - 1, 1, str);
            str.deleteCharAt(str.length() - 1); // backtrack
        }
    }

    public static void main(String[] args) {
        int n = 3; // Change this value for different lengths
        printBinaryStrings(n, 0, new StringBuilder());
    }
}
