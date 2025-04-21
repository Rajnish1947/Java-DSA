import java.util.Scanner;

public class ArrayUpdate {
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Input array size and elements
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] userArray = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            userArray[i] = scanner.nextInt();
        }

        // Step 2: Ask for index and new value
        System.out.print("Enter the index you want to update: ");
        int index = scanner.nextInt();

        // Check if index is valid
        if (index >= 0 && index < size) {
            System.out.print("Enter the new value: ");
            int newValue = scanner.nextInt();
            userArray[index] = newValue;
        } else {
            System.out.println("Invalid index!");
        }

        // Step 3: Print the updated array
        System.out.println("Updated array:");
        for (int i = 0; i < size; i++) {
            System.out.print(userArray[i] + " ");
        }

        scanner.close();
    }
}
