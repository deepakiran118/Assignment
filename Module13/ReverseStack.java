package Module13;

import java.util.*;

class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        Collections.reverse(s);
        System.out.println(s);
    }
}
