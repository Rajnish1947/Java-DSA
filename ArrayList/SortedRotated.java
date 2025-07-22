import java.util.ArrayList;
public class SortedRotated   {
    public static boolean pairInSortedRotated(ArrayList<Integer> arr, int target) {
        int n = arr.size();

        // Step 1: Find the pivot (index of smallest element)
        int pivot = -1;
        for (int i = 0; i < n - 1; i++) {
            if (arr.get(i) > arr.get(i + 1)) {
                pivot = i + 1;
                break;
            }
        }

        if (pivot == -1) pivot = 0; // If not rotated at all

        // Step 2: Use two pointers
        int left = pivot;
        int right = (pivot - 1 + n) % n;

        while (left != right) {
            int sum = arr.get(left) + arr.get(right);

            if (sum == target)
                return true;
            else if (sum < target)
                left = (left + 1) % n;
            else
                right = (right - 1 + n) % n;
        }

        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(11);
        arr.add(15);
        arr.add(6);
        arr.add(8);
        arr.add(9);
        arr.add(10);

        int target = 16;

        System.out.println("Pair exists: " + pairInSortedRotated(arr, target));
    }
}
