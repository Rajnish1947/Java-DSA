import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for the value of n
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        
        // Method 1: Using a loop
        int sumLoop = 0;
        for (int i = 1; i <= n; i++) {
            sumLoop += i; // Add each number to sumLoop
        }

        // Method 2: Using the formula
        int sumFormula = (n * (n + 1)) / 2;

        // Output the results
        System.out.println("Sum using loop: " + sumLoop);
        System.out.println("Sum using formula: " + sumFormula);

        // Close the scanner
        scanner.close();
    }
}
