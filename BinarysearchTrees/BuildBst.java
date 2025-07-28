public class BuildBst {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int val) {
            this.data = val; 
            this.left = null;
            this.right = null;
        }
    }

   
    public static Node InsertNode(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            root.left = InsertNode(root.left, val);
        } else {
            root.right = InsertNode(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }


    // search key
    public static boolean Serachnode(Node root,int key){
        if (root==null) {
            return false;
            
        }
        else if (root.data >key) {
          return  Serachnode(root.left, key);
            
        }else if(root.data==key){
            return true;
        }
        else{
          return  Serachnode(root.right, key);
        }
         
    }
    public static void main(String[] args) {
        int values[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = InsertNode(root, values[i]); 
        }

        inorder(root);
        System.out.println();
        if (Serachnode(root, 4)) {
            System.out.println("found");
        }else{
            System.out.println("not found");
        }
    }
}
