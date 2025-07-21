import java.util.*;

public class ArrayListSorting {
    public static void main(String[] args) {
        // Create and add elements to the ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        list.add(40);
        list.add(10);
        list.add(30);
        list.add(20);

        // Original list
        System.out.println("Original List: " + list);

        // Ascending order
        ArrayList<Integer> ascendingList = new ArrayList<>(list);  // Clone original
        Collections.sort(ascendingList);
        System.out.println("Ascending Order: " + ascendingList);

        // Descending order
        ArrayList<Integer> descendingList = new ArrayList<>(list);  // Clone original
        Collections.sort(descendingList, Collections.reverseOrder());
        System.out.println("Descending Order: " + descendingList);
    }
}
