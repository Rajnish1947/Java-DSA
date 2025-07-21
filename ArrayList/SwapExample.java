import java.util.ArrayList;
import java.util.Collections;

public class SwapExample {
    public static void main(String[] args) {
        // Create and fill the ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);

        System.out.println("Original List: " + list);

        // 1️⃣ Swap using Collections.swap()
        Collections.swap(list, 0, 2); // swap elements at index 0 and 2
        System.out.println("After swap using Collections.swap(): " + list);

        // 2️⃣ Manual swap using a temporary variable
        int i = 1; // index 1
        int j = 3; // index 3
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);

        System.out.println("After manual swap using loop logic: " + list);
    }
}

