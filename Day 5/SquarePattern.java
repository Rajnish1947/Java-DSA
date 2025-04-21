import java.util.Scanner;

public class SquarePattern {
public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.print("Enter the n values :");
    int n=input.nextInt();
    for(int i=1; i<=n; i++){
        System.out.println(" * * * * *");
    }
    input.close();
}
    
}
