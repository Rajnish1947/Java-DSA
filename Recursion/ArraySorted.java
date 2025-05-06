package Recursion;

public class ArraySorted {
    public static boolean isSorted(int arr[], int i) {
        // Base case: if we've reached the second-last element, array is sorted
        if (i == arr.length - 1) {
            return true;
        }

        // If current element is greater than the next one, it's not sorted
        if (arr[i] > arr[i + 1]) {
            return false;
        }

        // Recursive call
        return isSorted(arr, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 7, 3, 4, 5, 6};
        System.out.println(isSorted(arr, 0));  // Output: false
    }
}
