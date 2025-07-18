public class Permutation {

    public static void Permutation(String str, String ans) {
        // Base case: if input string is empty, print the result
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        // Recursively fix each character and permute the rest
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            Permutation(newStr, ans + current);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        Permutation(str, "");
    }
}
