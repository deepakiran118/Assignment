package Module14;

class Nodes {
    int data;
    Nodes left, right;
    Nodes(int value){
        data = value;
        left = right = null;
    }
}

public class InorderTraversal {
    Node root;

    void inorder(Node node){
        if(node != null){
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }

    public static void main(String[] args){
        InorderTraversal tree = new InorderTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);

        tree.inorder(tree.root);
    }
}