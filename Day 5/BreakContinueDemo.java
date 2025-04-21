public class BreakContinueDemo {
    public static void main(String[] args) {
        System.out.println("Demonstrating 'continue':");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Skipping number: " + i);
                continue; // Skip the rest of the loop for i == 3
            }
            System.out.println("Number: " + i);
        }

        System.out.println("\nDemonstrating 'break':");
        for (int i = 1; i <= 5; i++) {
            if (i == 4) {
                System.out.println("Breaking the loop at number: " + i);
                break; // Exit the loop when i == 4
            }
            System.out.println("Number: " + i);
        }
    }
}
