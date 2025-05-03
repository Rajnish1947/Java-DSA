import java.util.Scanner;

public class CompareOfTwoString {
   public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.print("Enter the name : ");
    String name=input.nextLine();
    if (name.equals("Rani")) {
        System.out.println("name is equal");
    } else {
       System.out.println("name is not equals"); 
    }
   } 
}
