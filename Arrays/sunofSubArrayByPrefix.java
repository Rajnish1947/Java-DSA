import java.util.*;

public class sunofSubArrayByPrefix {
    public static void PrintSubArray(int arr[]) {
        int n = arr.length;
        int[] prefix = new int[n];
        prefix[0] = arr[0];

        // Step 1: Create prefix sum array
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        int maxSum = Integer.MIN_VALUE;

        // Step 2: Use prefix sum to calculate subarray sums
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int currentSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                System.out.println("Subarray Sum (" + i + " to " + j + ") = " + currentSum);

                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }

        System.out.println("Maximum sum of subarray: " + maxSum);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 10 };
        PrintSubArray(arr);
    }
}
