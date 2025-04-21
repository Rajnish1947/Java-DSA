import java.util.Scanner;

public class LoopExamples {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for the number of iterations
        System.out.print("Enter the number of iterations: ");
        int n = scanner.nextInt();
        
        // 1. For Loop
        System.out.println("\nFor Loop:");
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

        // 2. While Loop
        System.out.println("\nWhile Loop:");
        int i = 1;
        while (i <=n) {
            System.out.println(i);
            i++;
        }

        // 3. Do-While Loop
        System.out.println("\nDo-While Loop:");
        i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= n);

        // 4. Enhanced For Loop
        System.out.println("\nEnhanced For Loop:");
        int[] numbers = new int[n];
        // Fill the array with numbers from 1 to n
        for (int j = 0; j < n; j++) {
            numbers[j] = j + 1;
        }
        
        // Print the array using the enhanced for loop
        for (int number : numbers) {
            System.out.println(number);
        }

        // Close the scanner
        scanner.close();
    }
}
