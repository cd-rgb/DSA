package stack;

import java.util.*;

public class Implementation {
    public static void addtobottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        addtobottom(s, data);
        s.push(top);
    }

    public static void reverseStack(Stack<Integer> s) {
        if (s.isEmpty()) {

            return;
        }
        int top = s.pop();
        reverseStack(s);
        addtobottom(s, top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(12);
        s.push(11);
        s.push(10);

        reverseStack(s);

        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

}
