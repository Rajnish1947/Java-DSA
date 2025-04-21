
public class LargestValue {

    public static void main(String[] args) {
        int arr[] = { 34, 5, 6, 78, 90, 36, 78, 89 };
        int largestvalues = arr[0]; // assume largest values is first values
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largestvalues) {
                largestvalues = arr[i];

            }
        }
        System.out.println(largestvalues);
    }
}
