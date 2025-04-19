import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for two numbers
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        // Input for the operation to perform
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        // Switch statement to perform the operation
        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("The result is: " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("The result is: " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("The result is: " + result);
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("The result is: " + result);
                } else {
                    System.out.println("Error! Division by zero.");
                }
                break;

            default:
                System.out.println("Invalid operator! Please enter one of +, -, *, /.");
        }

        sc.close();
    }

}
