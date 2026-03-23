package Module13;

class QueueArray {
    int front = 0, rear = -1;
    int[] q = new int[5];

    void enqueue(int x) {
        if (rear == 4) return;
        q[++rear] = x;
    }

    void dequeue() {
        if (front > rear) return;
        front++;
    }

    void display() {
        for (int i = front; i <= rear; i++)
            System.out.print(q[i] + " ");
    }

    public static void main(String[] args) {
        QueueArray q = new QueueArray();
        q.enqueue(10);
        q.enqueue(20);
        q.display();
    }
}

