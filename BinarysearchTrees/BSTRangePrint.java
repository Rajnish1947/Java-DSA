import java.util.ArrayList;

public class BSTRangePrint {

    static class Node {
        int data;
        Node left, right;

        Node(int val) {
            data = val;
            left = right = null;
        }
    }

    // Insert into BST
    public static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }
        if (val < root.data) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    // Print all nodes in range [k1, k2]
    public static void printRange(Node root, int x, int y) {
        if (root == null)
            return;

        // Traverse left if k1 < root
        if (root.data >= x && root.data <= y) {
            printRange(root.left, x, y);
            System.out.print(root.data + " ");
            printRange(root.right, x, y);
        }

        // Print if within range
        else if (root.data >= y) {
            printRange(root.left, x, y);
        }

        // Traverse right if k2 > root
        else {
            printRange(root.right, x, y);
        }
    }
public static void printPath(ArrayList<Integer> path){

    for (int i = 0; i < path.size(); i++) {
        
    }
    System.out.println();
}
    // printRoot2Leaf
    public static void printRoot2Leaf(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;

        }
        path.add(root.data);

          if(root.left==null && root.right==null){
            printPath(path);

        
    }else{
printRoot2Leaf(root.left, path);
        printRoot2Leaf(root.right, path);
    }
        
        path.remove(path.size() - 1);
    }

    // Main method
    public static void main(String[] args) {
        int[] values = { 20, 10, 5, 15, 30, 25, 35 };
        Node root = null;

        for (int val : values) {
            root = insert(root, val);
        }

        int x = 5, y = 30;
        System.out.println("Elements in range [" + x + ", " + y + "]:");
        printRange(root, x, y); // Output should be: 10 15 20 25 30
    }
  
}
