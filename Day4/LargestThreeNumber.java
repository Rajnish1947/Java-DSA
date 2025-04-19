import java.util.Scanner;

public class LargestThreeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        // Logic to find the largest number
        if (a >= b && a >= c) {
            System.out.println("The largest number is: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("The largest number is: " + b);
        } else {
            System.out.println("The largest number is: " + c);
        }

       sc.close();
    }
}
