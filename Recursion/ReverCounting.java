package Recursion;

import java.util.Scanner;

public class ReverCounting {
    public static void DecreasingOrderOfNumbrer(int number){
        if (number==1) {
           System.out.println(number);
            return  ;
            
        }
        System.out.print(number+" ");
         DecreasingOrderOfNumbrer(number-1);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your number :");
        int number=input.nextInt();
        // for (int i = number; i > 0; i--) {
        //     System.out.print(i+ " ");
        // }

        DecreasingOrderOfNumbrer(number);
        //help of recursion
    }
}
