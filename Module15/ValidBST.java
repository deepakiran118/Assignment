package Module15;

class Node4 {
    int data;
    Node4 left, right;

    Node4(int value){
        data = value;
        left = right = null;
    }
}

public class ValidBST {

    Node4 root;

    boolean isBST(Node4 root, int min, int max){

        if(root == null)
            return true;

        if(root.data <= min || root.data >= max)
            return false;

        return isBST(root.left, min, root.data) &&
                isBST(root.right, root.data, max);
    }

    public static void main(String[] args){

        ValidBST tree = new ValidBST();

        tree.root = new Node4(50);
        tree.root.left = new Node4(30);
        tree.root.right = new Node4(70);
        tree.root.left.left = new Node4(20);
        tree.root.left.right = new Node4(40);

        if(tree.isBST(tree.root, Integer.MIN_VALUE, Integer.MAX_VALUE))
            System.out.println("Valid BST");
        else
            System.out.println("Not a BST");
    }
}