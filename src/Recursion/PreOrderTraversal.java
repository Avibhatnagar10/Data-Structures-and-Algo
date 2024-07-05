// Node class to represent each node in the binary tree
class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

// BinaryTree class to represent the binary tree
class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    // Method to perform preorder traversal
    void preorderTraversal(Node node) {
        if (node == null)
            return;

        // First print the data of node
        System.out.print(node.data + " ");

        // Then traverse the left subtree
        preorderTraversal(node.left);

        // Finally, traverse the right subtree
        preorderTraversal(node.right);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Preorder traversal of binary tree is: ");
        tree.preorderTraversal(tree.root);
    }
}
