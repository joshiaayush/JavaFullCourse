package collectionframework;

import java.util.LinkedList;

public class LinkedLIstMethods {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(15);
        list.offer(12);
        list.addFirst(11);
        list.addLast(16);
        System.out.println(list);

    }
}
