package ch15.sec06.exam01;

import java.util.Arrays;
import java.util.Stack;

public class BackspaceStringCompare {
    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ad#c";
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        boolean answer = true;

        char[] char1 = s.toCharArray();
        char[] char2 = t.toCharArray();

        for (char c : char1) {
            if (!(c == '#')) {
                stack1.push(c);
            } else {
                stack1.pop();
            }
        }

        for (char c : char2) {
            if (!(c == '#')) {
                stack2.push(c);
            } else {
                stack2.pop();
            }
        }
        if (stack1.size() != stack2.size()) {
            answer = false;
        }
        for (int i = 0; i < stack1.size(); i++) {
            if (!stack1.get(i).equals(stack2.get(i))) {
                answer = false;
            }
        }
        System.out.println(answer);
        ;
    }
}
