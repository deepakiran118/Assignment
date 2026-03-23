package Module12;

class InsertAtBeginning {
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    static Node insertBegin(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
    }

    public static void main(String[] args) {
        Node head = new Node(20);
        head.next = new Node(30);

        head = insertBegin(head, 10);

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}