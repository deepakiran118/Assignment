package Module14;

class Node2 {
    int data;
    Node2 left, right;

    Node2(int value){
        data = value;
        left = right = null;
    }
}

public class HeightBinaryTree {

    Node root;

    int height(Node node){
        // if tree is empty
        if(node == null)
            return 0;

        // find height of left subtree
        int leftHeight = height(node.left);

        // find height of right subtree
        int rightHeight = height(node.right);

        // return the larger height + 1 (for current node)
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args){

        HeightBinaryTree tree = new HeightBinaryTree();

        // creating binary tree
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Height of Binary Tree is: " + tree.height(tree.root));
    }
}