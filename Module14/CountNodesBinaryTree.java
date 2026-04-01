package Module14;

class Node3 {
    int data;
    Node3 left, right;

    Node3(int value){
        data = value;
        left = right = null;
    }
}

public class CountNodesBinaryTree {

    Node root;

    int countNodes(Node node){

        // if tree is empty
        if(node == null)
            return 0;

        // count left subtree nodes
        int leftCount = countNodes(node.left);

        // count right subtree nodes
        int rightCount = countNodes(node.right);

        // total nodes
        return 1 + leftCount + rightCount;
    }

    public static void main(String[] args){

        CountNodesBinaryTree tree = new CountNodesBinaryTree();

        // creating binary tree
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Total number of nodes: " + tree.countNodes(tree.root));
    }
}