public class OnArray {

    public static void BacktrackArray(int arr[], int i, int value) {
        // base
        if (i == arr.length) {
            printArray(arr);
            return;
        }
        // recursive process
        arr[i] = value;
        BacktrackArray(arr, i + 1, value + 1);
        arr[i] = arr[i] - 2;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            ;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        BacktrackArray(arr, 0, 1);
        printArray(arr);
    }
}
