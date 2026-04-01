package Module14;
class Node1 {
    int data;
    Node1 left, right;

    Node1(int value){
        data = value;
        left = right = null;
    }
}

public class PreorderTraversal {

    Node1 root;

    void preorder(Node1 node){
        if(node != null){
            System.out.print(node.data + " "); // Root
            preorder(node.left);  // Left subtree
            preorder(node.right); // Right subtree
        }
    }

    public static void main(String[] args){

        PreorderTraversal tree = new PreorderTraversal();

        // Creating Binary Tree
        tree.root = new Node1(1);
        tree.root.left = new Node1(2);
        tree.root.right = new Node1(3);
        tree.root.left.left = new Node1(4);
        tree.root.left.right = new Node1(5);

        System.out.println("Preorder Traversal:");
        tree.preorder(tree.root);
    }
}