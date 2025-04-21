import java.util.Scanner;

public class ArrayByinput {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the size of Array:");
        int size=input.nextInt();
        int Array[]=new int[size];

        for (int i = 0; i <size; i++) {
            System.out.print("Enter Array Element:");
            ;
            Array[i]=input.nextInt();
            
        }

        for (int i = 0; i < size; i++) {
            System.out.print(Array[i] + " ");
        }
        input.close();
    }
}
