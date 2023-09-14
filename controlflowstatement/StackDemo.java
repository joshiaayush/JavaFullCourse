package controlflowstatement;

import java.util.Stack;
import java.util.TreeMap;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack.firstElement());
        System.out.println(stack.empty());
        System.out.println(stack.search(40));
        System.out.println(stack.pop());
        System.out.println(stack.capacity());
        System.out.println(stack.clone());



    }
}
