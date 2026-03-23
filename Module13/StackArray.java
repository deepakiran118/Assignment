package Module13;

class StackArray {
    int top = -1;
    int[] stack = new int[5];

    void push(int x) {
        if (top == 4) return;
        stack[++top] = x;
    }

    void pop() {
        if (top == -1) return;
        top--;
    }

    void display() {
        for (int i = top; i >= 0; i--)
            System.out.print(stack[i] + " ");
    }

    public static void main(String[] args) {
        StackArray s = new StackArray();
        s.push(10);
        s.push(20);
        s.display();
    }
}
