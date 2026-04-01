package Module14;

class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}

public class PostorderTraversal {

    Node root;

    // Postorder traversal method
    void postorder(Node node) {
        if (node != null) {
            postorder(node.left);   // visit left subtree
            postorder(node.right);  // visit right subtree
            System.out.print(node.data + " "); // visit root
        }
    }

    public static void main(String[] args) {

        PostorderTraversal tree = new PostorderTraversal();

        // creating binary tree
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Postorder Traversal:");
        tree.postorder(tree.root);
    }
}