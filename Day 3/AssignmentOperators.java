public class AssignmentOperators {
    public static void main(String[] args) {
        int a = 10;

        System.out.println("Initial value of a: " + a);

        // Simple assignment
        a = 5;
        System.out.println("After a = 5: " + a);

        // Add and assign
        a += 3; // same as a = a + 3
        System.out.println("After a += 3: " + a);

        // Subtract and assign
        a -= 2; // same as a = a - 2
        System.out.println("After a -= 2: " + a);

        // Multiply and assign
        a *= 4; // same as a = a * 4
        System.out.println("After a *= 4: " + a);

        // Divide and assign
        a /= 2; // same as a = a / 2
        System.out.println("After a /= 2: " + a);

        // Modulus and assign
        a %= 3; // same as a = a % 3
        System.out.println("After a %= 3: " + a);
    }
}
