package Binarytree;

public class KthLevelSum {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    // Build tree from array (same as your earlier approach)
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

    // Sum of kth level nodes
    public static int sumAtKthLevel(Node root, int k) {
        if (root == null) return 0;
        if (k == 0) return root.data;

        int leftSum = sumAtKthLevel(root.left, k - 1);
        int rightSum = sumAtKthLevel(root.right, k - 1);

        return leftSum + rightSum;
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = BinaryTreeBuilder.buildTree(nodes);

        int k = 2;
        System.out.println("Sum of nodes at level " + k + " = " + sumAtKthLevel(root, k));
    }
}


