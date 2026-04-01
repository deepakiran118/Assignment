package Module15;

class Node1 {
    int data;
    Node1 left, right;

    Node1(int value){
        data = value;
        left = right = null;
    }
}

public class BSTSearch {

    Node1 root;

    Node1 insert(Node1 root, int key){
        if(root == null)
            return new Node1(key);

        if(key < root.data)
            root.left = insert(root.left, key);
        else
            root.right = insert(root.right, key);

        return root;
    }

    boolean search(Node1 root, int key){

        if(root == null)
            return false;

        if(root.data == key)
            return true;

        if(key < root.data)
            return search(root.left, key);
        else
            return search(root.right, key);
    }

    public static void main(String[] args){

        BSTSearch tree = new BSTSearch();

        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 70);

        int key = 30;

        if(tree.search(tree.root, key))
            System.out.println("Element found");
        else
            System.out.println("Element not found");
    }
}