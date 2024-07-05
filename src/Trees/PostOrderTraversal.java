package Trees;

// Node class to represent each node in the binary tree
class Node1 {
    int data;
    Node1 left, right;

    public Node1(int item) {
        data = item;
        left = right = null;
    }
}

// BinaryTree class to represent the binary tree
class PostOrderTraversal {
    Node1 root;

    public PostOrderTraversal() {
        root = null;
    }

    // Method to perform postorder traversal
    void postorderTraversal(Node1 node) {
        if (node == null)
            return;

        // First traverse the left subtree
        postorderTraversal(node.left);

        // Then traverse the right subtree
        postorderTraversal(node.right);

        // Finally print the data of node
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {
        PostOrderTraversal tree = new PostOrderTraversal();
        tree.root = new Node1(1);
        tree.root.left = new Node1(2);
        tree.root.right = new Node1(3);
        tree.root.left.left = new Node1(4);
        tree.root.left.right = new Node1(5);

        System.out.println("Postorder traversal of binary tree is: ");
        tree.postorderTraversal(tree.root);
    }
}
