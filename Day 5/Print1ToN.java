import java.util.Scanner;

public class Print1ToN {
        public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for the value of n
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        
        // Print numbers from 1 to n using a simple loop
        System.out.println("Numbers from 1 to " + n + ":");
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

        // Close the scanner
        scanner.close();
    }

}
