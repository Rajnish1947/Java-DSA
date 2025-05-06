package Recursion;

public class LastAccurence {
    public static int LastAccurance(int arr[], int i, int key) {
        if (i == arr.length) {
            return -1;
        }
      int isFound=LastAccurance(arr, i + 1, key);

        if (isFound==-1 && arr[i] == key) {
            return i;
        }
        return isFound ;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 4, 5, 6, 7 };
        System.out.println(LastAccurance(arr, 0, 5));
    }
}
