public class Arraycreatin {

    public static void main(String[] args) {
        int Array[] = {1, 2, 5, 6}; // Array initialized with values

        int Array1[] = new int[40]; // Array of size 40
        Array1[0] = 1;
        Array1[1] = 2;
        Array1[2] = 5;
        Array1[3] = 6;

        System.out.println("Using simple for loop:");

        System.out.print("Array: ");
        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i] + " ");
        }

        System.out.print("\nArray1: ");
        for (int i = 0; i < Array1.length; i++) {
            System.out.print(Array1[i] + " ");
        }
    }
}
