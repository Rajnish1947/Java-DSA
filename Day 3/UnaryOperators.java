public class UnaryOperators {
    public static void main(String[] args) {
        int x = 5;

        System.out.println("Original value of x: " + x);

        // Unary minus
        System.out.println("Unary minus of x: " + (-x));

        // Increment operators
        System.out.println("Post-increment (x++): " + (x++));  // x is used, then incremented
        System.out.println("After post-increment, x: " + x);

        System.out.println("Pre-increment (++x): " + (++x));  // x is incremented, then used

        // Decrement operators
        System.out.println("Post-decrement (x--): " + (x--));
        System.out.println("After post-decrement, x: " + x);

        System.out.println("Pre-decrement (--x): " + (--x));

        // Bitwise NOT
        System.out.println("Bitwise NOT of x (~x): " + (~x));

        // Logical NOT
        boolean flag = true;
        System.out.println("Original boolean value: " + flag);
        System.out.println("Logical NOT (!flag): " + (!flag));
    }
}
