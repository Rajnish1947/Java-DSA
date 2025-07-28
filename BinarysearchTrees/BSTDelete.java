public class BSTDelete {

    // Node class for BST
    static class Node {
        int data;
        Node left, right;

        Node(int val) {
            this.data = val;
        }
    }

    // Insert a value into the BST
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

    // Delete a node from BST
    public static Node deleteNode(Node root, int key) {
        if (root == null) return null;

        // Traverse left or right depending on the key
        if (key < root.data) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.data) {
            root.right = deleteNode(root.right, key);
        } else {
            //  Node found – start deletion cases

            // Case 1: Node has no children (leaf)
            if (root.left == null && root.right == null) {
                return null;
            }

            //  Case 2: Node has only one child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            //  Case 3: Node has two children
            // Get the inorder successor (smallest in right subtree)
            Node successor = findMin(root.right);

            // Replace current node's data with successor's data
            root.data = successor.data;

            // Delete the inorder successor
            root.right = deleteNode(root.right, successor.data);
        }

        return root;
    }

    // Helper to find the minimum value in a BST (used for inorder successor)
    public static Node findMin(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    // Inorder Traversal – prints BST in sorted order
    public static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Search a key in BST
    public static boolean searchNode(Node root, int key) {
        if (root == null) return false;
        if (key < root.data) return searchNode(root.left, key);
        else if (key > root.data) return searchNode(root.right, key);
        else return true;
    }

    
    // Main method to demonstrate
    public static void main(String[] args) {
        int[] values = {8, 3, 10, 1, 6, 14, 4, 7};  // Initial BST values
        Node root = null;

        // Insert all values into the BST
        for (int val : values) {
            root = insert(root, val);
        }

        System.out.print("BST Inorder before deletion: ");
        inorder(root);
        System.out.println();

        // Search example
        int searchKey = 6;
        System.out.println("Searching for " + searchKey + ": " + (searchNode(root, searchKey) ? "Found" : "Not Found"));

        // Delete example
        int deleteKey = 3;
        System.out.println("Deleting node with key " + deleteKey);
        root = deleteNode(root, deleteKey);

        System.out.print("BST Inorder after deletion: ");
        inorder(root);
        System.out.println();
    }
}
