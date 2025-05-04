import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
    //   there scanner is class and sytem.in
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your input :");
        String Name=input.nextLine();
        System.out.println("this is your input " +Name);
    }
}
