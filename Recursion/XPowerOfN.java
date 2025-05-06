package Recursion;

public class XPowerOfN {
    public static int powerOfn(int number,int n){
        if (n==0) {
           return 1; 
        }
        return number *powerOfn(number, n-1);
    }
    public static void main(String[] args) {
        System.out.println(powerOfn(7, 2));
    }
}
