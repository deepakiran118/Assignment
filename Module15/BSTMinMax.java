package Module15;

class Node2 {
    int data;
    Node2 left, right;

    Node2(int value){
        data = value;
        left = right = null;
    }
}

public class BSTMinMax {

    Node2 root;

    Node2 insert(Node2 root, int key){
        if(root == null)
            return new Node2(key);

        if(key < root.data)
            root.left = insert(root.left, key);
        else
            root.right = insert(root.right, key);

        return root;
    }

    int findMin(Node2 root){

        while(root.left != null)
            root = root.left;

        return root.data;
    }

    int findMax(Node2 root){

        while(root.right != null)
            root = root.right;

        return root.data;
    }

    public static void main(String[] args){

        BSTMinMax tree = new BSTMinMax();

        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 70);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 80);

        System.out.println("Minimum value: " + tree.findMin(tree.root));
        System.out.println("Maximum value: " + tree.findMax(tree.root));
    }
}