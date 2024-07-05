package Trees;

// Node2 class to represent each node in the binary tree
class Node2 {
    int data;
    Node2 left, right;

    public Node2(int item) {
        data = item;
        left = right = null;
    }
}

// BinaryTree class to represent the binary tree
class BinaryTree1 {
    Node2 root;

    public BinaryTree1() {
        root = null;
    }

    // Method to perform inorder traversal
    void inorderTraversal(Node2 node) {
        if (node == null)
            return;

        // First traverse the left subtree
        inorderTraversal(node.left);

        // Then print the data of node
        System.out.print(node.data + " ");

        // Finally traverse the right subtree
        inorderTraversal(node.right);
    }

    public static void main(String[] args) {
        BinaryTree1 tree = new BinaryTree1();
        tree.root = new Node2(1);
        tree.root.left = new Node2(2);
        tree.root.right = new Node2(3);
        tree.root.left.left = new Node2(4);
        tree.root.left.right = new Node2(5);

        System.out.println("Inorder traversal of binary tree is: ");
        tree.inorderTraversal(tree.root);
    }
}
