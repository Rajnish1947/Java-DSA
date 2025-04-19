import java.util.Scanner;

public class TernaryOnly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Ternary logic
        String result = (a > b) ? (a + " is larger") : 
                         (b > a) ? (b + " is larger") : 
                         "Both numbers are equal";

        System.out.println(result);

        sc.close();
    }
}
// import java.util.Scanner;

// public class OddEvenTernary {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Taking input
//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();

//         // Ternary to check even or odd
//         String result = (num % 2 == 0) ? "Even" : "Odd";

//         System.out.println("The number is: " + result);

//         sc.close();
//     }
// }

