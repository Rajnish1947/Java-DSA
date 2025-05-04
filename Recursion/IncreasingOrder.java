package Recursion;

import java.util.Scanner;
public class IncreasingOrder {
    public static void IncreasingOrderOfNumbrer(int number){
        if (number==1) {
           System.out.print(number +" ");
            return  ;
            
        }
        IncreasingOrderOfNumbrer(number-1);
        System.out.print(number+" ");
       
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your number :");
        int number=input.nextInt();
        // for (int i = number; i > 0; i--) {
        //     System.out.print(i+ " ");
        // }

        IncreasingOrderOfNumbrer(number);
        //help of recursion
    }
}
