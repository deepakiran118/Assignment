package Module15;

class Node {
    int data;
    Node left, right;

    Node(int value){
        data = value;
        left = right = null;
    }
}

public class BSTInsert {

    Node root;

    Node insert(Node root, int key){
        if(root == null)
            return new Node(key);

        if(key < root.data)
            root.left = insert(root.left, key);
        else
            root.right = insert(root.right, key);

        return root;
    }

    void inorder(Node root){
        if(root != null){
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args){
        BSTInsert tree = new BSTInsert();

        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 70);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 40);
        tree.root = tree.insert(tree.root, 60);
        tree.root = tree.insert(tree.root, 80);

        System.out.println("Inorder Traversal:");
        tree.inorder(tree.root);
    }
}