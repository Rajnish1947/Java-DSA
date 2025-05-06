package Recursion;

public class FirstAccurenceofarray {
    public static int FirstAccurence(int arr[], int i, int key) {
        if (i == arr.length) {
            return -1;
        }

        if (arr[i] == key) {
            return i;
        }
        return FirstAccurence(arr, i + 1, key);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 4, 5, 6, 7 };
        System.out.println(FirstAccurence(arr, 0, 5));
    }
}
