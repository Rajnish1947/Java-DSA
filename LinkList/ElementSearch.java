
public class ElementSearch {

    // Linear search
    public int search(int key) {
        Add.Node temp = Add.head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    // Recursive search
    private int helper(Add.Node head, int key) {
        if (head == null) return -1;
        if (head.data == key) return 0;
        int idx = helper(head.next, key);
        return (idx == -1) ? -1 : idx + 1;
    }

    public int recursiveSearch(int key) {
        return helper(Add.head, key);
    }

    public static void main(String[] args) {
        Add list = new Add();
        list.AddFirst(10);
        list.AddLast(20);
        list.AddLast(30);
        list.AddMiddle(1, 15);

        list.print();

        ElementSearch searcher = new ElementSearch();
        System.out.println("Search 15: " + searcher.search(15)); // Linear search
        System.out.println("Recursive Search 30: " + searcher.recursiveSearch(30));
    }
}




// package LinkList;

// public class ElementSearch {

//     // Node class
//     public static class Node {
//         int data;
//         Node next;

//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static Node head;
//     public static Node tail;
//     public static int size;

//     // Search element in list, return index or -1
//     public int search(int key) { // o(n)
//         Node temp = head;
//         int i = 0;
//         while (temp != null) {
//             if (temp.data == key) {
//                 return i;
//             }
//             temp = temp.next;
//             i++;
//         }
//         // keynot found
//         return -1;
//     }

//     // recursion helper
//     public int helper(Node head, int key) { // 0(n)
//         if (head == null) {
//             return -1;

//         }
//         if (head.data == key) {
//             return 0;

//         }
//         int idx = helper(head.next, key);
//         if (idx == -1) {
//             return -1;
//         }
//         return idx + 1;
//     }

//     // Recursive search element
//     public int RecursiveSearch(int key) {
//         return helper(head, key);
//     }

//     // Print all elements
//     public void print() {
//         if (head == null) {
//             System.out.println("List is empty");
//             return;
//         }

//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.data + " -> ");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }

//     // Return size of list
//     public int getSize() {
//         return size;
//     }

//     // Main method to test
//     public static void main(String[] args) {
//         Add ll = new Add();

//         ll.AddFirst(10);
//         ll.AddLast(20);
//         ll.AddLast(30);
//         ll.AddMiddle(1, 15); // Insert at index 1

//         ll.print(); // 10 -> 15 -> 20 -> 30 -> null

//         System.out.println("Current size: " + ll.getSize()); // 1
//         System.out.println(ll.RecursiveSearch(10));
//         System.out.println(ll.search(10));

//     }
// }
