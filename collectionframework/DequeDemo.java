package collectionframework;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.add(10);
        deque.add(20);
        deque.add(30);
        deque.add(40);
        deque.add(50);
        deque.add(60);
        deque.add(70);

        System.out.println(deque.remove());
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
        System.out.println(deque.pop());
        System.out.println(deque.pop());
        System.out.println(deque.toString());


    }
}
