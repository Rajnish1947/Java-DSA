import java.util.*;

public class ArrayListAllOperations {
    public static void main(String[] args) {

        // 1. Create ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        // 2. Add elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(1, 15); // add 15 at index 1
        System.out.println("After Adding: " + list);  // [10, 15, 20, 30]

        // 3. Access elements
        System.out.println("Element at index 2: " + list.get(2)); // 20

        // 4. Update element
        list.set(2, 25); // change 20 to 25
        System.out.println("After Update: " + list); // [10, 15, 25, 30]

        // 5. Remove element
        list.remove(1); // remove index 1 (15)
        list.remove(Integer.valueOf(25)); // remove by value
        System.out.println("After Removal: " + list); // [10, 30]

        // 6. Contains / Search
        System.out.println("Contains 30? " + list.contains(30)); // true
        System.out.println("Index of 30: " + list.indexOf(30)); // 1

        // 7. Size & isEmpty
        System.out.println("Size: " + list.size()); // 2
        System.out.println("Is Empty? " + list.isEmpty()); // false

        // 8. Clone
        ArrayList<Integer> cloneList = (ArrayList<Integer>) list.clone();
        System.out.println("Cloned List: " + cloneList); // [10, 30]

        // 9. AddAll
        ArrayList<Integer> newList = new ArrayList<>();
        newList.add(40);
        newList.add(50);
        list.addAll(newList);
        System.out.println("After addAll: " + list); // [10, 30, 40, 50]

        // 10. removeAll
        list.removeAll(newList);
        System.out.println("After removeAll: " + list); // [10, 30]

        // 11. retainAll
        list.add(40);
        list.add(50);
        list.retainAll(newList);
        System.out.println("After retainAll (only common): " + list); // [40, 50]

        // 12. Iterate using for-each
        System.out.print("For-each: ");
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 13. Iterate using for loop
        System.out.print("For loop: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // 14. Replace all values (e.g., multiply by 2)
        list.replaceAll(x -> x * 2);
        System.out.println("After replaceAll: " + list); // [80, 100]

        // 15. Sorting
        Collections.sort(list);
        System.out.println("Sorted Ascending: " + list); // [80, 100]
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Sorted Descending: " + list); // [100, 80]

        // 16. toArray
        Integer[] array = list.toArray(new Integer[0]);
        System.out.println("Array: " + Arrays.toString(array)); // [100, 80]

        // 17. Clear all elements
        list.clear();
        System.out.println("After Clear: " + list); // []
    }
}

