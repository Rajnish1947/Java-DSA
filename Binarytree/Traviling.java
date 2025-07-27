package Binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class Traviling {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTreeBuilder {
        static int idx = -1;

        public static Node buildTree(int[] nodes) {
            idx++;
            if (idx >= nodes.length || nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    // Preorder traversal: Root -> Left -> Right
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // inordertree
    public static void inOrder(Node root) {

        if (root == null) {
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    // postorder
    public static void postOrder(Node root) {

        if (root == null) {
            return;
        }

        postOrder(root.left);

        postOrder(root.right);
        System.out.print(root.data + " ");
    }

   // Level Order Traversal using Queue (with line breaks for each level)
public static void levelOrder(Node root) {
    if (root == null)
        return;

    Queue<Node> queue = new LinkedList<>();
    queue.add(root);
    queue.add(null); // Level marker

    while (!queue.isEmpty()) {
        Node curr = queue.remove();

        if (curr == null) {
            System.out.println(); // End of level
            if (queue.isEmpty()) break; // No more nodes
            queue.add(null); // Add marker for next level
        } else {
            System.out.print(curr.data + " ");
            if (curr.left != null) queue.add(curr.left);
            if (curr.right != null) queue.add(curr.right);
        }
    }
}


    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        Node root = BinaryTreeBuilder.buildTree(nodes); // Build tree from array
        System.out.println("Preorder Traversal:");
        preorder(root);
        System.out.println(" ");
        inOrder(root);
        System.out.println(" ");
        postOrder(root);
        System.out.println(" ");
        levelOrder(root);
    }
}
