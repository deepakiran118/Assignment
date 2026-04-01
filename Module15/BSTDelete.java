package Module15;

class Node3 {
    int data;
    Node3 left, right;

    Node3(int value){
        data = value;
        left = right = null;
    }
}

public class BSTDelete {

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

    int findMin(Node root){
        while(root.left != null)
            root = root.left;

        return root.data;
    }

    Node delete(Node root, int key){

        if(root == null)
            return null;

        if(key < root.data)
            root.left = delete(root.left, key);

        else if(key > root.data)
            root.right = delete(root.right, key);

        else{

            if(root.left == null)
                return root.right;

            else if(root.right == null)
                return root.left;

            root.data = findMin(root.right);

            root.right = delete(root.right, root.data);
        }

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

        BSTDelete tree = new BSTDelete();

        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 70);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 40);

        tree.root = tree.delete(tree.root, 30);

        System.out.println("After deletion:");

        tree.inorder(tree.root);
    }
}