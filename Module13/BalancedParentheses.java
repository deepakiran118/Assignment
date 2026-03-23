package Module13;

import java.util.*;

class BalancedParentheses {
    public static void main(String[] args) {
        String str = "{[()]}";
        Stack<Character> s = new Stack<>();
        boolean balanced = true;

        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[')
                s.push(ch);
            else {
                if (s.isEmpty()) {
                    balanced = false;
                    break;
                }
                char top = s.pop();
                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    balanced = false;
                    break;
                }
            }
        }

        if (!s.isEmpty()) balanced = false;

        System.out.println(balanced ? "Balanced" : "Not Balanced");
    }
}

