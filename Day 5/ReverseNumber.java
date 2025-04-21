import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
           System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        while (num >0) {
            int lastDigit=num%10;
            System.out.print(lastDigit + " ");
            num=num/10;
            
        }
        System.out.println();
        scanner.close();
    }
}
