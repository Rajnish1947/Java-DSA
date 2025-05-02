import java.util.Scanner;

public class Palindrome {

    public static boolean isPalindrome() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string to check for palindrome: ");
        String str = input.nextLine();

        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
              
                return false;
            }
        }
       
        return true;
    }

    public static void main(String[] args) {
        if (isPalindrome()) {
            System.out.println("Yes, it is a palindrome.");
        } else {
            System.out.println("No, it is not a palindrome.");
        }
    }
}

