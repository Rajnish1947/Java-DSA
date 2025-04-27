package Sorting;

public class Sorting {

    // This is our bubble sort
    public static void bubbleSort(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {


                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // This is our selection sort
    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {  // Start from i+1
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;  // Update the index of the minimum element
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    //insertionsort 
    public static void inSertionSort(int arr2[]){
        for (int i = 0; i < arr2.length; i++) {
            int current=i;
            int prev=i-1;
            while (prev>=0 && arr2[prev]>arr2[current]) {
arr2[prev+1]=arr2[prev];
prev--;                
            }
            // insr
            arr2[prev+1]=arr2[current];

        }
    }

    // Print the array
    public static void printArray(int arr1[]) {
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {3, 2, 5, 7, 8, 5, 23, 54};
        int arr1[] = {3, 2, 5, 7, 8, 5, 23, 54};
        int arr2[] = {3, 2, 5, 7, 8, 5, 23, 54};


        // Bubble Sort
        bubbleSort(arr);
        System.out.print("Bubble Sort: ");
        printArray(arr);

        // Selection Sort
        selectionSort(arr1);
        System.out.print("Selection Sort: ");
        printArray(arr1);

        // insertion Sort
        inSertionSort(arr2);
        System.out.print("Insertion sort Sort: ");
        printArray(arr2);
    }
}

