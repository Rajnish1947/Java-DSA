package Sorting;

import java.util.*;

public class InbuiltSorting {

    // Print the array
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 5, 7, 8, 5, 23, 54 };
        int arr1[] = { 3, 2, 5, 7, 8, 5, 23, 54 };

        // Inbuilt Bubble Sort (Arrays.sort() does it efficiently)
        Arrays.sort(arr);
        System.out.print("Inbuilt Sort (arr): ");
        printArray(arr);

        // Inbuilt Selection Sort equivalent (Arrays.sort())
        Arrays.sort(arr1);
        System.out.print("Inbuilt Sort (arr1): ");
        printArray(arr1);

    }

}
