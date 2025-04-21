public class Reverse {
    public static void main(String[] args) {
        int Array[] = {1, 2, 5, 6}; // Array initialized with values

        System.out.println("Using simple for loop:");
        System.out.print("Reversed Array: ");
        
        for (int i = Array.length - 1; i >= 0; i--) {
            System.out.print(Array[i] + " ");
        }
    }
}
