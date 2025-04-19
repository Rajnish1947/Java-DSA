import java.util.Scanner;

public class IfElseWithInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object

        System.out.print("Enter a number: ");
        int number = sc.nextInt(); // Take integer input from user

        if (number >= 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is negative.");
        }

        sc.close(); // Close the scanner
    }
}
