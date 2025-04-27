public class KadaneAlgorithm {
    public static void kadane(int[] arr) {
        int maxSum = arr[0];
        int currentSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            // Either start new subarray at arr[i], or continue the current one
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        System.out.println("Maximum subarray sum: " + maxSum);
    }

    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        kadane(arr); // Output: 6, subarray [4, -1, 2, 1]
    }
}
