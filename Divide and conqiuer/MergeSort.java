public class MergeSort {

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);
        merge(arr, si, ei, mid);
    }

    public static void merge(int arr[], int si, int ei, int mid) {
        int temp[] = new int[ei - si + 1];
        int i = si;       // pointer for left part
        int j = mid + 1;  // pointer for right part
        int k = 0;        // pointer for temp array

        // Compare and merge both parts
        while (i <= mid && j <= ei) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Copy remaining elements from left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements from right part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy temp back to original array
        for (int m = 0; m < temp.length; m++) {
            arr[si + m] = temp[m];
        }
    }

    public static void main(String[] args) {
        int arr[] = {3, 5, 78, 8, 9, 4};
        System.out.println("Original Array:");
        printArray(arr);

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}
