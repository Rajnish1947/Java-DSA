import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input two boolean values
        System.out.print("Enter true or false for first condition: ");
        boolean a = input.nextBoolean();

        System.out.print("Enter true or false for second condition: ");
        boolean b = input.nextBoolean();

        // Logical AND
        System.out.println("a && b (AND): " + (a && b));

        // Logical OR
        System.out.println("a || b (OR): " + (a || b));

        // Logical NOT
        System.out.println("!a (NOT a): " + (!a));
        System.out.println("!b (NOT b): " + (!b));

    }
}
