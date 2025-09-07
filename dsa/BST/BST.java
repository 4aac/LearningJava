public class BST {
    Node root;

    public int treeHeight(Node node) {
        if (node == null) {
            return 0;
        }

        int leftHeight = treeHeight(node.left);
        int rightHeight = treeHeight(node.right);

        return 1 + Math.max(leftHeight, rightHeight);
    }

    public int treeHeight() {
        return treeHeight(root);
    }

    public Node insert(Node root, int value) {
        if (root == null) {
            root = new Node(value);
        } else if (value < root.data) {
            root.left = insert(root.left, data);
        } else if (value > root.data) {
            root.right = insert(root.right, data);
        }

        return root;
    }
    
}
