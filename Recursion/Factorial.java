package Recursion;

import java.util.Scanner;

public class Factorial {
    public static int factorial(int number) {
        if (number == 0) {
            return 1;
        }
        System.out.print(number + " * " + " ");
        int Factorial = number * factorial(number - 1);
        return Factorial;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Number :");
        int number = input.nextInt();
        input.close();
        System.out.println(" = " +factorial(number));

    }
}
