import java.util.Scanner;

public class ArithmeticOperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int a = input.nextInt();

        System.out.print("Enter second number: ");
        int b = input.nextInt();

        // Arithmetic operations
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));

        // Check for division by zero
        if (b != 0) {
            System.out.println("Division: " + (a / b));
            System.out.println("Modulus (Remainder): " + (a % b));
        } else {
            System.out.println("Cannot divide or find remainder with zero.");
        }

        
    }
}
