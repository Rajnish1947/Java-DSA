package Recursion;

public class OptimizePower {
    public static int powerOfn(int number, int n) {
        if (n == 0) {
            return 1;
        }

        int halfPower = powerOfn(number, n / 2);

        int power = halfPower * halfPower;

        if (n % 2 != 0) {
            return number * power;
        }

        return power;
    }

    public static void main(String[] args) {
        System.out.println(powerOfn(2, 5)); // Output: 32
    }
}
