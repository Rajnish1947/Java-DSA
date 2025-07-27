package Binarytree;

public class Operation {
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

    // count the node
    public static int Count(Node root) {
        if (root == null) {
            return 0;
        }
        int letf = Count(root.left);
        int right = Count(root.right);

        return letf + right + 1;
    }

    // some of node
    public static int sumOfNode(Node root) {
        if (root == null) {
            return 0;

        }
        int leftsum = sumOfNode(root.left);
        int RightSum = sumOfNode(root.right);
        return leftsum + RightSum + root.data;
    }

    // height of tree

    public static int HeightOftree(Node root){
        if (root==null) {
            return 0;
        }
        int leftheight=HeightOftree(root.left);
        int RightHeight=HeightOftree(root.right);
        int maxheight=Math.max(leftheight, RightHeight) +1;
        return maxheight;
    }

    
 // diameter of tree
    public static int diameter(Node root){
        if (root == null) {
            return 0;
        }

        int diam1 = diameter(root.left);
        int diam2 = diameter(root.right);
        int diam3 = HeightOftree(root.left) + HeightOftree(root.right) + 1;

        return Math.max(diam3, Math.max(diam1, diam2));
    }

     // Diameter of the tree — using optimized approach
    static class TreeInfo {
        int height;
        int diameter;

        TreeInfo(int height, int diameter) {
            this.height = height;
            this.diameter = diameter;
        }
    }

    public static TreeInfo diameters(Node root) {
        if (root == null) return new TreeInfo(0, 0);

        TreeInfo left = diameters(root.left);
        TreeInfo right = diameters(root.right);

        int height = Math.max(left.height, right.height) + 1;
        int diaThroughRoot = left.height + right.height + 1;
        int maxDiameter = Math.max(diaThroughRoot, Math.max(left.diameter, right.diameter));

        return new TreeInfo(height, maxDiameter);
    }
   public static void main(String[] args) {
    int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

    Node root = BinaryTreeBuilder.buildTree(nodes); // Build tree from array
    System.out.println("Total number of nodes: " + Count(root));
    System.out.println("Sum of nodes: " + sumOfNode(root));
    System.out.println("Maximum height: " + HeightOftree(root));
    System.out.println("Diameter (simple): " + diameter(root));
    System.out.println("Diameter (optimized): " + diameters(root).diameter);
}

}
