public class StringCompression {
    public static String compress(String str) {
        String compressed = "";

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            int count = 1;

            // Count repeated characters
            while (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            compressed += currentChar;

            if (count > 1) {
                compressed += count;
            }
        }

        return compressed;
    }

    public static void main(String[] args) {
        String str = "aaabbcccdd";
        String result = compress(str);
        System.out.println("Compressed string: " + result);  // Output: a3b2c3d2
    }
}
