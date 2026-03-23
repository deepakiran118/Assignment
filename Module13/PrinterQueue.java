package Module13;

import java.util.*;

class PrinterQueue {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();

        q.add("File1");
        q.add("File2");
        q.add("File3");

        while (!q.isEmpty()) {
            System.out.println("Printing: " + q.poll());
        }
    }
}
