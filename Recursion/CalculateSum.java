package Recursion;

import java.util.Scanner;

public class CalculateSum {
    public static int Sumnatural(int number) {
        if (number==1) {
            return 1;
        }
        int Sum = number  + Sumnatural(number - 1);
        return Sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Natural Number :");
        int number = input.nextInt();
        input.close();
        System.out.println(Sumnatural(number));
    }
}
