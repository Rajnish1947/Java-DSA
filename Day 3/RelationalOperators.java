import java.util.Scanner;

public class RelationalOperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int a = input.nextInt();

        System.out.print("Enter second number: ");
        int b = input.nextInt();

        // Relational comparisons
        System.out.println("a == b : " + (a == b)); // equal to
        System.out.println("a != b : " + (a != b)); // not equal to
        System.out.println("a > b  : " + (a > b));  // greater than
        System.out.println("a < b  : " + (a < b));  // less than
        System.out.println("a >= b : " + (a >= b)); // greater than or equal to
        System.out.println("a <= b : " + (a <= b)); // less than or equal to

        
    }
}
