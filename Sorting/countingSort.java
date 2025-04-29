package Sorting;

public class countingSort {

    // Counting Sort function
    public static void countingSort(int arr[]) {
        // Step 1: Find the maximum value in the array
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        // Step 2: Create a count array
        int count[] = new int[largest + 1];

        // Step 3: Store the frequency of each element
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // Step 4: Sort the array
        int j = 0; // index for original array
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    // Print array function
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        int arr[] = {1, 4, 1, 3, 2, 4, 3, 7};

        System.out.print("Original Array: ");
        printArray(arr);

        countingSort(arr);

        System.out.print("Sorted Array (Counting Sort): ");
        printArray(arr);
    }
}
