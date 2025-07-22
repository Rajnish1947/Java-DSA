import java.util.ArrayList;

public class Sum1ByPointer {
    public static boolean pairSum(ArrayList<Integer> list1, int target) {
        int left = 0;
        int right = list1.size() - 1;

        while (left < right) {
            int sum = list1.get(left) + list1.get(right);

            if (sum == target) {
                return true;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(4);
        list1.add(6);
        list1.add(7);
        list1.add(8);

        int target = 3;
        System.out.println(pairSum(list1, target));
    }
}
