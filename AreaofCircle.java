import java.util.Scanner;

public class AreaofCircle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        float r = input.nextFloat();

        float area = 3.14f * r * r;
        System.out.println("The area of the circle is " + area);
    }
}

