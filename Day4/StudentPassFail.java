import java.util.Scanner;

public class StudentPassFail {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        // Using ternary operator to check pass/fail
        String result = (marks >= 33) ? "Pass" : "Fail";

        System.out.println("You " + result);

        sc.close();
    }
}
