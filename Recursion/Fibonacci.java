package Recursion;

import java.util.Scanner;

public class Fibonacci {
    public static int fibonacciSeries(int number) {
        if (number == 0 || number == 1) {
            return number;
        }
        int fn1 = fibonacciSeries(number - 1);
        int fn2 = fibonacciSeries(number - 2);
        return fn1 + fn2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for Fibonacci series: ");
        int number = input.nextInt();
        System.out.println("Fibonacci number at position " + number + " is: " + fibonacciSeries(number));
        input.close();
    }
}

